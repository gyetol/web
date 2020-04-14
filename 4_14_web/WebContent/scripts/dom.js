window.onload=function(){
	var buttons=document.getElementsByTagName('button');
	for(let i=0;i<buttons.length;i++){
		buttons[i].onclick=function(){
		document.getElementsById('preview').src='./images/' + this.id;
		}
	}
	
	setTimeout(function(){
		buttons[0].onclick(); //buttons[0].onclick은 값을 넣어야한다. onclick()은 실행시키는 것이다.
	},3000)
	
	document.getElementById('name').onkeyup=function(e){
		if(e.keyCode==13){
			document.getElementById('password').focus();
		}
	}
	
	document.getElementById('name').onblur=function(){
		if(!(this.value.trim())){
			this.focus();
		}
	}
}