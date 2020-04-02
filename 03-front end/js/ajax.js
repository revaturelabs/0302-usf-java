function getPk(){
    const pkid = document.getElementById('pkid').value;

    /* 
        what is ajax?
            Asynchronous Javascript And Xml
        There are 4 steps to implementing ajax
    */

    /* 
        step 1
            the following object allows us to make requests over
                http and get data back. This is our data retriever.
    */
   const xhr  = new XMLHttpRequest();

   /* 
        step 2
            add an event listener
   */
  xhr.onreadystatechange = function (){
    // console.log('the ready state is changing')
    if(xhr.readyState==4 && xhr.status==200){
        console.log('we are ready');

        /* 
            what is the ready state?
                the state of the request
            what is the status code?
                http status code, the condition of the response

            status codes:
                100 = informational
                200 = ok
                300 = redirect
                400 = client side errors
                500 = server side errors

            0 = request has not been initialized
            1 = server connection has been established
            2 = request received
            3 = processing request
            4 = request has finished and the response is ready

        */

        // const pk = JSON.parse(xhr.responseText);
        console.log(xhr.responseText);

    }
  }

  /* 
    step 3
        create a connection
  */
  xhr.open('GET','http://pokeapi.co/api/v2/pokemon/'+pkid);

/* 
  step 4
    send the request to retrieve information
*/
xhr.send();




}

function pk2(){
    const pkid = document.getElementById('pkid').value;
    const xhr = new XMLHttpRequest();
    xhr.onreadystatechange = () => {
        if(xhr.readyState==4&&xhr.status==200){
            implant(JSON.parse(xhr.responseText))
        }
    }
    xhr.open('get','http://pokeapi.co/api/v2/pokemon/'+pkid);
    xhr.send();
}
function implant(pk){
    document.getElementById('pkInfo').innerHTML=pk.forms[0].name;
}
document.getElementById('pksubmit').addEventListener('click', getPkBetter);

//fetch api
function getPkBetter(){
    const pkid = document.getElementById('pkid').value;
    fetch('http://pokeapi.co/api/v2/pokemon/'+pkid)
        .then(response => response.json())
        .then(console.log);
}

//the above arrow function is the equivalent to this
function getResponseJson(response){
    return response.json();
}