let name="shadil", age=21; country= "india";
console.log(`hello guys, myself i am ${name} and i am ${age} years old. i am a native of ${country}`);

document.getElementById("mydetails").textContent=` hey guys, myself i am ${name} and i am ${age} years old. i am a native of ${country} `


let mathMarks = 60;
let EnglishMarks = 40;

if(mathMarks >=50 && EnglishMarks >=50){
    document.getElementById("result").textContent=`PASS`;
}
else if(mathMarks <50 && EnglishMarks <50){
        document.getElementById("result").textContent=`FAIL`;
}
else{
    document.getElementById("result").textContent=`Need Improvement`;
}


let A=21 , B=19, C=15;

if(A>B && A>C){
    document.getElementById("numb").textContent='A is the biggest number';
}
else if(B>C && B>A){
    document.getElementById("numb").textContent='B is the biggest number';
}

else{
    document.getElementById("numb").textContent='C is the biggest number';
}

