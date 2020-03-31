// console.log('hello js');
// single line comment in js
/* multi line comment in js */

/* 
    javascript...is not java...in no way shape or form

    a few things about it
        it is a programming language
        it is also a scripting language
        it is interpreted
            it is never compiled, but read line by line by the interpreter
        it is loosely typed
            we dont have to give variables data types and an switch
                freely between them
        it uses dynamic type checking
            it checks for data types at runtime
*/

/* 
    data types
        string, boolean, number, object, function, symbol, null, undefined

*/

/* 
    variable declarations
        var name = 'john';      global and function scope
        let name = 'john';      global, function, and block scope
        const name = 'john';    constant, cannot be reassigned

*/

/* 
    naming conventions
        can start with $,_, or a letter
        they cannot be reserved keywords
        variable and function names are camelCase
        constant names are UPPERCASE

*/

/* 
    operators
        unary, binary, ternary
            all the same as java except
                unary
                    ++x     pre increment
                    --x     pre decrement
                    x++     post increment
                    x--     post decrement
                    typeof  returns the type of the operand
                    +x      returns the numeric representation of the operand
                    isNaN()   returns whether the operand is not a number

                binary
                    +       addition and string concatenation
                    =       assignment operator
                    ==      comparison operator with type coersion
                    ===     comparison operator without type coersion (strict comparison)
                    !=
                    !==
                ternary
                '   ? :     ternary operator

*/

/* 
    5 == 5 //->true
    5 == '5' //-> true

    5 === 5 //-> true
    5 === '5' //-> false

    +6 //-> 6
    -6 //-> -6
    +'6' //-> 6
    +'5g' //-> NaN

    NaN //-> Not a Number
    typeof NaN //-> number

*/

// let b = NaN;
// if(b){
//     console.log("its true");
// } else {
//     console.log("it is false");
// }

/* 
    js has truthy and falsey values
        falsey values
            false
            0
            null
            ""
            undefined
            NaN
        truthy values
            anything that isnt falsey

*/

/* 
    scopes of js
        global
        function
        block       introduced in 2015, es6 (EcmaScript version 6)
*/

// var test = true;                //global
// let test = true;                //global
const test = true;              //global
function f1(){
    // let inner = 'speak';        //function
    // const inner = 'speak'       //function
    var inner = 'speak';        //function
    if(test){
        const yell = 'panic';   //local/block
        // let yell = 'panic';     //block
        // var yell = 'panic';     //function, dont do this
        // yell = 'panic';         //global, dont do this
    }
    // console.log(yell);
}
f1();
// console.log(yell);


//example of scopes, where does the cat die?
// function killCat() {
//     // const cat = "jeff";
//     if (true) {
//         // const cat = "jeff";
//         console.log(cat);
//     }
//     // console.log(cat);
// }
// const cat = "jeff";
// killCat();

// console.log(cat);

//this is how we write strings
const stringy = "these are normal strings, they are interchangeable with '' and "+
    "these can be used with each other to denote quotes. such as...my momma said "+
    "'foolsball is the devil'. we can also use the escape character '\'. if you want"+
    " to go to another line, you have to concatenate. if you want a new line in the printed"+
    " text, use a new line escape character: '\n'. if we want to add in variables, we "+
    "concatenate them like this: "+test+" to get the variable value."

// console.log(stringy);

//unless
//  since es6, we have backticks and template literals

const backies = `these are backticks. here we can go to the next line with out having
    to concatenate. also if we want arithmetic or variables, instead of concatenation
    we can use literals like so ${test +''+ (1+1)}. also the same escape characters 
    work\n next line`;

console.log(backies);