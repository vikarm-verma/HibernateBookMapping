<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>
</head>
<body>
 <form action="BookDetailController" method="post">
     <select name="bookName">
        <c:forEach var="book" items="${allBooks}">
            <option>${book.bookName}</option>        
        </c:forEach>
    </select>
	<select name="bookStudentName">
        <c:forEach var="book" items="${allBooks}">
            <option>${book.student.studentName}</option>        
        </c:forEach>
    </select>
    <select name="bookStudentClass">
        <c:forEach var="book" items="${allBooks}">
            <option>${book.student.studentClass}</option>        
        </c:forEach>
    </select>
    <p>Date: <input type="text" id="datepicker" name="datePickerControl"></p>

    <input type="submit" value="submit"/>
    </form>
</body>
</html>