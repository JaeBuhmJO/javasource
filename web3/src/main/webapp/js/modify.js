/**
 * newaddr, newmobile 둘 중에 하나는 값이 있어야 함 
 * 
 * 둘 다 빈칸일 때 submit 막고, 메세지 띄우기
 */

document.querySelector(".btn-primary").addEventListener("click", () => {
	location.href = "listPro.jsp"
})

const form = document.querySelector("form");
form.addEventListener("submit", (e) => {
	e.preventDefault();
	const newaddr = document.querySelector("#newaddr");
	const newmobile = document.querySelector("#newmobile");
	if (newaddr.value != "" || newmobile.value != "") {
		form.submit();
	} else {
		alert("수정사항을 입력해주세요");
		return;
	}
})

