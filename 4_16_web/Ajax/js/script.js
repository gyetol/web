$(document).ready(function () {
   $.ajax({
       url:'http://localhost:8080/Ajax/data.txt'
   }).done(function (data) {
       var items=eval('('+data+')');
       $(items).each(function (index, item) {
           $('<div/>',{text:item.title}).appendTo($('body'));
       });
   })
});