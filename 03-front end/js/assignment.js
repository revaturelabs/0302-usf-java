//create a toystore with the following values
//inventory (string array)
//have an inventory count getter
// a boolean whether it is open or closed
//methods to pull items out of the inventory and ones to put more in
//a method to open and close
//name the store

const BinkysToyStore = {

    name: "Blinky's ",
    inventory : [],
    isOpen: true,
    addPro: 
    function addProduct(product,x){
        this.inventory.push([product,x])
    },
     getcount: function() {
        return this.inventory.length;
      },

      removePro:
      function popProduct(product,x){
          this.inventory.pop([product,x])
      },

      OpenCloseStore:
      function COB(){
          this.isOpen = !this.isOpen; 
          },
        
      }
    
    

//console.log(BinkysToyStore);