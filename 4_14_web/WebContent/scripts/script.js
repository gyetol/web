function Student(name,kor,eng,math){
	this.name=name;
	this.kor=Number.parseInt(kor);
	this.eng=Number.parseInt(eng);
	this.math=Number.parseInt(math);
	this.rank=0;
}

Student.prototype.getTotal=function(){
	return (this.kor+this.eng+this.math);
}

Student.prototype.setRank=function(students){
	let rank =1;
	for(let i =0; i<students.length;i++){
		if(this.getTotal()<students[i].getTotal()){
			rank++;
		}
	}
	this.rank=rank;
}

function calc(){
	var names=document.getElementByName('name');
	var kors=document.getElementByName('kor');
	var engs=document.getElementByName('eng');
	var maths=document.getElementByName('math');
	var tots=document.getElementsByName('tot');
	var ranks=document.getElementsByName('rank');
	var students=Array();
	
	for(let i=0;i<names.length;i++){
		students.push(new Student(names[i].value,kors[i].value,engs[i].value,maths[i].value));
	}
	
	for(let i=0;i<students.length;i++){
		students[i].setRank(students);
	}
	
	students.sort(function(s1,s2){
		return(s1.rank-s2.rank);
	});
	
	for(let i=0;i<students.length;i++){
		names[i].value=students[i].name;
		kors[i].value=students[i].kor;
		engs[i].value=students[i].eng;
		maths[i].value=students[i].math;
		tots[i].value=students[i].getTotal;
		ranks[i].value=students[i].rank;
	}
	
}

function preLoad(){
	document.getElementById('calc').onclick=calc;
}