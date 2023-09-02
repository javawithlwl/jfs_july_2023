
const baseUrl = 'https://newsapi.org/v2/top-headlines';
const apiKey = 'cfaf5fcdebfb4d7293720a9aa6ffc113';

async function  showNewsHeadings(){
    let country = document.querySelector("#idCountry").value;
    let category = document.querySelector("#idCategory").value;
    console.log(`${country} - ${category}`);
    newsItems = await getNewsItems(`${baseUrl}?category=${category}&country=${country}&apiKey=${apiKey}`);

    showNewsHeadingsResult(newsItems);

}

function showNewsHeadingsResult(newwItems){
    let articles = newwItems.articles;
    let newsHeadings = [];
    for(let i=0;i<articles.length;i++){
        let article = articles[i];
        console.log(article);
        let title = article.title;
        let description = article.description;
        let urlToImage = article.urlToImage;
        newsHeadings.push({"title":title,"description":description,"urlToImage":urlToImage})
    }
    showItems(newsHeadings);

}

function showItems(items){
        let str = '';
        items.forEach(item => {
            str += `
            <div class="card mt-2 mb-2">
                    <img src="${item.urlToImage}" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">${item.title}</h5>
                        <p class="card-text">${item.description}</p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                    </div>
            </div>
            `
        });
        document.querySelector("#idNewHeadings").innerHTML = str;
}


function getNewsItems(url){
    return fetch(url).then(data=>data.json()).then(res=>res);
}

showNewsHeadings();