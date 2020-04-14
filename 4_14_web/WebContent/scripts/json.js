var student={
		name:'홍길동',
		age:20,
		isHungry:false,
		family:['아빠','엄마','나'],
		mom:{
			name:'나엄마',
			age:50
		}
}

var jsonStudent=JSON.stringify(student);
var jStudent=JSON.parse(jsonStudent);

function preLoad(){
	console.log(student);
	console.log(jsonStudent);
	document.write(jsonStudent);
}