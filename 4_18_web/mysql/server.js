const port=80;
var express = require('express');
var mysql=require('mysql');
var bodyParser=require('body-parser');
var io=require('socket.io')(8080);

io.on('connection',function (socket) {
   console.log(socket.id);
});

var app = express();
var conn=mysql.createConnection({
   host: 'localhost',
   user:'nodejs',
   password:'1234',
   database:'nodejs'
});

String.prototype.isEmpty=function(){
    return (this.trim()=='');
}

app.use(bodyParser.urlencoded({extended:false}));
app.use(express.static('.'));

app.listen(port,function () {
    console.log(port+'포트로 서버를 구동하였습니다.');
});

app.get('/members',function (request, response) {
    conn.query('select * from members',function (error, result, fields) {
       response.send(result);
    });
});

app.post('/members',function (request, response) {
   let email=request.body.email;
   let nick=request.body.nick;
   let password=request.body.password;

   console.log(email+':'+nick+':'+password);

   if(email.isEmpty()){
       response.send({errno:1,message:'전자메일주소가 입력되지 않았습니다.'});
   }
   else if(nick.isEmpty()){
       response.send({errno:2,message:'별명을 입력하지 않았습니다.' });
   }
   else if(password.isEmpty()){
       response.send({errno:3,message:'비밀번호가 입력되지 않았습니다'});
   }
   else{
       let sql='insert into members(email,nick,keyString) values(?,?,password(?))';
       conn.query(sql,[email,nick,password],function (error) {
           if(error){
               response.send({errno:9,message:'SQL오류가 발생하였습니다.'});
               return;
           }
           io.emit('refresh','회원목록갱신요망'); //굳이 자바스크립트 객체로 보낼 필요가 없다.
           //io.emit('refresh',{message:'회원목록갱신요망'});
           response.send({errno:0,message:'회원가입이 정상적으로 처리되었습니다.'});
       });
   }
});
//서버 쪽에서 자바스크립트 객체로 날리고 있다.