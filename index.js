const how=document.getElementById("crtdiv")
let stand=0;
//console.log(answer)
let Boolean=false;

how.addEventListener("click",function(){

    let curren=document.getElementById("curr").value
    let answer=document.getElementById("ans").value
    stand=parseInt(stand+answer);       //0+33

    Boolean=true;
    const shwmenu=document.getElementById("third");
    const menu=document.createElement("div")
    menu.className="project"
    menu.innerHTML=curren + stand;
    shwmenu.appendChild(menu)

    if(Boolean == true){
        const shwmenu2=document.getElementById("third-3");
        const menu=document.createElement("div")
        menu.className="project-1"
        menu.innerHTML=curren + stand;  //33
        shwmenu2.appendChild(menu)
    }
    if(Boolean == true){
        answer=document.getElementById("amt").value
            
        answer===null? answer=10:answer=0
        const shwmenu2=document.getElementById("third-2");
        const menu=document.createElement("div")
        menu.className="project-2"
        menu.innerHTML=curren + answer;    //0
        shwmenu2.appendChild(menu)
       }
    
})


const expens=document.getElementById("expenses")

expens.addEventListener("click",function(){
    let answer1=document.getElementById("amt").value  //23
    let curren=document.getElementById("curr").value
    stand=parseInt(stand-answer1)                      //33-23=10
    if(stand > 0){
        if(Boolean == true){
        const shwmenu2=document.getElementById("third-2");
        const menu=document.createElement("div")
        menu.className="project-2"
        menu.innerHTML=curren + answer1;        //23
        shwmenu2.appendChild(menu)
       }
    
        const shwmenu=document.getElementById("third");
        let answer=document.getElementById("ans").value
        const menu=document.createElement("div")
        menu.className="project"
        menu.innerHTML=curren + answer;   //33
        shwmenu.appendChild(menu)
    
        if(Boolean == true){
            const shwmenu2=document.getElementById("third-3");
            const menu=document.createElement("div")
            menu.className="project-1"
            //answer-=answer1;                    //
            menu.innerHTML=curren + stand;
            shwmenu2.appendChild(menu)
        }
        const result=document.getElementById("result")
        let exp=document.getElementById("exp").value
        let final=document.getElementById("final")
        final.innerHTML=`you have purchased a ${exp} of $${answer1} and the remaining amount in your account is ${stand}`
        result.appendChild(final)}
        else{
            document.write("Sry Your amount is too less than Zero")
        }
    
    stand=stand
    
})

