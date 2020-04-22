$(document).ready(function(){
	$('button').click(function(){
		$.ajax({
			url: 'login',
			method: 'post',
			data:{
				title:$('#email').val(),
				content:$('#pass').val()
			}
		}).done(function(data){ //success: 를 써도 된다.
			//obj = ({errno:0, message:~~~}); 
			var obj=eval('('+data+')');
			alert(obj.message);
			if(obj.errno==0){
				location.href='boardWrite.html';
			}
			else{
				location.reload();
			}
		});
	});
	
});