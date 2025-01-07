<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>취미 목록 보기</title>
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
table {
    width: 100%;
    border-collapse: collapse;
    margin-bottom: 20px;
}
th, td {
    padding: 10px;
    text-align: center;
    border: 1px solid #ccc;
}
th {
    background-color: #4CAF50;
    color: white;
}
td {
    background-color: #f9f9f9;
}
td a {
    text-decoration: none;
    color: #2c6ac7;
    font-weight: bold;
}
td a:hover {
    color: #007BB5; /* 마우스를 올렸을 때 색상 변경 */
}
form {
    margin-top: 20px;
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
}
input[type="submit"]:hover {
    background-color: #45a049;
}
</style>
</head>
<body>
<div class="container">
    <h2>취미 목록 보기</h2>
    <table>
        <thead>
            <tr>
                <th>취미 목록</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="hobby" items="${hobbyList}">
                <tr>
                    <td><a href="/hobby/searchbyname?h_name=${hobby.h_name}">${hobby.h_name}</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <form action="/hobby/main" method="post">
        <input type="submit" value="메인화면" />
    </form>
</div>
</body>
</html>
