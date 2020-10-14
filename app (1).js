data=[];
document.getElementById("add").addEventListener('click',function()

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
document.getElementById("msg").innerHTML="Event name already exists .";
}


}
else{
data.push(input.value);
document.getElementById("msg").innerHTML=" Added successfully";


}
console.log(data)
}
);
document.getElementById("displayevent").addEventListener('click',show);
function show() {
document.getElementById('dis').style.display = "block";
}
document.getElementById("display").addEventListener('click',ul);
function ul(){ 
  data.sort();
  result="";
  for(let d of data){
      result+='<li>'+d+'<\li>';
  }
  document.getElementById("ul").innerHTML=result;

  document.getElementById("ul").style.listStyle = "none";
}

document.getElementById("pop").addEventListener('click',function(){

if(data.length>0)
{
    data.pop();
    document.getElementById("msg").innerHTML=" Removed successfully";
    
}
else{
    document.getElementById("msg").innerHTML="Event array Empty";
}

});