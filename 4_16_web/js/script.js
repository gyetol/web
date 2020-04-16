var images=['./images/a.jpg',
        './images/b.jpg',
        './images/c.jpg',
        './images/d.jpg',
        './images/e.jpg'
];
$(document).ready(function(){

});
/*내가 하는중
$(document).ready(function(){
    //클래스 action인 div 영역에 버튼을 추가
    $('<button>').appendTo($('div.action'));

    $(images).each(function (index,item) {
        $('button').eq(index).data('src',item);
    });

    //버튼을 클릭하면 이미지를 변경한다.
    $('button').click(function(){
       $('img').attr('src',$(this).data('index'));
    });
});
*/
 */

/*방법1
$(document).ready(function(){
   $(images).each(function(index,item){
     $('<button>',{
         text:item,
         data:{src:item}
     }).click(function(){
        $('img').attr('src',$(this).data('src'));
     }).appendTo('.action');
   });
});
*/

/*방법2
$.fn.bindClick=function(image){
    this.click(function () {
       $('img').attr('src',image);
    });
}
$(document).ready(function(){
    $(images).each(function(index,item){
        let btn=$('<button/>',{text:item});
        btn.bindClick(item);
        btn.appendTo($('.action'));
    });
});
*/
