var mainmenus=['프로그래밍','데이터베이스','웹기술'];

var menus=[
	['자바','C','C++'],
	['mariaDB','mysql','oracle'],
	['html','css','javascript','JQuery'],
]

$(document).ready(function(){
	$('#lpart').append($('<option>',{text:'대분류선택'}));
	$('#spart').append($('<option>',{text:'소분류선택'}));
	for(let i=0;i<mainmenus.length;i++){
		$('#lpart').append($('<option>',{text:mainmenus[i]}));
	}
	$('#lpart').change(function(){
	var text= $(this).find('option:selected').text();
	var idx=mainmenus.indexOf(text);
	
	$('#spart').empty().append($('<option>',{text:'소분류선택'}));
	if(idx>=0){
		for(let i=0;i<menus[idx].length;i++){
			$('#spart').append($('<option>',{text:menus[idx][i]}));
		}
	}
	
	});
});


/*$(document).ready(function(){
	$('#lpart').change(function(){
		var idx=$(this).find('option:selected').index();
		$('#spart').empty().append('<option>소분류선택</option>');
		if(idx>0){
			for(let i=0;i<menus[idx-1].length;i++)
				{
				$('#spart').append($('<option>',{text:menus[idx-1][i]}));
				}
		}
		
	});
});
*/

/*$(document).ready(function(){
	$('#lpart').on('change',function(){
		//console.log($('#lpart>option:selected').index());
		var idx=$(this).find('option:selected').index();
		
		if(idx==0){;}
		else{
			for(let i=0;i<menus[idx].length;i++){
			('option',menus[idx][i]).appendTo$('<select[id=spart]>');
			}
		}	
	});	
});*/


