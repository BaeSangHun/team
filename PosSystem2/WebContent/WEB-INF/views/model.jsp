<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<title>POS_SysTem</title>
	
	
	<link rel="stylesheet" href="./resources/assets/css/styles.css" />
	
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
 	 <meta name="viewport" content="width=device-width, initial-scale=1">
 	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>

	<script type="text/javascript"> 
		$(document).ready(function(){
			$('#btn').click(function(){
				 var regExp = /\s/g;//공백이 있나 확인하는 정규식
				 var id = $('#id').val();
				 var pw = $('#pw').val();
			if($('#id').val()==""||id.match(regExp)) {
				$('#idre').html("<font color=red>입력란에 공백을 확인하세요</font>");
				$('#idre').show();
				$('#id').focus();
			}
			else if($('#pw').val()==""||pw.match(regExp)) {
				$('#idre').hide();
				$('#pwre').html("<font color=red>패스워드 입력란에 공백을 확인하세요</font>");
				$('#pwre').show();	
				$('#pw').focus();
			}
			else{
				frm.submit();
			}
			
			
			});
		});
	
	</script>	

<body>
<!--------------------------------- 탑 메뉴  ------------------------------------>
<br>
<br>
<div class="top_menu">
	<div class="top_banner_left">&nbsp;&nbsp;<Font style="font-size:30px;"><B>POS시스템</B></Font>
	&nbsp;&nbsp;&nbsp;&nbsp;
</div>

<!--------------------------------- 로그인 ------------------------------------>

<br>
<br>
<br>
<br>
<br>

	<section class="loginform cf">
		<form name="frm" action="j_spring_security_check" method="post">
			
				
				<label for="userID">ID</label>
				<input id = "id" type="userID" name="username" placeholder="ID">
				<div class="col-sm-offset-2 col-sm-10">
       			<div id="idre" style="display:none;"></div> 
    			</div>
				
				<label for="password">Password</label>
				<input id = "pw" type="password" name="password" placeholder="PASSWORD"></li>
				<div class="col-sm-offset-2 col-sm-10">
				<div id="pwre" style="display:none;"></div>
				</div>
				
				<input  type="button" id="btn" value="로그인"/>
				
			
			
		<%-- 	 <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
  --%>
		</form>
		
	</section>
		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>

</body>
</html>
