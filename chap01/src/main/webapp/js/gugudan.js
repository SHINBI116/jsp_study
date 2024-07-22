
const gugudan = document.getElementById("gugudan");


for (let gop = 1; gop <= 9; ++gop) {
	for (let dan = 2; dan <= 9; ++dan) {
		const eachDan = document.createElement("div");
		const a = document.createTextNode(`${dan} x ${gop} = ${dan * gop}`);
		eachDan.appendChild(a);
		gugudan.appendChild(eachDan);
		
	}
	
}
