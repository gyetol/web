var students= [
	{name:'홍길동',id:'gildong'},
	{name:'심청이',id:'sim'},
	{name:'변사또',id:'byun'},
	{name:'이몽룡',id:'mong'},
	{name:'성춘향',id:'choonhang'}
];


$(document).ready(function(){
	var selObj=$('<select/>').appendTo($('body'));
	for(let i=0;i<students.length;i++){
		$('<option/>',{value:students[i].id, text:students[i].name}).appendTo(selObj);
	}
});