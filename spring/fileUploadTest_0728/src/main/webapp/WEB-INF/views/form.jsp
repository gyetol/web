<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/jquery-3.5.1.min.js"></script>
<script>
	$(document).ready(function(){
		$('#btnUpload').click(function(){
			var form= $('#uploadForm')[0]; //var form = document.getElementById("uploadForm")
			var formData = new FormData(form);
			$.ajax({
				url:'upload',
				type:'POST',
				data: formData,
				processData: false,
				contentType: false,
				dataType: 'text',
				success: function(data){
					console.log(data);
				}
			});
			
		});
	});
</script>
</head>
<body>
<form id="uploadForm" method="POST" enctype="multipart/form-data">
업로드파일 <input type="file" id="upfile" name="upfile" multiple><br>
<button type="button" id="btnUpload">업로드하기</button>
</form>
</body>
</html>