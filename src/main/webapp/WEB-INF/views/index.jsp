
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KeepNote</title>
</head>
<body>
	<!-- Create a form which will have text boxes for Note ID, title, content and status along with a Send 
		 button. Handle errors like empty fields -->

 <form action="saveNote">
  <fieldset>
    <legend>Personal information:</legend>
    <h2> NoteId:</h2><br>
    <input type="number" name="noteId"><br>
    <h2>NoteTitle:</h2><br>
    <input type="text" name="noteTitle"><br>
    <h2>NoteContent:</h2><br>
    <input type="text" name="noteContent"><br>
    <h2>NoteStatus:</h2><br>
    <select id="noteStatus" name="noteStatus" value="select">
    <option value="active">Active</option>
    <option value="inactive">Inactive</option>
    </select>
    <br>
    <input type="submit" value="Submit">
  </fieldset>
</form>

	<!-- display all existing notes in a tabular structure with Id, Title,Content,Status, Created Date and Action -->
	<table>
      <c:forEach items="${info}" var="item">
                <tr>
                    <td><h2> Note-ID :</h2>
                    <td> <h3> ${item.noteId} </h3></td>
                </tr>
                <tr>
                    <td><h2> Note-Title :</h2>
                    <td> <h3> ${item.noteTitle} </h3></td>
                </tr>
                <tr>
                    <td><h2> Note-Content :</h2>
                    <td> <h3> ${item.noteContent} </h3></td>
                 </tr>
                <tr>
                    <td><h2> Note-Date :</h2>
                    <td> <h3> ${item.createdAt} </h3></td>
                  </tr>
                  <br>
                  <tr>
                    <td>
                        <form action="deleteNote">
                            <input type="hidden" name="noteId" value="${item.noteId}">
                            <button type="submit">Delete</button>
                        </form>
                    </td>
                  </tr>
      </c:forEach>
    </table>


</body>
</html>