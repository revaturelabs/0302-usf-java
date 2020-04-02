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

function call() {
  console.log("here");
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
const buttons = document.getElementsByTagName("button");
buttons[0].innerHTML = "this is from the js file";

document.getElementById("alter1").setAttribute("class", "btn btn-info");

document.getElementById("alter2").setAttribute("onclick", "colorChange()");

document.getElementById("alter2").style.backgroundColor = "red";
let color = ["green", "yellow", "orange", "grey", "purple", "red"];
let i = 0;
function colorChange() {
  document.getElementById("alter2").style.backgroundColor = color[i];
  i++;
  if (i > 5) {
    i = 0;
  }
}

const divs = document.getElementsByTagName("div");

function divAlert(event) {
  alert(`target: ${event.target.id} ~~~~ this: ${this.id}`);
  // event.stopPropagation();
}

for (let item of divs) {
  // item.addEventListener('click',divAlert);
  item.addEventListener("click", divAlert, { capture: true }); //this is for capturing,
  //you can also just put true
}
//let config = document.getElementById('text').value;

document.getElementById("changeMe").addEventListener("click", function() {
  this.value = document.getElementById("text").value;
});

{
  /* <input type="text" id="text" placeholder="type here"><br>

<input type='submit' class="btn btn-primary" id='changeMe' value="change me"><br> */
}

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

function money() {
  a = "Dollar";
  b = "Euro";
  return a, b;
  // return b;
}

// <!-- add an event listener to this image so that everytime the mouse enters
//         it, it will change images. add an input field to add image urls to
//         the image list. -->

document.getElementById("image").addEventListener("mouseover", changeImage);

let imageList = [
  "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTCQlo1xt7ScPR94ZUM70j9kx3kkQmBAt9mNLdoY7KJSakQ6BQB&usqp=CAU",
  "https://i.kym-cdn.com/photos/images/newsfeed/001/505/718/136.jpg",
  "https://assets3.thrillist.com/v1/image/2824030/size/tl-horizontal_main_2x.jpg",
  "https://cdn.mos.cms.futurecdn.net/7cS2DrDAMFRQSMpMyfFDvW-650-80.jpg"
];

function changeImage() {
  image.src = imageList[i % imageList.length];
  i++;
}

document.getElementById("changeImage").addEventListener("click", addImage);
function addImage() {
  imageList.push(document.getElementById("text1").value);
}

// <!-- make this table dynamic. create an object array and fill the table
//         with the objects in that array. then make input fields so that
//         you can add new objects to the array and the table will be updated. -->

let table = document.getElementById("alterTable");
table.setAttribute('border', '100px');
let tableButton = document.getElementById("tableButton");

tableButton.addEventListener("click", updateTable2);

function updateTable() {
  let textId = document.getElementById("textId").value;
  let textName = document.getElementById("textName").value;
  let textPhone = document.getElementById("textPhone").value;
  let textAddress = document.getElementById("textAddress").value;

  table.innerHTML =
    table.innerHTML +
    `
<tr>
    <td>${textId}</td>
    <td>${textName}</td>
    <td>${textPhone}</td>
    <td>${textAddress}</td>
</tr>
`;
}

let tableArray = [];
let tableCounter = 1;
function updateTable2() {
  let myTable = {
    Id: document.getElementById("textId").value,
    Name: document.getElementById("textName").value,
    Phone: document.getElementById("textPhone").value,
    Address: document.getElementById("textAddress").value
  };
  tableArray.push(myTable);
  console.table(tableArray);
  let myTableRow = table.insertRow(tableCounter)
  myTableRow.insertCell(0).innerHTML = tableArray[tableCounter-1].Id;
  myTableRow.insertCell(1).innerHTML = tableArray[tableCounter-1].Name;
  myTableRow.insertCell(2).innerHTML = tableArray[tableCounter-1].Phone;
  myTableRow.insertCell(3).innerHTML = tableArray[tableCounter-1].Address;
  tableCounter++;

}

// let tableCounter=1;

// function updateTable(){
//     let rowInsert = document.getElementById('alterTable').insertRow(tableCounter);
//     rowInsert.insertCell(0).innerHTML = myTable[0][0];
//     rowInsert.insertCell(1).innerHTML = myTable [0][1];
//     rowInsert.insertCell(2).innerHTML = myTable[0][2];
//     rowInsert.insertCell(3).innerHTML = myTable[0][3];
//     tableCounter++;
// }

// let rowInsert = document.getElementById('alterTable').insertRow(1);
// rowInsert.insertCell(0).innerHTML = '1';
// rowInsert.insertCell(1).innerHTML = 'Allen';
// rowInsert.insertCell(2).innerHTML = '1-314-522-0047';
// rowInsert.insertCell(3).innerHTML = '7226 Berkridge dr';
