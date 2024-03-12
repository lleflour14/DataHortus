<script setup>
//import { defineEmits, defineProps } from "vue";
//defineProps(["mesure"]);
</script>


<template>
    <li class="LigneMachine">
        <div class="cadreIconMachines">
            <img class="iconMachine" src="\src\assets\volet_fermé.png"></img>
        </div>
        <p class="actif">Eteint</p>
    </li>
    <li class="LigneMachine">
        <div class="cadreIconMachines">
            <img class="iconMachine" src="\src\assets\lumière_éteinte.png"></img>
        </div>
        <p class="actif">Eteint</p>
    </li>
    <li class="LigneMachine">
        <div class="cadreIconMachines">
            <img class="iconMachine" src="\src\assets\ventilateur_éteint.png"></img>
        </div>
        <p class="actif">Eteint</p>
    </li>
    <li class="LigneMachine">
        <div class="cadreIconMachines">
            <img class="iconMachine" src="\src\assets\chauffage_éteint.png"></img>
        </div>
        <p class="actif">Eteint</p>
    </li>
    <li class="LigneMachine">
        <div class="cadreIconMachines">
            <img class="iconMachine" src="\src\assets\arrosage_éteind.png"></img>
        </div>
        <p class="actif">Eteint</p>
    </li>
</template>

<style>

.actif {
    width: 120px;
    /* bordures */
    border:solid #3A5A40;
    border-radius: 30px;
    /* marges */
    margin: 25px;
    margin-top: 10px;
}
.LigneMachine{
    display:inline-block;

}
.cadreIconMachines{
    height: 120px;
    width: 120px;
    /* images au centre du cadre */
    display: flex;
    justify-content: center; 
    align-items: center;
    /* marges */
    margin: 25px;
    margin-bottom: 10px;
}
.iconMachine{
    max-width: 100px;
    max-height: 100px;
}
</style>
