/**
 * The following JavaScript function utilises a jQuery and AJAX request to connect to your servlet through the HTML form input
 */
$(document).ready(function () {

	$("#submitButton").click(function () {
		var dataArray = $("#userInputForm").serializeArray(),
			dataObj = {};

		$(dataArray).each(function (i, field) {
			dataObj[field.name] = field.value;
		});

		//alert (dataObj['firstName'] + " " +  dataObj['lastName'])


		$('#userInputForm').on('submit', function (e) {
			$.post('http://localhost:8080/SimpleFormArchitecture/Servlet', 
				{
					s_FirstName: dataObj['firstName'],
					s_LastName: dataObj['lastName']
				},
				function (data, status) {
					//This gets executed when post is successful
					//alert(data + "/" + status);
					$("#AjaxServletResponse").text(data);
					
				}).error(function () {
				// This is executed when the call to post failed
			});
			//We now prevent the page from refreshing after post
			e.preventDefault();
		});
	});
});