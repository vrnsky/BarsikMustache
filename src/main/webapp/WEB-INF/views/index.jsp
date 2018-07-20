<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Barsik Mustache | Main Page</title>
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
        <p>A simple TO DO app</p>
    </div>
</section>
<section>
    <div class="container">
        <div class="row">
            <div class="col-md-8">
                <table class="table table-striped">
                    <tr>
                        <td>ID</td>
                        <td>Description</td>
                    </tr>
                </table>
            </div>
            <div class="col-md-4">
                <a href="/items/add"><input type="submit" value="Add a new item" class="btn btn-default btn-primary"/></a>
            </div>
        </div>
    </div>
</section>
</body>
</html>
