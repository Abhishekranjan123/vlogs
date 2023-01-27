<%@include file="defaultMenu.jsp"%>

<script type="text/javascript">
		function addPost() {
			$('#addPostForm').submit();
		}

	// 	function downloadPdf(invoiceNo, mid) {
	// 			alert(invoiceNo)
	// 			var settings = {
	// 				"url" : "${pageContext.request.contextPath}/invoice/generateInvoicePdf?invoiceNo="
	// 						+ invoiceNo + "&mid=" + mid,
	// 				"method" : "POST",
	// 				"timeout" : 0,
	// 			};
	// 			$.ajax(settings).done(function(response) {
	// 				console.log(response)
	// 			});

	// 		}

	// 		$.post(
	// 				"${pageContext.request.contextPath}/invoice/saveInvoice?invoiceData="
	// 						+ encodedString, function(response) {
	// 					if (response.status == 200) {
	// 						$("#formlistall").submit()
	// 					} else if (response.message == "Invoice no already exist") {
	// 						$("#invoicenomsg").removeClass('d-none')
	// 					}

	// 				});

	// 		console.log($('#postMedia').val());
	// 		console.log($("#postState").val());
	// 		var file = document.getElementById("postMedia").value
	// 		var state = document.getElementById("postState").value
	// 		console.log(file);
	// 		console.log(state);
	// 		$.ajax({
	// 			url : "/addPost?file="+file+"&state="+state,
	// 			type : "POST",
	// 			success : function(result) {
	// 				console.log(result);
	// 			},
	// 			error : function(error) {
	// 				console.log(error);
	// 			}
	// 		})
	// 		console.log("ready!");
	// 	}
</script>


      <img src="file:///C:/Users/Abhishek%20Ranjan/OneDrive/Desktop/desktop/a.jpg" width="50" height="50" >
      





<!-- <form enctype='multipart/form-data' method='POST' action='/addPost'> -->
<!-- 	<input type='file' name='media' multiple> <input type="text" -->
<!-- 		name="state" /> <input type="text" name="city" /> <input type="text" -->
<!-- 		name="place" /> <input type="text" name="category" /> <input -->
<!-- 		type="text" name="discription" /> -->
<!-- 	<button type='submit'>Submit</button> -->
<!-- </form> -->


<!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-bs-toggle="modal"
	data-bs-target="#addPostModal">Add Post</button>

<!-- Modal -->
<div class="modal fade" id="addPostModal" tabindex="-1"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
				<button type="button" class="btn-close" data-bs-dismiss="modal"
					aria-label="Close"></button>
			</div>
			<div class="modal-body">

				<form enctype='multipart/form-data' method='POST' action='/addPost' id='addPostForm'>

					<div class="mb-3">
						<label for="formFileMultiple" class="form-label">Select Media</label> <input class="form-control" type="file"
							id="formFileMultiple" name='media' multiple required="required">
					</div>
					<div><input type="hidden" value="${user}" name="userId"> </div>
					<div class="mb-3 row">
						<div class="col">
							<input type="text" placeholder="Enter Location"
								class="form-control" name="place">
						</div>
						<div class="col">
							<select class="form-select" aria-label="Default select example"
								name="state">
								<option selected>Select State</option>
								<option value="1">One</option>
								<option value="2">Two</option>
								<option value="3">Three</option>
							</select>
						</div>
					</div>
					<div class="mb-3">
						<select class="form-select" aria-label="Default select example"
							name="city">
							<option selected>Select City</option>
							<option value="1">One</option>
							<option value="2">Two</option>
							<option value="3">Three</option>
						</select>
					</div>
					<div class="mb-3">
						<select class="form-select" aria-label="Default select example"
							name="category">
							<option selected>Select Category</option>
							<option value="1">One</option>
							<option value="2">Two</option>
							<option value="3">Three</option>
						</select>
					</div>
					<div class="mb-3">
						<textarea class="form-control" id="exampleFormControlTextarea1"
							placeholder="Write someting about this post" rows="3" name="discription"></textarea>
					</div>




				</form>


			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary"
					data-bs-dismiss="modal">Close</button>
				<button type="button" onclick="addPost()" class="btn btn-primary">Save
					changes</button>
			</div>
		</div>
	</div>
</div>