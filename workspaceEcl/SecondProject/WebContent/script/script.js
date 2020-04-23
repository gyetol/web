$(document).ready(function(){
	$('#checkEmail').click(function(){
		if($(this).siblings('input[name=email]').val().trim()==''){
			alert('메일주소를 입력해주세요!!');
			$(this).siblings('input[name=email]').val('').focus();
			return;
		}
		
		$.ajax({
			url:'/SecondProject/checkEmail',
			type:'post',
			data:{
				email:$(this).siblings('input[name=email]').val()
			},
			success: function(data){
				let obj=eval('('+data+')');
				if(obj.errno!=0){
					alert(obj.message);
					$('input[name=email]').val('').focus();
				}
				else{
					alert(obj.message);
				}
			}
		})
	});
	$('#checkNick').click(function(){
		if($(this).siblings('input[name=nick]').val().trim()==''){
			alert('별명을 입력해주세요!!');
			$(this).siblings('input[name=email]').val('').focus();
			return;
		}
		$.ajax({
			url:'/SecondProject/checkNick',
			type:'post',
			data:{
				email:$(this).siblings('input[name=nick]').val()
			},
			success: function(data){
				let obj=eval('('+data+')');
				if(obj.errono!=0){
					alert(obj.message);
					$('input[name=nick]').val('').focus();
				}
				else{
					alert(obj.message);
				}
			}
		});
	});
});