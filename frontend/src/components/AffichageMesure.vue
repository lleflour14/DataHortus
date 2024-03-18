<script setup>
//import { defineEmits, defineProps } from "vue";
//defineProps(["mesure"]);
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
