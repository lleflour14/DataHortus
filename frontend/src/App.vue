<template>
  <v-app>
    <v-overlay
      v-model="overlayActive"
      scrim="rgb(58, 90, 64)"
      opacity="solid"
    >
    </v-overlay>
    <!-- une barre de navigation -->
    <v-app-bar
      color="rgb(58, 90, 64)"
      density="compact">

      <v-img
        position="left"
        :height="100"
        aspect-ratio="1/1"
        src="\src\assets\mini_logo.png"
      ></v-img>
      <v-btn to="/Serre">Serre</v-btn>
      <v-btn to="/Pilotage">Pilotage</v-btn>
      <v-btn to="/Historique">Historique</v-btn>
    </v-app-bar>
    <!-- la zone où sera affichée les différentes "pages"-->
    <v-main>
      <v-container class="page">
        <!-- les "composant view" s'afficheront ici -->
        <RouterView />
      </v-container>
      
    </v-main>
  </v-app>
</template>

<script setup>

import { ref } from 'vue';
const overlayActive = ref(true); // Overlay actif par défaut
</script>

<style scoped>
.page {
  text-align: center;
}
</style>
