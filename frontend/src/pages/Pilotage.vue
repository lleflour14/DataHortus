<template>
    <!--Form-->
    <div class="bouttonsDaffichage">
      <button type="button" for="automatique" class="boutonPage actif" @click="afficher()">Automatique</button>
      <button type="button" for="manuel" class="boutonPage cache" @click="afficher()">Manuel</button>

    </div>
    <div class="form-u">
      <div class="form" id="automatique">
        <p class="test">aaaaaaaaaaaaaaaaaaaaaaaaa</p>
      </div>
      <div class="form" style="display:none;" id="manuel">
        <p class="test">bbbbbbbbbbbbbbbbbbbbbbbbb</p>
      </div>
    </div>
</template>

<script setup>
function afficher() { //permet de changer le contenu de la page
    const nouvelActif = document.querySelector(".boutonPage.cache");
    const ancienActif = document.querySelector(".boutonPage.actif");

    nouvelActif.classList.remove("cache");
    nouvelActif.classList.add("actif");

    ancienActif.classList.remove("actif");
    ancienActif.classList.add("cache");

    document.querySelector(`#${ancienActif.getAttribute("for")}`).style.display = "none";
    document.querySelector(`#${nouvelActif.getAttribute("for")}`).style.display = "";
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

.bouttonsDaffichage .actif,
.boutonPage:hover {
  background-color: #3A5A40;
  color: white;
}

</style>