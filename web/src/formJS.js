function toAlert(str){
	alert(str);
}

function validate(form){
	if(form.age.value==""||form.name.value==""||form.phone.value==""||form.fax.value=="") alert("Enter All details");
	else alert("Validated");
}

function validateAge(){
	var age = document.forms["form1"]["age"].value;
	if(isNaN(age)){
		document.getElementById("ageComent").style.color="red";
		document.getElementById("ageComent").innerHTML="Enter Number";
	}else if(age<1||age>110){
		document.getElementById("ageComent").style.color="red";
		document.getElementById("ageComent").innerHTML="Enter Valid age";	
	}else {
		document.getElementById("ageComent").style.color="blue";
		document.getElementById("ageComent").innerHTML="Valid age";
	}
}

function increaseAge(form){
	if(eval(form.age.value)<30)form.age.value=eval(form.age.value)+10;
}

function validateName(form){
	var letters=/^[A-Za-z ]+$/;
	if(!form.name.value.match(letters))alert("Enter Name with Alphabets Only");
}