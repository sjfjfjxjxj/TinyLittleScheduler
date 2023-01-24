<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>심플스케줄러</title>
<link rel="stylesheet" href="/resources/main.css">
</head>
<body>
<%-- <c:if test = "${sessionScope.memberId eq null}"> --%>
 <div id="container">
        <div id="headernav">
            <header>
                <div id="logo">심플스케줄러</div>
                
               	<form action = "/member/login.do" method="post">
	                    <ul>
	                        <div id="login-area1"><li class="input">ID<input type="text"  name="mem-id"></li></div>
	                        <div id="login-area2"><li class="input">PW<input type="password" name="mem-pw"></li></div>
	                    </ul>
                        <div id="login-area3"><input type="image" id="login" src="/resources/login.png" alt="로긴"></div>
                        <div id="login-area4"><a href="#"><img id="signup" src="/resources/signup.png" alt="가입"></a></div>
            	    </form>
            	    
            </header><br>
            <nav>
                <ul id="menus">
                    <li class="menu">나의 전체 일정 보기</li>
                    <li class="menu">공식 일정만 보기</li>
                    <li class="menu">개인 일정만 보기</li>
                    <li class="menu">날짜검색으로 일정 보기</li>
                    <li class="menu">¤</li>
                    <li class="menu">새 일정 입력하기</li>
                    <li class="menu">일정 수정하기</li>
                    <li class="menu">일정 삭제하기</li>
                </ul><br>
                <p>로그인을 해주세요!</p>
            </nav>
        </div>
        <main>
           <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        </main>
        <footer>
            <div>ⓒTinyTinyProjectByMinaHeo</div>
        </footer>
    </div>


</body>
</html>