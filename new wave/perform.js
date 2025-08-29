let username = prompt("Hey, What's your name?");
alert("Hello!," + username + "! Welcome to MELE Technologies");
console.log("the user entered: " +username );

let user =prompt("Wassup?");
if(user=="good"){
    alert("Good to know!");
}
else{
    alert("Wishing you a good day");
}
console.log("the user said: "+user);

let result= confirm("Do you wanna continue?");


let input = prompt("Enter a number: ");
let number = Number(input);
let doubled = number*2;
document.getElementById("number").innerHTML=`Here is the doubled value which is given by you ${doubled}`;

console.log("the given input is: "+input);
console.log("the doubled input is: " + doubled);



let a= prompt("write number A: ");
let num1 = Number(a);
let b= prompt("write number B: ");
let num2 = Number(b);
let sum= num1 + num2;
let sub=num1 - num2;
let multi=num1 * num2;
let div=num1/num2;
let power=num1**num2;

document.getElementById("arithmatic").innerHTML=`here is the arithmatic values: <br>
So if we add ${a} + ${b}, we get ${sum} <br>
if we subtract ${a} - ${b}, we get ${sub}<br>
if we multiply ${a} X ${b}, we get ${multi}<br>
if we divide ${a} / ${b}, we get ${div}<br>
and if we use power of ${a} & ${b}, we get ${power}`;


console.log("User's input A= "+ num1);
console.log("User's input B= "+ num2);


let i= 0;
while(i<=5){
    console.log("here is the number from 0 to 5 "+i);
    i++;
}

let j=0;
for(i=0; i<=10; i++){
    console.log("number",+i);
}


function generateTable(){
    let num = document.getElementById("numberinput").value;
    let output="";
    for(let i=1; i<=10; i++){
        output += num + " x " + i + " = " + (num*i) + " <br> ";
    }
    document.getElementById("tableoutput").innerHTML=output;
}

function table(){
    let a= document.getElementById("table2").value;
    let b="";
    for(let i=1;i<20;1++){
        b += a + "X" + i + "=" + "</br>"
    }
    document.getElementById("table3").innerHTML=b;
}