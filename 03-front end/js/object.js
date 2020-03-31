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


//this is a class in js
function Person(name, age){
    this.name=name;
    this.age=age;
    this.sayHello = function (){
        console.log('saying hello')
    };
    this.toString = function (){
        return `this is me, my name is ${this.name}, and I am ${this.age}`
    }
}
const person = new Person('mr meeseeks',77);

//this is sugar syntax for making a class in js
class Person2 {
    constructor(name, age){
        this._name = name;
        this.age=age;
    }
    toString(){
        return 'this is me';
    }
    get bigName(){
        console.log('this is the getter');
        return this._name.toUpperCase();
    }
    get name(){
        return this._name;
    }
    set name(name){
        this._name = name;
    }
    

}
const p = new Person2('rick',89);