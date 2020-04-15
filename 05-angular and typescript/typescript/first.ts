/* 

we need to transpile our typescript into 
    javascript. Transpiling is the act of
    changing code from one language into another.
    we use "tsc [filename]"
    there are also options for the compiler 

what is typescript?
    it is a superset of javascript
        anything you can do in js, you
        can do in ts. It adds additional
        features and syntax
    made by Microsoft
    TS was developed for larger applications. The
        syntax is closer to other languages
        such as java or c#

typescript defaults to es5 javascript
    we have different options to change the way it transpiles
        --target [es6,7,8,...,next]
*/

console.log('hello typescript');
const hhey = "helloo"; 

/* 
    what are the datatypes in typescript?
        string, number, boolean, undefined, null, object, function,
            symbol, array, enum, void, any, tuple, never

*/

//typescript will infer the type
const s1 = "stringy";
//but we can declare the type
let x:number = 7;
// x="stringy";
//any means any data type
let js:any = 'stringy';
js = 6;
//boolean
let boo:boolean=true;
//null
let nul:null=null;
//undefined
let undies:undefined=undefined;
//never
let no:never;
//arrays
let ar1 : string[];
ar1=['gg','sgser','fsgdsfg'];

let ar2:number[]=[1,2,3,4,5,5,3,2];

enum weekdays {
    MONDAY=2,
    TUESDAY=3,
    WEDNESDAY=4,
    THURSDAY=5,
    FRIDAY=6,
    SATURDAY=7,
    SUNDAY=1
}

let myEnum:weekdays=weekdays.FRIDAY;

//tuple
//fixed size and datatype array
let tul:[string, boolean, number][];
tul = [["theo",true, 899],["tyisha",false, 457]];
tul.push(['chris c', false, 258]);
//function
//this is the js way of doing things...it still applies
function myFun(){
    return 5;
}

//this is the ts way
function myFun2():number{
    return 5;
}

function myFun3(num:number):number{
    return num;
}

const valentin:Function = () => 5;
//in ts, we can do INTERFACES
interface magicians {
    name:string;
    tricks:number;
    yellAtchildrenAtParty():never;
    increaseScarinessFactor(num:number): number;
}

class MagiciansforChildren implements magicians {
    constructor(
        _name:string,
        _tricks:number,
        _doTrick:Function
    ){
        this.name=_name;
        this.tricks=_tricks;
        this.doTrick=_doTrick;
    }
    name: string;
    tricks: number;
    yellAtchildrenAtParty(): never {
        throw new Error(`children are freaked out like crazy, they are asking
            their mother to leave, but they are also freaked out by the scary snake
            clown magicians that they dont know what to do either. so they grab
            the shovel and start trying to dig their way out of here. but they cant...
            because the magician has turned it into a balloon animal. so now the kids
            are afraid to play with the snake clown magician balloon animal and they 
            just want to leave dangit. so here we go, running for our lives
            from a crazy magician while the car salesman down the road swindles 
            another person out of their hard earned money for a lemon the original
            owner didnt even want.`);
    }
    increaseScarinessFactor(num: number): number {
        console.log("are we happy yet???")
        return num;
    }
    doTrick:Function;
}

const andre = new MagiciansforChildren("andre", 10, ()=>console.log('i hate children...aaaaaahhhhhhhh'));
andre.yellAtchildrenAtParty();