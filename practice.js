"use strict";

function sayHello() {
  let username = document.getElementById("username").value;
  let password = document.getElementById("password").value;
  let dob = document.getElementById("date").value;

  alert("Hello " + username + " 👋\n" +
        "Password: " + password + "\n" +
        "D.O.B: " + dob);
}
