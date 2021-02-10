/**
 * The following JavaScript function utilises a AJAX request 
 * to connect to your servlet through the HTML form input
 */

$(document).ready(function () {
	$("#submit_btn").click(function () {		
		$('#form1').on('submit', function (e) {
			
			//Constants
			var url = 'http://localhost:8080/web-frameworks/Servlet';
			var data = {};
			
			//Get HTML object
			var object = $('#form1').serializeArray();

			//Convert to simple array string
			$(object).each(function (i, field) {
				data[field.name] = field.value;
			});
			
			//Post to server and get output
			$.post(url, data, function (output) {
				alert (output);
				$('#result').text(output);
			})
			
			//Prevent page from reloading
			e.preventDefault();
		})
	})
})