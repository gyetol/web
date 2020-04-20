String.prototype.isEmpty = function(){
    return (this.trim()=='');
}

$.fn.isEmpty=function(){
    return ($(this).val().trim()=='');
}

$.fn.equals=function(obj){
    return ($(this).val()==obj.val());
}
function refresh() {
    $.ajax({
        url: '/members',
        type: 'get',
        success: function (data) {
            $(data).each(function (index, item) {
                let ul = $('<ul/>');
                $('<li/>', {text: item.email}).appendTo(ul);
                $('<li/>', {text: item.nick}).appendTo(ul);
                $('<li/>', {text: item.regdate}).appendTo(ul);
                let status = item.removeAt ? '가입중' : '탈퇴';
                $('<li/>', {text: item.status}).appendTo(ul);
                ul.appendTo($('.memberList'));
            });
        }
    });
}

$(document).ready(function(){
    var socket=io('http://192.168.30.129:8080');
    socket.on('refresh',function (data) {
       refresh();
    });

    refresh();
    $('#btnRegister').click(function () {
        if($('#email').val().isEmpty()){
            alert('이메일을 입력해주세요!');
            $('#email').val('').focus();
            return;
        }

        if($('#nick').isEmpty()){
            alert('별명을 입력해주세요!');
            return;
        }

        if($('#password').isEmpty()){
            alert('비밀번호를 입력해주세요!');
            return;
        }

        if($('#password').equals($('#password2'))){
            alert('비밀번호가 일치하지 않습니다.');
            return;
        }
        $.ajax({
            url:'/members',
            type:'post',
            data:{
                email:$('#email').val(),
                nick:$('#nick').val(),
                password:$('#password').val()
            },
            success:function (data) {
                switch (data.errno) {
                    case 0:
                        alert(data.message);
                        break;
                    case 1:
                        alert(data.message);
                        $('#email').val('').focus();
                        break;
                    case 2:
                        alert(data.message);
                        $('#nick').val('').focus();
                        break;
                    case 3:
                        alert(data.message);
                        $('#password').val('').focus();
                        $('#password2').val('').focus();
                        break;
                    default:
                        alert(data.message);
                        break;
                }
            }
        });


    });
});