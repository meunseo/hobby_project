<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
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
    width: 600px;
    padding: 20px;
    background-color: #dbf5bc;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
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
    padding: 12px;
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
td form {
    display: inline-block;
    text-align: center;  /* form 내에서 버튼을 중앙 정렬 */
}
td input[type="submit"] {
    padding: 8px 16px;
    font-size: 14px;
    background-color: #2c6ac7;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}
td input[type="submit"]:hover {
    background-color: #007BB5; /* 마우스를 올렸을 때 색상 변경 */
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
    margin-top: 10px;
}
input[type="submit"]:hover {
    background-color: #45a049;
}
</style>
</head>
<body>
<div class="container">
    <h2>게시판</h2>
    <table>
        <thead>
            <tr>
                <th>제목</th>
                <th>개설자</th>
                <th>자세히</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="hobbyboard" items="${hobbyBoardList}">
                <tr>
                    <td>${hobbyboard.title}</td>
                    <td>${hobbyboard.nickname}</td>
                    <td>
                        <form action="/hobby/viewdetails" method="post">
                            <input type="hidden" name="hb_num" value="${hobbyboard.hb_num}">
                            <input type="submit" value="더보기"/>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <form action="/hobby/opening" method="post">
        <input type="submit" value="개설하기" />
    </form>
    <form action="/hobby/main" method="post">
        <input type="submit" value="메인페이지" />
    </form>
</div>
</body>
</html>
