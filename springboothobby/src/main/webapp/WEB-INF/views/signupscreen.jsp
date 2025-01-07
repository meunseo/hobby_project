<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 화면</title>
<style>
body {
    background-color: #c2ed91;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;  /* 화면 가로 중앙 정렬 */
    align-items: center;  /* 화면 세로 중앙 정렬 */
    height: 100vh;  /* 화면 전체 높이 사용 */
}
.container {
    width: 400px; /* 너비 400px */
    max-width: 400px;
    padding: 20px; /* 패딩 */
    background-color: #dbf5bc; /* 흰색 배경 */
    border-radius: 10px; /* 둥근 모서리 */
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* 그림자 효과 */
}
.h2 {
    text-align: center;
    color: #272924;
    margin-bottom: 30px;
}
.formcss {
    margin-bottom: 15px; 
}
label {
    font-size: 16px;
    color: #313638; 
}
input[type="text"] {
    width: 100%;  /* 입력란이 전체 너비를 차지하도록 설정 */
    padding: 10px;
    font-size: 14px;
    margin-top: 5px;
    margin-bottom: 10px; /* 아래쪽 여백 추가 */
    margin-right: 10px; /* 오른쪽 여백 추가 */
    border: 1px solid #ccc;
    border-radius: 5px;
    box-sizing: border-box; /* padding과 border를 포함하여 크기 계산 */
}
input[type="submit"] {
    width: 100%;
    padding: 10px;
    font-size: 16px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    margin-top: 10px;
}
input[type="submit"]:hover {
    background-color: #45a049; /* 버튼에 마우스를 올렸을 때 색상 변경 */
}
.successcss {
    color: #3c9dc7; /* 초록색 텍스트 */
    text-align: center; /* 중앙 정렬 */
    margin-top: 20px; /* 위쪽 여백 */
}
</style>
</head>
<body>
<div class="container">
    <h2>회원가입</h2>
    <form action="/hobby/registeredmember" method="post">
        <div class="formcss">
            <label for="id">아이디</label>
            <input type="text" name="id" id="id" required />
        </div>
        <div class="formcss">
            <label for="password">비밀번호</label>
            <input type="text" name="password" id="password" required />
        </div>
        <div class="formcss">
            <label for="name">이름</label>
            <input type="text" name="name" id="name" required />
        </div>
        <div class="formcss">
            <label for="nickname">별명</label>
            <input type="text" name="nickname" id="nickname" required />
        </div>
        <div class="formcss">
            <label for="birth">생년월일 (예: 19900101)</label>
            <input type="text" name="birth" id="birth" placeholder="19900101" required />
        </div>
        <input type="submit" value="가입하기" />
    </form>

    <c:if test="${not empty message}">
        <p class="successcss">${message}</p>
    </c:if>
</div>
</body>
</html>
