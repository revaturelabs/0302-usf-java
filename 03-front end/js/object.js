// console.log('hey');

// const o = new Object();
// o.__proto //-> the prototype of the object

const boat = {
    name: 'suzie q',
    length: 50,
    color: 'pink',
    hasSail: true,
    holes: 0
};

// to access properties off of our object, we use dot notation
// console.log(boat.color);

//we can also access them with subscript notation
// console.log(boat['name']);
const len = 'length';
// console.log(boat[len]);

function getProp(prop){
    return boat[prop];
}
// console.log(getProp('name'));

function drill(){
    this.holes++;
}

boat.drillHoles = drill;

