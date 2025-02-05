<%-- 
    Document   : outcome
    Created on : 29 Jan 2025, 1:30:59 PM
    Author     : samuk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Outcome</h1>
        <%
            String tossValue = (String) request.getAttribute("tossValue");
            String guessValue = (String) request.getAttribute("guessValue");
            String outcome = (String) request.getAttribute("outcome");


        %>

        <p>
            Toss: <%=tossValue%><br>
            Guess: <%=guessValue%><br>
            Outcome: <%=outcome%>

        </p>
        <p>
            Please click <a href ="index.html"> here </a> to go to the main page.
        </p>
    </body>
</html>
