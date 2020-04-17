const port=80;
var express=require('express');
var app=express();
var io=require('socket.io')(8080);
app.listen(port,function () {
    console.log(port+'번 포트로 웹 서버가 구동되었습니다.');
});

app.use(express.static('.'));

io.on('connection',function(socket){
    let id =socket.id;
    let user=null;
    console.log('클라이언트 접속 : '+id);

    socket.emit('hello','채팅서버에 접속되었습니다.');

    socket.on('who',function (data) {
        user=data;
        console.log('소켓 ['+id+']의 사용자명이 ['+user+']으로 설정되었습니다.');
    });

    socket.on('msg',function (data) {
        io.emit('msg',user+'>'+data);
    });
});
