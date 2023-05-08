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
	//검색 후 무조건 1페이지 랜딩하게 스크립트
	document.querySelector("form [name='page']").value = 1;
	form.submit();
})

//const pageLinks = document.querySelectorAll(".page-link");
const actionForm = document.querySelector("#actionForm");
/*
pageLinks.forEach(pageLinks => {
	pageLinks.addEventListener("click", (e) => {
		e.preventDefault();
		const href = e.target.getAttribute("href");
		const page = document.querySelector("#actionForm input:nth-child(3)");
		page.value = href;
		actionForm.submit();
	})
})
*/
const bno = document.querySelector("#actionForm input:nth-child(1)");

const pagination = document.querySelector(".pagination");
pagination.addEventListener("click", (e) => {
	e.preventDefault();
	const page = document.querySelector("#actionForm input:nth-child(4)");
	page.value = e.target.getAttribute("href");
	actionForm.action = "list.do";
	actionForm.submit();
})

document.querySelector("select[name='amount']").addEventListener("change", (e) => {
	document.querySelector("#actionForm input:nth-child(5)").value = e.target.value;
	actionForm.action = "list.do";
	actionForm.submit();
})

const moves = document.querySelectorAll(".move");
moves.forEach(move => {
	move.addEventListener("click", (e) => {
		e.preventDefault();

		const href = e.target.getAttribute("href");

		//const element = "<input type='hidden' name='bno' value='" + href + "'>";
		//actionForm.insertAdjacentHTML("afterbegin", element);

		bno.value = href;
		console.log(actionForm);
		actionForm.action = "cntUpdate.do"
		actionForm.submit();
	})
})
