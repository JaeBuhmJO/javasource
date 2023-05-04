const form = document.querySelector("form");

form.addEventListener("submit", (e) => {
	e.preventDefault();
	const criteria = document.querySelector("[name='criteria']");
	if (criteria.value == "n") {
		alert("검색 기준을 선택하세요");
		criteria.select();
		return;
	}
	const keyword = document.querySelector("[name='keyword']");
	if (keyword.value == "") {
		alert("검색 키워드를 입력하세요");
		keyword.select();
		return;
	}
	form.submit();
})