<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>공지사항 작성</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <div class="container">
        <h2>공지사항 작성</h2>
        <form action="${pageContext.request.contextPath}/notice/write" method="post" class="notice-form">
            <div class="form-group">
                <label for="n_category">구분</label>
                <select name="n_category" id="n_category" required>
                    <option value="일반">일반</option>
                    <option value="오픈소식">오픈소식</option>
                    <option value="서비스">서비스</option>
                    <option value="당첨자발표">당첨자발표</option>
                </select>
            </div>
            <div class="form-group">
                <label for="n_title">제목</label>
                <input type="text" name="n_title" id="n_title" required>
            </div>
            <div class="form-group">
                <label for="n_content">내용</label>
                <textarea name="n_content" id="n_content" rows="10" required></textarea>
            </div>
            <div class="form-actions">
                <button type="submit" class="btn">저장</button>
                <a href="${pageContext.request.contextPath}/notice/list" class="btn">취소</a>
            </div>
        </form>
    </div>
</body>
</html>
