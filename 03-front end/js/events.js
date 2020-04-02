/* 
    we can create event handlers to handle the events associated
        with the elements. when we give these events handlers, we
        are essentially attaching functions to the element objects.
*/

/* 
    a few events to remember:
        mouseover, click, dblClick, keyDown, keyUp,
        mousewheel, onload, scroll, change, mouseout
*/

function call(){
    console.log('here');
}


/* 
    what does dom stand for?
        document object model
        the virtual representation of the document (html)
        in object form
*/


/* 
    we have three special ways we can manipulate the dom
        find elements
            document.getElementsByTagName(tagName)
            document.getElementsByClassName(className)
            document.getElementById(idName)
        change elements
            element.attribute = value
            element.innerHTML = value
            element.setAttribute(attribute, newValue)
            element.style.property=value
        add and remove elements
            document.write(text)
            document.createElement(element)
            element.appendChild(element)
            element.removeChild(element)
            element.replaceChild(element)
*/
const buttons = document.getElementsByTagName('button');
buttons[0].innerHTML='this is from the js file';


document.getElementById("alter1").setAttribute("class",  "btn btn-info");

document.getElementById("alter2").setAttribute("onclick","colorChange()");

document.getElementById("alter2").style.backgroundColor='red';
let color=['green','yellow','orange','grey','purple','red'];
let i=0;
function colorChange(){
    
    document.getElementById("alter2").style.backgroundColor=color[i];
    i++;
    if(i>5){i = 0;}
}

const divs = document.getElementsByTagName('div');

function divAlert(event){
    alert(`target: ${event.target.id} ~~~~ this: ${this.id}`);
    // event.stopPropagation();
}

for(let item of divs){
    // item.addEventListener('click',divAlert);
    item.addEventListener('click',divAlert, {capture:true}); //this is for capturing,
                                                        //you can also just put true
}
//let config = document.getElementById('text').value;

document.getElementById('changeMe').addEventListener('click',function(){
    this.value = document.getElementById("text").value;
});


{/* <input type="text" id="text" placeholder="type here"><br>

<input type='submit' class="btn btn-primary" id='changeMe' value="change me"><br> */}


/*

    when an event happens on an html, it first runs the handler
        associated with it, then its parent, then so on.

        event.stopPropagation() will stop bubbling.

    the opposite of this is called capturing. this is where an event 
        happens on an html element, it runs the hanfler on its parents
        moving inward to the element that was clicked.

    for more information:
        https://javascript.info/bubbling-and-capturing

*/

function money(){
    a = "Dollar";
    b="Euro";
    return a,b;
    // return b;
}