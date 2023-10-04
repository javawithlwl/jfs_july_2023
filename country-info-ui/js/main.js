const idCountryInfoContent = document.getElementById('idCountryInfoContent');

idCountryInfoContent.innerHTML = `Country Information will be displayed here`;

const baseUrl = "http://localhost:8080/api/country";

const idCountryName = document.getElementById('idCountryName');

idCountryName.addEventListener('keyup', (event)=>{
    let countryName = event.target.value;
    if(countryName !== ""){
        fetch(`${baseUrl}/search?str=${countryName}`)
            .then(response => response.json())
            .then(data => {
                displayCountryInfo(data);
            });
    }
    
});

function showCountryInfo(){
        console.log("showCountryInfo() called");
        fetch(`${baseUrl}/info`)
            .then(response => response.json())
            .then(data => {
                displayCountryInfo(data);
            });
}

function displayCountryInfo(countryInfo){
    if(countryInfo.length === 0){
        idCountryInfoContent.innerHTML = `<h3>No country information is found</h3>`;
        return;
    }
    let output = "";
    output += `<table border="1" class='table table-striped'>`
    output += `
        <tr>
            <th>Country Name</th>
            <th>Region</th>
            <th>Population</th>
            <th>Area</th>
            <th>Flag</th>
        </tr>
    `;
    countryInfo.forEach(country=>{
        output += `
            <tr>
                <td>${country.countryName}</td>
                <td>${country.region}</td>
                <td>${country.population}</td>
                <td>${country.area}</td>
                <td><img src="${country.flagSvg}" alt="" id="idCountryInfoFlag" style="width: 80px; height: 50px;"></td>
            </tr>
        `;
    });
    output += `</table>`;
    idCountryInfoContent.innerHTML = output;

}

showCountryInfo();