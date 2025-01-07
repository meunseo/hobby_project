<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모임 개설하기</title>
<style>
body {
    background-color: #f0f8ff;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;  /* 화면 가로 중앙 정렬 */
    align-items: center;  /* 화면 세로 중앙 정렬 */
    height: 100vh;  /* 화면 전체 높이 사용 */
    font-family: Arial, sans-serif;
}
.container {
    width: 500px; /* 너비 500px */
    padding: 30px;
    background-color: #e6f7ff; /* 연한 파란색 배경 */
    border-radius: 15px; /* 둥근 모서리 */
    box-shadow: 0 6px 12px rgba(0, 0, 0, 0.1); /* 그림자 효과 */
    text-align: center;
}
h3 {
    color: #006bb3;
    margin-bottom: 20px;
}
form {
    width: 100%;
    display: flex;
    flex-direction: column;
    gap: 15px;
    margin-bottom: 20px;
}
input[type="text"], select {
    width: 100%;
    padding: 10px;
    font-size: 16px;
    border: 1px solid #ccc;
    border-radius: 5px;
}
input[type="submit"] {
    padding: 12px;
    font-size: 16px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}
input[type="submit"]:hover {
    background-color: #45a049;
}
p {
    font-size: 18px;
    color: #333;
}
button {
    padding: 10px 20px;
    font-size: 16px;
    background-color: #007bb5;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}
button:hover {
    background-color: #005f87;
}
</style>
</head>
<body>
<div class="container">
    <h3>모임 개설하기</h3>
    <form action="/hobby/hobbyopening" method="post">
        <label for="hobby">분류</label>
        <select name="hobby" id="hobby">
            <c:forEach var="hobby" items="${hobby}">
                <option value="${hobby.h_num}">${hobby.h_name}</option>
            </c:forEach>
        </select>

        <label for="title">제목</label>
        <input type="text" name="title" id="title" required/>

        <label for="content">내용</label>
        <input type="text" name="content" id="content" required/>

        <label for="meetingplace">장소</label>
        <input type="text" name="meetingplace" id="meetingplace" required/>

        <label for="meetingtime">시간</label>
        <input type="text" name="meetingtime" id="meetingtime" required/>

        <input type="submit" value="모임 개설하기" />
    </form>

    <!-- 성공 메시지 -->
    <c:if test="${not empty success}">
        <p style="color: green;">${success}</p>
        <form action="/hobby/viewhobbycategory" method="post">
            <button type="submit">확인하기</button>
        </form>
    </c:if>

    <!-- 실패 메시지 -->
    <c:if test="${not empty fail}">
        <p style="color: red;">${fail}</p>
    </c:if>

    <form action="/hobby/main" method="post">
        <input type="submit" value="메인페이지로 돌아가기" />
    </form>
</div>
</body>
</html>
