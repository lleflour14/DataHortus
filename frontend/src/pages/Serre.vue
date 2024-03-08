<template>
<div class="serre">
    <ul>
    <AffichageMesure/>
    </ul>
    <!-- ligne verte claire, noshade desactive l'effet d'ombre-->
    <hr noshade>
</div>

</template>

<script setup>
import AffichageMesure from "../components/AffichageMesure.vue";
</script>

<style>
ul {
    display: inline-block;
}
hr {
    color: #A3B18A;
    height: 20px;
    width: 200%; /* car la ligne était trop petite à 100 et pour la faire dépasser des deux cotés*/
    background-color: #A3B18A;
    position: relative; 
    left: -50%;    /*pour faire depasser la ligne à gauche*/
}
</style>