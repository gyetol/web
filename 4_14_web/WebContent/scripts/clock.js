/*//현재시간을  HH:mm:ss 형식으로 반환하는 함수
var now=function(){
	let today = new Date();
	let hour=today.getHours()<10?'0'+today.getHours():
	let minute=	today.getMinutes():
	let second=	today.getSeconds()
//	return hour+':'+minute+':';
}



function preLoad(){
	let cObj=document.querySelectorAll('div#clock');
	setInterval(function(){
		cObj.innerHTML=now();
	},1000);

}*/