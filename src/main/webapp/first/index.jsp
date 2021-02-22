<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Task 1</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form action="firstIndex" method="post">
        <div class="mb-3">
            <label class="form-label">Name:</label>
            <input type="text" name="name" class="form-control">
        </div>
        <input type="submit" class="btn btn-primary" value="Submit">
    </form>
</div>
</body>
</html>