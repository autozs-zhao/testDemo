(function($){
	
	$.fn.extend({
		"page":function(){
			var self  = this;
			
			function getData(retu){
			
			}
			
			self.init = function(){
				
				$.ajax({
					url:"/test/t",
					dataType:'text',
					type:'GET',
					success:function(retu){
						getData(retu);
					}
				})
				
			}
			
			return self;
		}
	})
	
	$(document).ready(function(){
		$(document)["page"]().init();
	})
	
})(jQuery)