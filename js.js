console.log('Hello');
console.log(`I like pizza`);

window.alert("Guys, Welcome to this shitty website");
window.alert("Haha just kidding brotha");
window.alert("But still ain't that bad");
window.alert("So welcome home, baby!");

// Username input
let username;
document.getElementById("mysubmit").onclick = function () {
  username = document.getElementById("mytext").value;
  document.getElementById("hell1").textContent = `Hey, ${username} Welcome`;
};

// Variables
let name = "Shadil";
let age = 22;
let cgpa = 7.82;

document.getElementById("h1").textContent = `My name is ${name}`;
document.getElementById("h2").textContent = `I am literally ${age} years old`;
document.getElementById("h3").textContent = `I have scored ${cgpa} in the last sem`;

let count = 0;
document.getElementById("decreaseBtn").onclick = function () {
  count--;
  document.getElementById("countLabel").textContent = count;
};
document.getElementById("resetBtn").onclick = function () {
  count = 0;
  document.getElementById("countLabel").textContent = count;
};
document.getElementById("increaseBtn").onclick = function () {
  count++;
  document.getElementById("countLabel").textContent = count;
};

// Type Conversion
const strNum = "123.45";
const intNum = parseInt(strNum);  
const floatNum = parseFloat(strNum); 
const numToString = (123).toString();

document.getElementById("conversionResult").textContent =
  `Original: "${strNum}" (string) | ` +
  `Integer: ${intNum} | Float: ${floatNum} | Number to String: "${numToString}"`;
