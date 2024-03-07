<template>
<div class="serre">
    <v-container>Serre</v-container>
    <ul>
    <AffichageMesure/>
    </ul>
</div>

</template>

<script setup>
import AffichageMesure from "../components/AffichageMesure.vue";
</script>

<style>
ul {
    display: inline-block;
    align:left;
}
</style>