//create a class for the pokemon
//  it should have a name 
//  an array of ability names,
//  string array of images
//  an array of the names of the types
//
//use ajax to get the pokemon from the api,
//  use the json to construct the pokemon
//  object, and print the information to the screen.
//  it should be formatted to be presentable,
//  and should show the images as images, not urls

document.getElementById('pksubmit').addEventListener('click', getPk);

function getPk(){
    const pkid = document.getElementById('pkid').value;
    fetch('https://pokeapi.co/api/v2/pokemon/'+pkid)
    .then(response => response.json())
    .then(json => implant(json));
}

function implant(pk){
    console.log(pk);
    document.getElementById('pkInfo').innerHTML = pk.name;

}

class Pokemon {
    constructor(name, abilities, image, types){
        this.name = name;
        this.abilities = abilities;
        this.image = image;
        this.types = types;
    }

    get name () {
        return this.name
    }
    set name (name) {
        this._name = name;
    }

    get abilities () {
        return this.abilities
    }
    set abilities (abilities) {
        this._abilities = abilities;
    }

    get image () {
        return this.image
    }
    set image (image) {
        this._image = image;
    }

    get types () {
        return this.types
    }
    set types (types) {
        this._types = types;
    }
}


function displayPokemons(pk){
    let name1 = document.getElementById('pkInfo').innerHTML.pk.name;
    let ability1 = document.getElementById('pkInfo').innerHTML.pk.abilities;
    let image1 = document.getElementById('pkInfo').innerHTMLpk.sprin;
    let type1 = document.getElementById('pkInfo').innerHTML.pk.type;
    const Poke = new Pokemon(name1, ability1, image1, type1);
}



console.log(Poke);

