$.fn.changeImage=function(items){
    this.click(function() {

    })
}

$(document).ready(function () {
    //$.ajax() 메서드를 이용하여 data.txt. 파일을 요청하여
    //서버가 응답한 데이터를 이용하여 thumb 영역에 작은 이미지를 추가한다.
    $.ajax({
        url:'http://localhost:8080/webSetting/data.txt',
        success:function (data) {
            alert(data);
         }
    });
    //thumb영역에 추가된 이미지를 클릭하면 클릭된 이미지로
    //preview 영역의 이미지를 변경되도록 작성

});
