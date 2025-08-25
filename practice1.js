"use strict"; 

alert("Hello, world!");

// 2. Variables
let name = "Shadil";  
let age = 22;      
let isStudent = true;

console.log(typeof name);     
console.log(typeof age);       
console.log(typeof isStudent); 

let userName = prompt("What is your name?");
let likesJS = confirm("Do you like JavaScript?");


let message = "Hello " + userName + "! ";
if (likesJS) {
  message += "Glad you like JavaScript 🎉";
} else {
  message += "Maybe you will like it later 🙂";
}

document.getElementById("output").textContent = message;
