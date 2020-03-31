let arr = [1, 2, 3, 4, 5576565656, 6, 7, 8];
// for(let i = 0; i<arr.length; i++){
//     console.log(arr[i]);
// }

//for of loop will grab the elements of the array
for (let i of arr) {
  // console.log(i);
}

//for in loop will grab the index of each element
for (let i in arr) {
  // console.log(i);
}

// arr.forEach(i=>console.log(i));

function print(element, index, array) {
  console.log(element, index, array);
}

//arr.forEach(print);let
let result = [];
for (let i = 0; i < arr.length; i++) {
  if (arr[i] % 3 == 0) {
    result.push(arr[i]);
  }
}

// console.log(result)

const res = arr.filter(i => i % 3 == 0);
// console.log(res);

const newarr = [
  1,
  2,
  3,
  "hey",
  "arnold",
  true,
  false,
  NaN,
  undefined,
  null,
  { name: "brian" }
];

const myArr = [1,2,3,[4,5,6]]
