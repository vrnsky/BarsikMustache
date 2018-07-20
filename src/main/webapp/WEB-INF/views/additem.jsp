<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Barsik Mustache | Add new item</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<section class="jumbotron">
    <div class="container">
        <h1>Barsik Mustache</h1>
        <p>Add a new item to your goals</p>
    </div>
</section>
<section>
    <div class="container">
        <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-4">
                <form:form modelAttribute="item" method="post" class="form">
                    <fieldset>
                        <legend>Adding a new item</legend>
                        <div class="form-group">
                            <label for="description">Descripion: </label>
                            <form:input path="description" name="description" id="description" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <input type="submit" value="Add a new item" class="btn btn-default btn-primary"/>
                        </div>
                    </fieldset>
                </form:form>
            </div>
        </div>
    </div>
</section>
</body>
</html>
