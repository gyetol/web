$(document).ready(function(){
	$('button').click(function(){
		$.ajax({
			url: 'writeBoard',
			method: 'post',
			data:{
				title:$('#title').val(),
				content:$('#content').val()
			}
		}).done(function(data){ //success: 를 써도 된다.
			var obj=eval('('+data+')');
			if(obj.errno==9){
				alert(obj.message);
				location.href='login.html';
			}
			else if(obj.errono==1){
				alert(obj.message);
			}
			else{
				alert(obj.message);
				location.hrfe='index.html'; //게시판목록으로 복귀
			}
		});
	});
	
	
});