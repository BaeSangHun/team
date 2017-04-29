<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Apple-like Login Form | Tutorialzine Demo</title>
        
        <!-- Our CSS stylesheet file -->
        <link rel="stylesheet" href="./resources/assets/css/styles.css" />
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <script type="text/javascript"> 
		$(document).ready(function(){
			$('#btn').click(function(){
				 var regExp = /\s/g;//공백이 있나 확인하는 정규식
				 var id = $('#loginEmail').val();
				 var pw = $('#loginPass').val();
			if($('#loginEmail').val()==""||id.match(regExp)) {
				$('#idre').html("<font color=red>입력란에 공백을 확인하세요</font>");
				$('#idre').show();
				$('#loginEmail').focus();
			}
			else if($('#loginPass').val()==""||pw.match(regExp)) {
				$('#idre').hide();
				$('#pwre').html("<font color=red>패스워드 입력란에 공백을 확인하세요</font>");
				$('#pwre').show();	
				$('#loginPass').focus();
			}
			else{
				frm.submit();
			}
			
			
			});
		});
	
	</script>	
    <body>

		<div id="formContainer">
			<form id="login" name="frm" method="post" action="./">
				<a href="#" id="flipToRecover" class="flipLink">Forgot?</a>
				<input type="text" name="loginEmail" id="loginEmail" value="id" />
				<input type="password" name="loginPass" id="loginPass" value="pass" />
				<input type="button" id="btn" value="Login" />
			</form>
			<form id="recover" method="post" action="./">
				<a href="#" id="flipToLogin" class="flipLink">Forgot?</a>
				<input type="text" name="recoverEmail" id="recoverEmail" value="Email" />
				<input type="submit" name="submit" value="Recover" />
			</form>
		</div>

        <footer>
	        <h2><i>Tutorial:</i> Apple-like Login Form With CSS 3D Transforms</h2>
            <a class="tzine" href="http://tutorialzine.com/2012/02/apple-like-login-form/">Head on to <i>Tutorial<b>zine</b></i> to download this example</a>
        </footer>
        
        <!-- JavaScript includes -->
		<script src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
		<script src="assets/js/script.js"></script>

    </body>
</html>


