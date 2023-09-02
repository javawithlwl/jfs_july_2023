
const baseUrl = "https://cbook-server-app.onrender.com/api/contact/"

fetch(`${baseUrl}\all`)
.then(data=>data.json())
.then(res=>{
    console.log(res);
}).catch(error=>{
    console.log(error);
})