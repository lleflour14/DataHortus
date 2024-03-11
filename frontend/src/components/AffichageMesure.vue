<script setup>
//import { defineEmits, defineProps } from "vue";
//defineProps(["mesure"]);
</script>


<template>
    
    <li>
        <div class="cadreIconSerre">
            <img class="iconMesure" src="\src\assets\température.png"></img>
        </div>
        <p class="txt">température</p>
    </li>
    <li>
        <div class="cadreIconSerre">
            <img class="iconMesure" src="\src\assets\humidité.png"></img>
        </div>
        <p class="txt">humidité</p>
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
    height: 100px;
}
li {
    display: flex;
    align-items: center;
}
.cadreIconSerre {
    height: 100px;
    width: 100px;
}
.txt {
    background-color: #3A5A40;
    color: white;
}

</style>
