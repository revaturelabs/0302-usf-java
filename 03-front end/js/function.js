//functions
function fun() {
  console.log("js is fun");
}
// fun();

function fun2(something) {
  console.log(typeof something);
}
// fun2(5);     //->number
// fun2('4');   //->string
// fun2(drill)  //->function
// fun2(function hey(){return 'hey'})  //->function
// fun2(function (){return 'hey'}) //->function

const fun3 = function() {
  return 4;
};

// console.log(fun3()); //->4

//arrow function

const fun4 = () => {
  return 6;
};

// fun4(); //->6

const fun5 = () => 5;

// fun5() //->5

const fun6 = prop => console.log(prop);
//this is the same thing as:

// function fun6(prop) {
//     console.log(prop);
// }

// fun6('hey')   //-> hey

const fun7 = prop => console.log(prop);

// fun7('hey')  //-> hey

//callback functions

function callThis(callback) {
  return callback();
}

// callThis(fun);
// callThis(function (){
//     console.log('this is anonymous')
// })

// callThis(()=>console.log('this is an arrow function being called'))

//IIFE
//Immediately Invokable Function Expression
(function() {
  //   console.log("iife activated");
})();

//closures
//we can achieve encapsulation inside js with closures
//closure, no negative miles!!!
const driveCar = (function() {
  let miles = 0;
  //   console.log("car purchased");
  return function nested(driven) {
    // console.log(`car driven ${driven}`);
    miles += driven > 0 ? driven : 0;
    return miles;
  };
})();

const miners = (function() {
  return 6;
})();

//no encapsulation, we can have negative hamburgers!!!
let hamburgers = 0;
const makeHamburgers = function() {
  hamburgers++;
};

//rest parameters
function varArg(...rest) {
  return rest;
}
// console.log(varArg(1,2,3,3,2,22,3,4,2,2,3,3))
const arr1 = varArg(356536, 54634573, 765676458, 6848);

//spread operator
const arr2 = [1, 2, 3, ...arr1];
console.log(arr2);

//does js support function overloading?
//  no

//default parameters

// function a1(a) {
//   return a;
// }
// function a1(a, b) {
//   return b;
// }
var a1 = function (a,b,c=3){
    return c;
}

