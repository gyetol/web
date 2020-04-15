$(document).ready(function () {
    $('#btnCheck').click(function () {
        if($('#name').val().trim()==''){
            alert("이름 입력해유");
            $('#name').val('');
            $('#name').focus();
            $('#checkName').val('');
            return;
        }
        alert('이름 검사가 완료되었소');
        $('#checkName').val('checked');
    });

    $('#submitCheck').click(function () {
       if(('#checkName').val()!='checked'){
           $('#btnCheck').trigger('click');
           return;
       }
       alert("내용을 전송합니다.");
    });


    setTimeout(function(){
        $('input[type=button]').trigger('click');
},2000);
});