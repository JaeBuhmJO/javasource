/**
 * 
 */

const modifyForm = document.querySelector("#modifyForm");
document.querySelector(".btn-success").addEventListener("click", () => {
	modifyForm.action = "list.do";
	modifyForm.submit();
})

document.querySelector(".btn-danger").addEventListener("click", (e) => {
	e.preventDefault();
	const currPassword = document.querySelector("#inputPassword3");
	const passwordToDelete = document.querySelector("[name='passwordTodelete']")
	if (currPassword.value != "") {
		passwordToDelete.value = currPassword.value;
	} else {
		alert("게시글 삭제 확인을 위해 비밀번호를 입력하세요");
		currPassword.select();
		return;
	}
	modifyForm.action = "delete.do";
	modifyForm.method = "post"
	modifyForm.submit();
});