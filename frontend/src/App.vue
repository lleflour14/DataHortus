<template>
  <v-app>
    <!-- ecran d'acceuil : scrim pour l'arriere plan, actif si v-model=true -->
    <v-overlay
      v-model="actif"
      scrim="#3A5A40"
      opacity="solid"
      width="100%"
      height="100%"
      close-on-content-click
    >
    <v-img
      src="/src/assets/grand_logo.png"
    ></v-img>
    </v-overlay>
    <!-- une barre de navigation -->
    <v-app-bar
      color=#3A5A40
      density="compact">
      <v-img
        position="left"
        src="\src\assets\mini_logo.png"
      ></v-img>
      <!-- les trois boutons du haut-->
      <v-btn to="/Serre"  :ripple="false"  >Serre</v-btn>
      <v-btn to="/Pilotage"  :ripple="false"  >Pilotage</v-btn>
      <v-btn to="/Historique"  :ripple="false"  >Historique</v-btn>
      <!-- il faut ajouter un element à gauche pour pouvoir centrer les boutons-->
      <v-img src=""></v-img>
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
const actif = ref(true); // Overlay actif par défaut
</script>

<style scoped>
.page {
  text-align: center;
}


</style>
