/*
var popupHtml=  ''
    +'<div class="popup">'
    +'<ul>'
    +'<li class="message"></li>'
    +'<li class="action">'
    +'<button class="btn btn-blue" type="button">닫기</button>'
    +'</li>'
    +'</ul>'
    +'</div>';

$(document).ready(function () {
    $('.openPopup').click(function () {
       let popup=$(popupHtml);
       popup.find('message').text('팝업창 메시지를 입력합니다');
       popup.find('button').click(function () {
          $(this).closest('.popup').remove();
       });
       popup.appendTo($('body'));
    });
});
*/


///////////////////////////////////////////////////////////

$.fn.openPopup=function(msg,func){
    this.click(function () {
        $('.popup').find('.message').text(msg);
        $('.popup').find('button').click(function () {
            if(func){
                func();
            }
           $(this).closest('.popup').css('display','none') ;
           $(this).off('click');
        });
        $('.popup').css('display','block')
    });
}

$(document).ready(function () {
    $('.openPopup').openPopup('데이터를 전송하시겠습니까?',function(){
        alert('팝업을 닫기 전에 작업 수행');
    });
});