$(function(){
	var span = '<span></span>';
	$('.menu li a').wrapInner(span);
	$('.menu_content ul:gt(0)').hide();
	$('.menu li').eq(0).addClass('selected')
			   .siblings().removeClass('selected');
	var menu_li = $('.menu li');

	$('.menu li').mouseover(function(){
		$(this).addClass('selected')
			   .siblings().removeClass('selected');
		
		var index = menu_li.index(this);
		$('.menu_content ul').eq(index).show()
							 .siblings().hide();
		
		return false;
	});

	$('.menu_content li').click(function(){
		var actionli = $(this).children().attr('href');
		
		$.ajax({
  		url: actionli,
  		success: function(data) {
    				$('#menuBody').html(data);
  		}
		});
		return false;
	});
});
function exitover() {
    document.getElementById("quit").className="exitover";
}
function exitout() {
    document.getElementById("quit").className="exitout";
}
