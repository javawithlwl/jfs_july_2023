if(localStorage.getItem("contacts")==null){
    localStorage.setItem("contacts",JSON.stringify([]));
}
function showContacts(){
    contactList = JSON.parse(localStorage.getItem("contacts"));
    let table = document.getElementById("idContacts");
    // remove body if exists
    if(table.tBodies.length>0){
        table.removeChild(table.tBodies[0]);
    }
    table.appendChild(createBody(contactList));
}
function showSearchResult(contactList){
    let table = document.getElementById("idContacts");
    // remove body if exists
    if(table.tBodies.length>0){
        table.removeChild(table.tBodies[0]);
    }
    table.appendChild(createBody(contactList));
}
function createBody(contactList){
    let tbody = document.createElement("tbody");
    if(contactList.length == 0){
        let tr = document.createElement("tr");
        let td = document.createElement("td");
        td.setAttribute("colspan", 6);
        td.innerHTML = "No Contacts to display";
        tr.appendChild(td);
        tbody.appendChild(tr);
    }else{
        contactList.forEach((contact)=>{
            tbody.appendChild(createRow(contact));
        });
    }
    return tbody;
}
function createRow(contact){
    let tr = document.createElement("tr");
    tr.appendChild(createCell(contact.name));
    tr.appendChild(createCell(contact.email));
    tr.appendChild(createCell(contact.phone));
    tr.appendChild(createCell(contact.address));
    tr.appendChild(createCell(`<i class='fa fa-edit' onclick="editContact('${contact.phone}')"></i>`));
    tr.appendChild(createCell(`<i class='fa fa-trash' onclick="deleteContact('${contact.phone}')"></i>`));
    return tr;
}
function deleteContact(phone){
    if(confirm('Are you sure of deleting contact with mobile :'+phone+" ?")){
        let index = getIndex(phone);
        if(index != -1){
            contacts = JSON.parse(localStorage.getItem("contacts"));
            contacts.splice(index,1);
            localStorage.setItem("contacts",JSON.stringify(contacts));
            showContacts(contacts);
        }
    }
}
function editContact(phone){
    let index = getIndex(phone);
    if(index != -1){
        document.querySelector("#btnAddSubmit").style.display='none';
        document.querySelector("#btnUpdateSubmit").style.display='block';
        contact = contacts[index];
        document.getElementById("idContactFormBtn").click();
        contactForm = document.getElementById("idContactForm");
        console.log(contactForm);
        contactForm.name.value = contact.name;
        document.getElementById('idMobile').setAttribute('readonly', true);        
        contactForm.mobile.value = contact.phone;
        contactForm.email.value = contact.email;
        contactForm.address.value = contact.address;
    }else{
        alert("Contact with phone number :"+phone+" is not found");
    }
}
function getIndex(phone){
        contacts = JSON.parse(localStorage.getItem("contacts"));
        for(let i=0;i<contacts.length;i++){
             if(contacts[i].phone.trim() === phone.trim()){
                return i;
            }
        }
        return -1;
}
function createCell(value){
    let td = document.createElement("td");
    td.innerHTML = value;
    return td;
}

document.querySelector("#btnClose").addEventListener('click',()=>{
    document.getElementById("idContactForm").reset();
})

function search(str){
    contacts = JSON.parse(localStorage.getItem("contacts"));
    let searchResult = contacts.filter((contact)=>{
        return contact.name.toLowerCase().includes(str.toLowerCase());
    });
    return searchResult;
}
const idSearchStr = document.getElementById("idSearchStr");

idSearchStr.addEventListener("keyup",(event)=>{
    let str = event.target.value;
    if(str!=null && str.trim().length>0){
         let serarchResult = search(str);
         showSearchResult(serarchResult);
    }
    if(event.target.value.trim().length == 0){
        contacts = JSON.parse(localStorage.getItem("contacts"));
        showSearchResult(contacts);
    }
    
});
showContacts();


function updateContact(){
    let idContactForm = document.getElementById("idContactForm");
    let name = idContactForm.name.value;
       let email = idContactForm.email.value;
       let phone = idContactForm.mobile.value;
       let address = idContactForm.address.value;
       let contact = {
           "name": name,
           "email": email,
           "phone": phone,
           "address": address
       }
       idContactForm.reset();
       document.querySelector(".btn-close").click();
       document.getElementById('idMobile').setAttribute('readonly', false);
       index = getIndex(contact.phone);
       contacts = JSON.parse(localStorage.getItem("contacts"));
       contacts[index] = contact;
       localStorage.setItem('contacts',JSON.stringify(contacts));
       showContacts();

}

function addContact(){
     let idContactForm = document.getElementById("idContactForm");
     let name = idContactForm.name.value;
        let email = idContactForm.email.value;
        let phone = idContactForm.mobile.value;
        let address = idContactForm.address.value;
        let contact = {
            "name": name,
            "email": email,
            "phone": phone,
            "address": address
        }
        idContactForm.reset();
        document.querySelector(".btn-close").click();
        contactList = JSON.parse(localStorage.getItem("contacts"));
        contactList.push(contact);
        localStorage.setItem("contacts",JSON.stringify(contactList));
        showContacts();
}
