<!-- eslint-disable no-undef -->
<script setup>
import Capteur from "@/Capteur";
import Mesure from "@/Mesure";
import { reactive, onMounted } from "vue";


//la liste de tous les capteurs (avec ses mesures associés)
const listCapt = reactive([]);
const listeG_Temp = reactive([]);
const listeG_Hum = reactive([]);
const listeG_Lum = reactive([]);


const url= "http://localhost:8989/api";

//récupérer ces capteurs
function getCapteurs(){
    const fetchOptions = { method: "GET" };
  fetch(url+ "/capteurs", fetchOptions)
    .then((response) => {
      return response.json();
    })
    .then((dataJSON) => {
      let listActu = reactive([]);
      for (let capt of dataJSON._embedded.capteurs){
        if (capt.grandeur=='Température' ) {
            listActu=listeG_Temp;
        } else if (capt.grandeur=='Humidité') {
            listActu=listeG_Hum;
        } else {
            listActu=listeG_Lum
        }
        getMesures(capt._links.mesures,listActu);

        listCapt.push(new Capteur(capt.id, capt.grandeur,listActu));

            }
      console.log(listCapt);
    })
    .catch((error) => console.log(error));
}


//récupérer ces mesures (d'un certain capteur)
function getMesures(urlM,liste){
  const fetchOptions = { method: "GET" };
  fetch(urlM.href, fetchOptions)
    .then((response) => {
      return response.json();
    })
    .then((dataJSON) => {
      console.log(dataJSON._embedded.mesures);
      for (let mes of dataJSON._embedded.mesures){
        liste.push(new Mesure(mes.id, mes.valeur,mes.dateMesure));
            }
        
    })
    .catch((error) => console.log(error));
}


onMounted(() => {
    getCapteurs();
});
</script>


<template>
    <li>
        <div class="cadreIconSerre">
            <img class="iconMesure" src="\src\assets\température.png"></img>
        </div>
        <p class="txt">Température : 17°C</p>
    </li>
    <li>
        <div class="cadreIconSerre">
            <img class="iconMesure" src="\src\assets\humidité.png"></img>
        </div>
        <p class="txt">Humidité : 12%</p>
    </li>
    <li>
        <div class="cadreIconSerre">
            <img class="iconMesure" src="\src\assets\luminosité.png"></img>
        </div>
        <p class="txt">luminosité</p>
    </li>
    
</template>

<style>
.iconMesure{
    max-height: 100px;
}
li {
    display: flex;
    align-items: center;
}
.cadreIconSerre {
    height: 100px;
    width: 100px;
    /* marges */
    margin: 10px;
}
.txt {
    background-color: #3A5A40;
    color: white;
    padding: 5px;
    padding-left: 10px;
    padding-right: 10px;
    width: 300px;
}

</style>
