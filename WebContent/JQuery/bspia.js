$(function(){
	
	$('.buttonUl li').click(function(){
		var actionli = $(this).children().attr('href');
		if(actionli){
				$.ajax({
		  		url: actionli,
		  		success: function(data) {
		    				$('#menuBody').html(data);
		  		}
				});
		}
		
		return false;
	});
	
	
	var options = { 
	    target:'#menuBody',
	    beforeSubmit:doPrepareCheckbox
	};
	
	if($('#editForm')){
		$('#editForm').ajaxForm(options);
	}
	/*****
	var options1 = { 
	    target:'#queryResultList'
	};	
	
	if($('#queryForm')){
		$('#queryForm').ajaxForm(options1);
	}	
	******/
	if($('.inputDatetime')){
		$('.inputDatetime').datepicker();
	}
	
	$('.basic-table-sh').tablesorter( {sortList: [[0,0], [1,0]]} );
});

function doPrepareCheckbox(formData,jqForm,options){
	$('.bscheckbox').each(function(){
		if($(this).attr("checked")){
		}else{
			formData.push({name: this.name, value: 'unchecked'});
		}
	});
}