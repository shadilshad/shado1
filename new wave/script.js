console.log("JavaScript Connected!");

// While loop function
function runWhileLoop() {
  let i = 1;             // start number
  let output = "";       // empty string to store result

  while (i <= 5) {       // repeat as long as i is 5 or less
    output += "Number: " + i + "<br>"; // add line
    i++;                 // increase i by 1
  }

  document.getElementById("whileOutput").innerHTML = output;
}

// For loop function
function runForLoop() {
  let output = "";

  for (let i = 1; i <= 5; i++) {  // start 1, run until 5, step +1
    output += "Number: " + i + "<br>";
  }

  document.getElementById("forOutput").innerHTML = output;
}

// Multiplication table function
function generateTable() {
  let num = document.getElementById("numInput").value; // take input from user
  let output = "";

  for (let i = 1; i <= 10; i++) {
        output += "<p>" + num + " x " + i + " = " + (num*i) + " </p>";
  }

  document.getElementById("tableOutput").innerHTML = output;
}
alert("hey");