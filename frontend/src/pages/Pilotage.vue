<template>
    <!--Form-->
    <div class="bouttonsDaffichage">
      <button type="button" for="automatique" class="boutonPage automatique actif" @click="afficherAutomatique()">Automatique</button>
      <button type="button" for="manuel" class="boutonPage manuel" @click="afficherManuel()">Manuel</button>

    </div>
    <div class="form-u">
      <div class="form" id="automatique">
        <p class="test">auto</p>
      </div>
      <div class="form" style="display:none;" id="manuel">
        <p class="test">manu</p>
      </div>
    </div>
</template>

<script setup>

function afficherAutomatique() { //permet de changer le contenu de la page
    const auto = document.querySelector(".boutonPage.automatique");
    const manuel = document.querySelector(".boutonPage.manuel");
    manuel.classList.remove("actif");
    auto.classList.add("actif");
    document.querySelector(`#${manuel.getAttribute("for")}`).style.display = "none";
    document.querySelector(`#${auto.getAttribute("for")}`).style.display = "";
}
function afficherManuel() { //permet de changer le contenu de la page
    const auto = document.querySelector(".boutonPage.automatique");
    const manuel = document.querySelector(".boutonPage.manuel");
    auto.classList.remove("actif");
    manuel.classList.add("actif");
    document.querySelector(`#${auto.getAttribute("for")}`).style.display = "none";
    document.querySelector(`#${manuel.getAttribute("for")}`).style.display = "";
}
</script>
<style>


.bouttonsDaffichage {
  text-align: center;
  padding-top: 50px;
  width: 100%;
}

.boutonPage {
  color: white;
  background-color: #A3B18A;
  width: 50%;
  display: inline-block;
  line-height: 40px;
  cursor: pointer;
}

.boutonPage {
  background: #A3B18A;
  color: white;
  transition: 0.5s;
}


/* Bouton actif */

.bouttonsDaffichage .actif {
  background-color: #3A5A40;
  color: white;
}

</style>