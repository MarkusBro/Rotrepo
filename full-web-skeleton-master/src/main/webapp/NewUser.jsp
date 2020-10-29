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
    <%@include file="cssLoader.jsp" %>
</head>
<body>


<div class="hero">


    <div class="navbar">
        <img src="${pageContext.request.contextPath}/bilder/norges-roforbund-logo.png" class="logo"
             onclick="location.href='index.jsp'">
    </div>


    <div class="newUser">

        <form action="${pageContext.request.contextPath}/Login" method="POST">
            <h1>Legg til ny bruker</h1>
            <div class="textbox">
                <input type="text" placeholder="Email" name="name" value="">
                <input type="text" placeholder="Passord" name="passord" value ="">
                <input type="text" placeholder="Fornavn" name="name" value="">
                <input type="text" placeholder="Etternavn" name="name" value="">
                <input type="date" placeholder="Fødselsdato" name="date" value="">
                <input id="bio"type="text" placeholder="Bio" name="bio" value="">
                <input class="btn btn-primary" type="submit" name="" value="Logg inn">
            </div>

        </form>
    </div>


</div>
<style>
    .newUser{
        background-color: darkgray;
        width: 500px;
        height: 500px;
        box-sizing: border-box;
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%,-50%);
        color:white;;
    }
    .textbox{
        justify-content: space-between;
    }
    #bio{
        width: border-box;
        height: 100px;
    }

</style>
</body>
</html>
