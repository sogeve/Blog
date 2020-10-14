fetch('/test')
.then(response => response.json())
.then(response => {

    var articles = document.createElement("div");
    articles.setAttribute("class","articles");
    response.forEach(art => {

    console.log(art.title)

    var article = document.createElement("div");
    article.setAttribute("class","articlemain");
    article.innerHTML = "<div class='articleimg'><img src='" + art.imgUrl +"'></div>" +
    "<div class='articletext'>" +
    "<div class='articletitle'>" + art.title + "</div>" +
    "<div class='articledate'>Data:" + getCorrectDate(art.date) + ", Kategorie:" + art.category + "</div>" +
    "<div class='articledescription'>" + art.description +"</div>" +
    "</div>";

    articles.appendChild(article);

    });
document.getElementsByClassName("content")[0].appendChild(articles);

});
var e = window.location.href.substr(22);
console.log(e);
document.getElementsByClassName("content")[0].innerHTML = "";

//fetch("/rest" + e)
fetch(e)
.then(response => response.json())
.then(response => {

    var articles = document.createElement("div");
    articles.setAttribute("class","articles");
    response.forEach(art => {

    console.log(art.title)

    var article = document.createElement("div");
    article.setAttribute("class","articlemain");
    article.innerHTML = "<div class='articleimg'><img src='" + art.imgUrl +"'></div>" +
    "<div class='articletext'>" +
    "<div class='articletitle'>" + art.title + "</div>" +
    "<div class='articledate'>Data:" + getCorrectDate(art.date) + ", Kategorie:" + art.category + "</div>" +
    "<div class='articledescription'>" + art.description +"</div>" +
    "</div>";

    articles.appendChild(article);

    });
document.getElementsByClassName("content")[0].appendChild(articles);

});


function getCorrectDate(timestamp){

    var articleDate = new Date(timestamp)
    var stringDate = "";

    var day = articleDate.getDate();
    var month = articleDate.getMonth();
    var year = articleDate.getFullYear();
    var monthName = "";

    switch (month){
        case 0:
        monthName = "stycznia"
        break;
        case 1:
        monthName = "lutego"
        break;
        case 2:
        monthName = "marca"
        break;
        case 3:
        monthName = "kwietnia"
        break;
        case 4:
        monthName = "maja"
        break;
        case 5:
        monthName = "czerwca"
        break;
        case 6:
        monthName = "lipca"
        break;
        case 7:
        monthName = "sierpnia"
        break;
        case 8:
        monthName = "września"
        break;
        case 9:
        monthName = "paźdzniernika"
        break;
        case 10:
        monthName = "listopada"
        break;
        case 11:
        monthName = "grudnia"
        break;
        }
        return day + " " + monthName + " " + year;
}