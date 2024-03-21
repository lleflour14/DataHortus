export default class Capteur {
    constructor(id, grandeur, listeMesures) {
      this._id = id;
      this._grandeur = grandeur;
      this._listeMesures = listeMesures;
    }
    get grandeur() {
      return this._grandeur;
    }
    get id() {
      return this._id;
    }
    get listeMesures() {
      return this._listeMesures;
    }
  }
  