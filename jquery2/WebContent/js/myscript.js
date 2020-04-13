var img=$('<img/>');

$(document).ready(function(){
	img.attr('src','./images/a.jpg')
	.css('width','200px')
	.css('border','2px solid red');
	img.appendTo($('body'));
	img.clone().appendTo($('body'));
})