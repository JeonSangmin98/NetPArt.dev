<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function checkForm() {
		/* alert("아이디 : " + document.loginForm.id.value + "\n" + "비밀번호 : " + document.loginForm.passwd.value); */
		var form = document.loginForm;
		
		/* 데이터 유무 */
		if (form.id.value == '') {
			alert("아이디를 입력해주세요.");
			form.id.focus();
			return false;
		} else if (form.passwd.value == '') {
			alert("비밀번호를 입력해주세요.");
			form.passwd.focus();
			return false;
		}
		
		/* 길이 체크 */
		if(form.id.value.length < 4 || form.id.value.length>12){
			alert("아이디는 4~12자 이내로 입력해주세요.");
			form.id.focus();
			return false;
		} else if(form.passwd.value.length < 4){
			alert("비밀번호는 4자 이상으로 입력해주세요.");
			form.passwd.focus();
			return false;
		}
		
		
		for(i = 0; i<form.id.value.length; i++){
			var ch = form.id.value.charAt(i);
			
			if(!(ch>='a' && ch<='z')){
				alert("아이디는 영문 소문자만 입력 가능합니다.");
				form.id.select();
				return false;
			}
		}
		/* 숫자 여부 */
		if (isNaN(form.passwd.value)) {
			alert("비밀번호는 숫자만 입력 가능합니다!");
			form.passwd.select();
			return false;
		}
		
		form.submit();
	}//checkForm
</script>
</head>
<body>
	<form name="loginForm" method="post" action="validation01_process.jsp">
		<p>
			아 이 디 : <input type="text" name="id">
		<p>
			비밀번호 : <input type="password" name="passwd">
		<p>
			<input type="button" value="전송" onclick="checkForm()">
	</form>
</body>
</html>