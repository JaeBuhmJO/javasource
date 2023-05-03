/**
 * 
 */

document.querySelector(".btn-success").addEventListener("click", () => {
	location.href = "list.do";
})

//수정 클릭 시 submit 기능 중지
//readForm을 가져온 후 readForm 전송
//modify.do로 이동
document.querySelector("form").addEventListener("submit", (e) => {
	e.preventDefault();
	const readForm = document.querySelector("#readForm");
	readForm.action = "modify.do";
	readForm.submit();
});
