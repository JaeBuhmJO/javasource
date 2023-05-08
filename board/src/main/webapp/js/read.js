const readForm = document.querySelector("#readForm");
document.querySelector(".btn-success").addEventListener("click", () => {
	readForm.action = "list.do";
	readForm.submit();
})
document.querySelector(".btn-secondary").addEventListener("click", () => {
	readForm.action = "replyView.do";
	readForm.submit();
})
document.querySelector("form").addEventListener("submit", (e) => {
	e.preventDefault();
	readForm.action = "modify.do";
	readForm.submit();
});
