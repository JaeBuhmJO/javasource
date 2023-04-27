/**
 * 
 */

 const form = document.querySelector("form");
 
 form.addEventListener("submit", (e)=>{
	 e.preventDefault();
	 
	 const userid = document.querySelector("#userid");
	 const password = document.querySelector("#password");
	 const name = document.querySelector("#name");
	 const genderMale = document.querySelector("#gender-male");
	 const genderFemale = document.querySelector("#gender-female");
	 const email = document.querySelector("#email");
	 
	 if(userid.value==""){
		 alert("userid를 입력해주세요");
		 userid.select();
		 return;
	 }
	 if(password.value==""){
		 alert("password를 입력해주세요");
		 password.select();
		 return;
	 }
	 if(name.value==""){
		 alert("name을 입력해주세요");
		 name.select();
		 return;
	 }
	 if(!genderMale.checked&&!genderFemale.checked){
		 alert("성별을 선택해주세요");
		 return;
	 }
	 if(email.value==""){
		 alert("email을 입력해주세요");
		 email.select();
		 return;
	 }
	 form.submit();
 })