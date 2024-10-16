<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>공지사항 목록</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <div class="container">
        <h2>공지사항 목록</h2>
        
        <!-- 카테고리 선택 버튼 -->
        <div class="category-buttons">
            <a href="${pageContext.request.contextPath}/notice/list?category=전체" class="btn">전체</a>
            <a href="${pageContext.request.contextPath}/notice/list?category=일반" class="btn">일반</a>
            <a href="${pageContext.request.contextPath}/notice/list?category=오픈소식" class="btn">오픈소식</a>
            <a href="${pageContext.request.contextPath}/notice/list?category=서비스" class="btn">서비스</a>
            <a href="${pageContext.request.contextPath}/notice/list?category=당첨자발표" class="btn">당첨자발표</a>
        </div>

        <!-- 공지사항 목록 테이블 -->
        <table class="notice-table">
            <thead>
                <tr>
                    <th>번호</th>
                    <th>구분</th>
                    <th>제목</th>
                    <th>등록일</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="notice" items="${noticeList}">
                    <tr>
                        <td>${notice.nidx}</td>
                        <td>${notice.ncategory}</td>
                        <td><a href="${pageContext.request.contextPath}/notice/detail?nIdx=${notice.nidx}">${notice.ntitle}</a></td>
                        <td>${notice.nregdate}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <div class="notice-actions">
            <a href="${pageContext.request.contextPath}/notice/write" class="btn">글쓰기</a>
        </div>
    </div>
</body>
</html>
