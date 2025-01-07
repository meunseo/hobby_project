<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 취미 리스트함</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #c2ed91; /* 배경색을 요청하신 #c2ed91로 변경 */
        margin: 0;
        padding: 0;
    }
    .container {
        width: 80%;
        margin: 50px auto;
        background-color: #ffffff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    }
    h2 {
        text-align: center;
        color: #333;
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
    }
    th, td {
        padding: 12px;
        text-align: center;
        border: 1px solid #ddd;
    }
    th {
        background-color: #4CAF50;
        color: white;
    }
    td {
        background-color: #f9f9f9;
    }
    td form {
        display: flex;
        justify-content: center;
    }
    td input[type="submit"] {
        padding: 8px 16px;
        font-size: 14px;
        background-color: #e74c3c;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }
    td input[type="submit"]:hover {
        background-color: #c0392b;
    }
    .message {
        color: green;
        text-align: center;
        font-size: 16px;
        margin-top: 20px;
    }
    .error {
        color: red;
        text-align: center;
        font-size: 16px;
        margin-top: 20px;
    }
    .footer {
        text-align: center;
        margin-top: 30px;
    }
    .footer input[type="submit"] {
        padding: 10px 20px;
        font-size: 16px;
        background-color: #3498db;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        margin: 10px;
    }
    .footer input[type="submit"]:hover {
        background-color: #2980b9;
    }
</style>
</head>
<body>

<div class="container">
    <h2>내 취미 리스트함</h2>

    <!-- 메시지 표시 -->
    <c:if test="${not empty message}">
        <div class="message">${message}</div>
    </c:if>

    <c:if test="${not empty membershipsList}">
        <table>
            <thead>
                <tr>
                    <th>모임 제목</th>
                    <th>모임 장소</th>
                    <th>모임 시간</th>
                    <th>탈퇴</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="memberships" items="${membershipsList}">
                    <tr>
                        <td>${memberships.title}</td>
                        <td>${memberships.meetingplace}</td>
                        <td>${memberships.meetingtime}</td>
                        <td>
                            <form action="/hobby/unjoin" method="post">
                                <input type="hidden" name="mm_num" value="${memberships.mm_num}"/>
                                <input type="submit" value="모임 탈퇴하기"/>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>

    <!-- 성공 메시지 -->
    <c:if test="${not empty success}">
        <div class="message">${success}</div>
    </c:if>

    <!-- 실패 메시지 -->
    <c:if test="${not empty fail}">
        <div class="error">${fail}</div>
    </c:if>

    <div class="footer">
        <form action="/hobby/main" method="post">
            <input type="submit" value="메인페이지" />
        </form>
        <form action="/hobby/logout" method="post">
            <input type="submit" value="로그아웃" />
        </form>
    </div>
</div>

</body>
</html>
