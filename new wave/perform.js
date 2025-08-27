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
