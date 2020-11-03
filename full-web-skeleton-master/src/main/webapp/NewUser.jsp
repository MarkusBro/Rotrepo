<%--
  Created by IntelliJ IDEA.
  User: Markus Brødsjø
  Date: 29.10.2020
  Time: 09.13
  To change this template use File | Settings | File Templates.
--%>


<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>NewUser</title>
    <%@ page contentType="text/html; charset=UTF-8" %>
    <%@include file="cssLoader.jsp" %>
</head>
<body>


<div class="hero">


    <div class="navbar">
        <img src="${pageContext.request.contextPath}/bilder/norges-roforbund-logo.png" class="logo"
             onclick="location.href='index.jsp'">
    </div>


    <div class="newUser">
        <% if (request.getAttribute("error") != null) {
            out.println("<div class='alert alert-danger'>" + request.getAttribute("error") + "</div>");
        } %>
        <form action="${pageContext.request.contextPath}/AddUser" method="POST">
            <h3>Legg til ny bruker</h3>
            <div class="textbox">
                <input type="text" placeholder="Email" name="email" value="">
                <input type="password" placeholder="Passord" name="passord" value="">
                <input type="text" placeholder="Fornavn" name="fname" value="">
                <input type="text" placeholder="Etternavn" name="lname" value="">
                <input type="date" placeholder="Fødselsdato" name="dob" value="">
                <input type="text" placeholder="Klubb" name="klubb" value="">
                <br/>
                <label for="usertype">Velg din brukertype</label>
                <select name="usertype" id="usertype">
                    <option value="Utøver">Utøver</option>
                    <option value="Trener">Trener</option>
                    <option value="Admin">Admin</option>
                </select>
                <br/>
                <br/>
                <label for="klasse">Velg din klasse</label>
                <select name="klasse" id="klasse">
                    <option value="Senior mann">Senior mann</option>
                    <option value="Senior dame">Senior dame</option>
                    <option value="A gutter">A gutter</option>
                    <option value="A jenter">A jenter</option>
                    <option value="B gutter">B gutter</option>
                    <option value="B jenter">B jenter</option>
                    <option value="C gutter">C gutter</option>
                    <option value="C jenter">C jenter</option>
                </select>
                <textarea id="bio" name="bio" rows="4" cols="50" placeholder="Bio"></textarea>
                <input class="btn btn-primary" type="submit" name="" value="Legg til bruker">
            </div>
        </form>

    </div>

    </div>
</body>
</html>
<style>
    .newUser {
        background-color: darkgray;
        width: 500px;
        height: 300px;
        box-sizing: border-box;
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        color: white;;
    }

    .textbox {
        justify-content: space-between;
    }

    input {
        padding-bottom: 25px;
        width: 200px;
    }

    input[type=text] {
        border: 2px solid darkgrey;
        border-radius: 10px;
    }

    input[type=date] {
        border: 2px solid darkgrey;
        border-radius: 10px;
    }
</style>