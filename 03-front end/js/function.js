//functions
function fun(){
    console.log('js is fun')
}
// fun();

function fun2(something){
    console.log(typeof something)
}
// fun2(5);     //->number
// fun2('4');   //->string
// fun2(drill)  //->function
// fun2(function hey(){return 'hey'})  //->function
// fun2(function (){return 'hey'}) //->function

const fun3 = function (){
    return 4;
}

// console.log(fun3()); //->4

//arrow function

const fun4 = () => {
    return 6;
}

// fun4(); //->6

const fun5 = () => 5;

// fun5() //->5

const fun6 = (prop) => console.log(prop);
//this is the same thing as:

// function fun6(prop) {
//     console.log(prop);
// }

// fun6('hey')   //-> hey


const fun7 = prop => console.log(prop);

// fun7('hey')  //-> hey

