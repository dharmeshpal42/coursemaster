<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD Operation in SpringBoot</title>
</head>
<body>
<c:choose>
    
           <c:when test = "${mode =='form'}">
             <form action="insert" method= "post">
                <input type= "text" name="courseName" placeholder="enter name">
                <input type = "text" name = "courseFees" placeholder="enter fees">
                <input type="submit" value="submit">
             </form>
           </c:when>
           
           
           <c:when test = "${mode == 'edit' }">
              <form action ="insert" method = "post">
                 <input type = "hidden" name = "courseId" value = "${coursesedit.courseId}">
                 <input type = "text" name = "courseName" value = "${coursesedit.courseName}" placeholder = "Enter Name">
                 <input type = "text" name = "courseFees" value = "${coursesedit.courseFees}" placeholder = "Enter Fees">
                 <input type = "submit" value="update">
              </form>
           </c:when>
           
           
           <c:when test="${mode =='show'}">
           <table border="1">
           <thead>
           <tr>
           <td>CourseId</td>
           <td>CourseName</td>
           <td>CourseFees</td>
           <td>Edit</td>
           <td>Delete</td>
           </tr>
           </thead>
           <tbody>
           <c:forEach items="${courses}" var = "course">
           <tr>
           <td>${course.courseId}</td>
           <td>${course.courseName}</td>
           <td>${course.courseFees}</td>
           <td><a href="update?courseId=${course.courseId}">Edit</a></td>
            <td><a href="delete?courseId=${course.courseId}">Delete</a></td>
           </tr>
           </c:forEach>
          </tbody>
           </table>
           </c:when>




</c:choose>
</body>
</html>