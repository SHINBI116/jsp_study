const edit_value_btn = document.getElementById("edit_value_btn");
const edit_value = document.getElementById("edit_value");

function editPage(value) {

	location.href = "/chap04/cookie/ex/edit?"
		+ `edit_value=${edit_value.value}&&`
		+ `cookie-value=${value}`;


}



