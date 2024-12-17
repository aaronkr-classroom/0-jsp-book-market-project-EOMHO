<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:include page="header.jsp" />

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>환영합니다!</title>
    <link rel="stylesheet" href="public/css/style.css">
</head>
<body>
    <h1>안녕, <%= request.getParameter("name") %>!</h1>
    <p>회원가입이 완료되었습니다.</p>

    <jsp:include page="footer.jsp" />
</body>
</html>
