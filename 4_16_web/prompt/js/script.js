$.fn.getPrompt=function(msg){
    let field=this;
    this.focus(function () {
        let div=$('<div/>',{class:'prompt'}).appendTo($('body'));
        let ul=$('<ul/>').appendTo(div);
        let li =$('<li/>',{text:msg}).appendTo(ul);
        let li2=$('<li/>').appendTo(ul);
        let input=$('<input/>',{type:'text'}).appendTo(li2);
        let li3=$('<li/>').appendTo(ul);
        let btn=$('<button/>',{type:'button', text:'확인'}).appendTo(li3);
        btn.click(function () {
            $(field).val(input.val());
            $(this).closest('.prompt').remove();
        });
    });
}
$(document).ready(function () {
   /* $('#name').on('focus',function () {
        alert('포커스 이벤트 발생');
    });*/

   $('#name').getPrompt('이름을 입력해주세요.');
});