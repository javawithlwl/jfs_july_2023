function showDate(){
    let today = new Date();
    document.getElementById("showTodaysDate").innerHTML = `<strong>${today}</strong>`;
}

function calCulateEMI(){

        let loanAmount = Number.parseFloat(document.getElementById("loanAmount").value);
        let interestRate = Number.parseFloat(document.getElementById("interestRate").value);
        let loanTenure = Number.parseFloat(document.getElementById("loanTenure").value);

        let monthlyInterestRate = interestRate / (12 * 100);
        
        let monthlyPayment = loanAmount * monthlyInterestRate * (Math.pow(1+monthlyInterestRate, loanTenure) / (Math.pow(1+monthlyInterestRate, loanTenure) - 1));
        let totalPayment = monthlyPayment * loanTenure;
        let totalInterest = totalPayment - loanAmount;
        
        const idEmiResult = document.getElementById("idEmiResult");

        let str = `<p>
            <strong>Monthly EMI:</strong> ${monthlyPayment.toFixed(2)}<br>
            <strong>Total Payment:</strong> ${totalPayment.toFixed(2)}<br>
            <strong>Total Interest:</strong> ${totalInterest.toFixed(2)}<br>
        </p>`
        idEmiResult.innerHTML = str;
          
}

// JavaScript functions

function greet(name){
    alert(`Hello ${name}, Welcome to JavaScript`);
}


const idSum = document.getElementById("idSum");
const idSub = document.getElementById("idSub");
const idMul = document.getElementById("idMul");
const idDiv = document.getElementById("idDiv");
const idMod = document.getElementById("idMod");

function perform(num1, num2, f){
    return f(num1, num2);
}
  

idSub.addEventListener("click",()=>{
    let num1 = Number.parseFloat(document.getElementById("num1").value);
    let num2 = Number.parseFloat(document.getElementById("num2").value);
    let result = perform(num1, num2, (a,b)=>a-b);
    idResult.innerHTML = `${num1} - ${num2} = ${result}`;
})
idSub.addEventListener("click",()=>{
    let num1 = Number.parseFloat(document.getElementById("num1").value);
    let num2 = Number.parseFloat(document.getElementById("num2").value);
    let result = perform(num1, num2, (a,b)=>a-b);
    idResult.innerHTML = `${num1} - ${num2} = ${result}`;
})
idSum.addEventListener("click",()=>{
    let num1 = Number.parseFloat(document.getElementById("num1").value);
    let num2 = Number.parseFloat(document.getElementById("num2").value);
    let result = perform(num1, num2, (a,b)=>a+b);
    idResult.innerHTML = `${num1} + ${num2} = ${result}`;
})
idMul.addEventListener("click",()=>{
    let num1 = Number.parseFloat(document.getElementById("num1").value);
    let num2 = Number.parseFloat(document.getElementById("num2").value);
    let result = perform(num1, num2, (a,b)=>a*b);
    idResult.innerHTML = `${num1} * ${num2} = ${result}`;
})
idDiv.addEventListener("click",()=>{
    let num1 = Number.parseFloat(document.getElementById("num1").value);
    let num2 = Number.parseFloat(document.getElementById("num2").value);
    let result = perform(num1, num2, (a,b)=>a/b);
    idResult.innerHTML = `${num1} / ${num2} = ${result}`;
})

idMod.addEventListener("click",()=>{
    let num1 = Number.parseFloat(document.getElementById("num1").value);
    let num2 = Number.parseFloat(document.getElementById("num2").value);
    let result = perform(num1, num2, (a,b)=>a%b);
    idResult.innerHTML = `${num1} % ${num2} = ${result}`;
})

idBig.addEventListener("click",()=>{
    let num1 = Number.parseFloat(document.getElementById("num1").value);
    let num2 = Number.parseFloat(document.getElementById("num2").value);
    let result = perform(num1, num2, (a,b)=>a > b ? a : b);
    idResult.innerHTML = `${num1} > ${num2} = ${result}`;
});

function changeStatusToOn(){
    document.getElementById("idBulb").src = "../img/pic_bulbon.gif";
}
function changeStatusToOff(){
    document.getElementById("idBulb").src = "../img/pic_bulboff.gif";
}