/**
 * add.html 사용자 입력 값 검증
 * num1, num2 숫자인지 확인하기
 * 
 * submit 전송 못하게 막고
 * 숫자인지 확인
 * 둘 중에 하나라도 숫자가 아니면 경고창
 * 둘 다 숫자면 서브밋
 */
const form = document.querySelector("form");
form.addEventListener("submit", (e) => {
	e.preventDefault();
	let num1 = document.querySelector("#num1");
	let num2 = document.querySelector("#num2");
	if (isNaN(num1.value) || num1.value == "") {
		alert("num1 입력값을 확인해 주세요");
		num1.select();
		return;
	} else if (isNaN(num2.value) || num2.value == "") {
		alert("num2 입력값을 확인해 주세요");
		num2.select();
		return;
	} else {
		form.submit();
	}
});