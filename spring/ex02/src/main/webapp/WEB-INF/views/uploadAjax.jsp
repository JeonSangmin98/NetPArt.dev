<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Upload with Ajax</h1>
	<div class="uploadDiv">
		<input type="file" name="uploadFile" multiple>
	</div>
	<button id="uploadBtn">Upload</button>
	<div class="uploadResult">
		<ul>
			
		</ul>
	</div>
	<script src="/resources/vendor/jquery/jquery.min.js"></script>
	<script type="text/javascript">
		var regex = new RegExp("(.*?)\.(exe|sh|zip|alz)$");
		var maxSize = 5242880; //5mb

		function checkExtension(fileName, fileSize) {
			if (fileSize >= maxSize) {
				alert("파일 사이즈 초과");
				return false;
			}

			if (regex.test(fileName)) {
				alert("해당 종류의 파일은 업로드할 수 없습니다.");
				return false;
			}
			return true;
		}//checkExtension
		
		var uploadResult = $(".uploadResult ul");
		function showUploadFile(uploadResultArr){
			var str = "";
			$(uploadResultArr).each(function(i,obj){
				str += "<li>" + obj.fileName + "</li>";
			});
			uploadResult.append(str);
		}//showUploadFile
		
		$(function() {
			var cloneObj = $(".uploadDiv").clone();
			$("#uploadBtn").on("click", function() {
				var formData = new FormData();
				var inputFile = $("input[name='uploadFile']");
				var files = inputFile[0].files;
				console.log(files);

				for (var i = 0; i < files.length; i++) {
					if (!checkExtension(files[i].name, files[i].size)) {
						return false;
					}
					formData.append("uploadFile", files[i]);
				}// end for

				$.ajax({
					url : 'uploadAjaxAction',
					processData : false,
					contentType : false,
					data : formData,
					type : 'post',
					dataType : 'json',
					success : function(result) {
						// alert("Uploaded");
						console.log(result);
						showUploadFile(result);
						$(".uploadDiv").html(cloneObj.html());
					}
				}); // end $.ajax
			});
		});
	</script>
</body>
</html>