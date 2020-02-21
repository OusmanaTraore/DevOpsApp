<!DOCTYPE html>
<html>

<head>
    <title>Application DevOps</title>
    <meta charset="UTF-8"/>
</head>

<body>
    <header style="background-color:powderblue;">
        <h1>Welcome to the DevOps Application
            <img src="/images/chocobo.jpg" alt="une image de chocobo" style="float:right;width:233px;height:175px;"/>
        </h1>        
    </header>

    <p>New game available:</p>

    <form action="/login" method="POST">
        Year of birth:<br>
        <input type="number" name="year"><br>
        Month of birth:<br>
        <input type="number" name="month"><br>
        Day of birth:<br>
        <input type="number" name="day"><br>
        <input type="submit" value="Submit">
    </form>
    
    <hr/>
    <footer>
        <p>&reg;Salut devops</p>
    </footer>
</body>
</html>