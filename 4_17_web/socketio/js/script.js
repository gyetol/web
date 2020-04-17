$(document).ready(function () {
   var socket=null;

   $('.intro>button').click(function(){
      if($(this).siblings('#name').val().trim()==''){
         alert('이름입력한 후에 연결해주세요');
         return;
      }
      socket=io('http://192.168.30.129:8080');

      socket.on('hello',function (data) {
         $('textarea').val('');
         $('textarea').val(data+'\n');
      });

      socket.on('msg',function (data) {
         $('textarea').val($('textarea').val()+data+'\n');
      });


      socket.emit('who',$(this).siblings('#name').val().trim());
   });

   $('.action>button').click(function () {
      if(socket==null){
         alert('채팅서버에 접속 후 사용하시기 바랍니다.');
         return;
      }
      if($('#msg').val().trim()!='') {
         socket.emit('msg', $('#msg').val());
      }
   });

   $('#msg').keyUp(function (e) {
      if(e.keyCode==13) {
         $('.action>button').trigger('click')
      }
   });

});