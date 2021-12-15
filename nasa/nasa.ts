let url = 'https://images-api.nasa.gov/search?media_type=image&year_start=2019&year_end=2020&title=earth'

// exemple : 'https://images-api.nasa.gov/search?media_type=image&year_start=2019&year_end=2020&title=earth'

async function recupDonnees(){

let dataJson

 await fetch(url,{method : 'GET'})
 .then(responses =>{
     if(responses.ok){
         return responses.json()
     }
 }).then(rJson =>{
     dataJson = rJson
     //console.log(dataJson)
 });

let collectionItems = dataJson.collection.items

console.log(collectionItems)
return collectionItems
}

recupDonnees()
.then(varAMapper => {
    // let VarHTML = varAMapper.map(eachData => {
    //     return '<tr><td>'+eachData.data[0].title+'</td>'+'<td>'
    //     +eachData.data[0].date_created+'</td>'+'<td>'
    //     +eachData.data[0].description+'</td>'+'<td><img src ="'
    //     +eachData.links[0].href+'"/></td></tr>'
    // })
    let writeInto = document.getElementById('TableNASA')
    varAMapper.forEach(eachData => {
        let td1= document.createElement("td")
        let td2= document.createElement("td")
        let td3= document.createElement("td")
        let td4= document.createElement("td")
        let tr= document.createElement("tr")
        let img= document.createElement("img")
        td1.innerHTML=eachData.data[0].title
        td2.innerHTML=eachData.data[0].date_created
        td3.innerHTML=eachData.data[0].description
        img.src=eachData.links[0].href
        td4.appendChild(img)
        tr.appendChild(td1)
        tr.appendChild(td2)
        tr.appendChild(td3)
        tr.appendChild(td4)
        writeInto.appendChild(tr)
    })
    // console.log(VarHTML)
    // let string = VarHTML.reduce((ligne,recuder)=>{recuder+ligne},"");
    // writeInto.innerHTML = string;
})



