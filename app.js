data=[];
        document.getElementById("addevent").addEventListener('click',function()

{

var input=document.getElementById("eventname");
if(data.length>0)
{
    let c=0;
    for(let i=0;i<data.length;i++)
    {
        if(data[i]===input.value)
        {
          c=c+1; 
         
        }
        
    }
    if(c<1)
    {
        data.push(input.value);
        document.getElementById("msg").innerHTML="Event name added successfully";
    }
    else{
        document.getElementById("msg").innerHTML="Event name already exists";
    }
    
    
}
    else{
    data.push(input.value);
    document.getElementById("msg").innerHTML="Event name added successfully";
    

}
console.log(data)
}
);
document.getElementById("displayevent").addEventListener('click',show);
function show() {
   document.getElementById('dis').style.display = "block";
}
document.getElementById("displayevent").addEventListener('click',function(){
    data.sort();
    result="";
    for(let d of data){
        result+='<li>'+d+'<\li>';
    }
    document.getElementById("ul").innerHTML=result;
    });