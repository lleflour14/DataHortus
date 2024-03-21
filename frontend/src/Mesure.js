export default class Mesure {
    constructor(id, valeur, dateMesure) {
      this._id = id;
      this._valeur = valeur;
      this._dateMesure = dateMesure;
    }
    get valeur() {
      return this._valeur;
    }
    get id() {
      return this._id;
    }
    get dateMesure() {
      return this._dateMesure;
    }
  }
  