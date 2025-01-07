<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 화면</title>
<style>
body {
    background-color: #c2ed91;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;  /* 화면 가로 중앙 정렬 */
    align-items: center;  /* 화면 세로 중앙 정렬 */
    height: 100vh;  /* 화면 전체 높이 사용 */
    font-family: Arial, sans-serif;
}
.container {
    width: 400px; /* 너비 400px */
    padding: 20px;
    background-color: #dbf5bc; /* 흰색 배경 */
    border-radius: 10px; /* 둥근 모서리 */
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* 그림자 효과 */
    text-align: center;
}
h2 {
    color: #272924;
    margin-bottom: 30px;
}
form {
    margin-bottom: 20px;
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
    background-color: #45a049;
}
</style>
</head>
<body>
<div class="container">
    <h2>메인 화면</h2>
    <form action="/hobby/viewhobbycategory" method="post">
        <input type="submit" value="취미 카테고리" />
    </form>
    <form action="/hobby/viewmymembershiplist" method="post">
        <input type="submit" value="내 모임 보기" />
    </form>
    <form action="/hobby/logout" method="post">
        <input type="submit" value="로그아웃" />
    </form>
</div>
</body>
</html>
