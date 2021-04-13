<!DOCTYPE html>
<html lang="fr">
<head>
    <meta  http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/bootstrap/css/bootstrap.css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>GithubTracker</title>

    <nav class="navbar navbar-expand-sm bg-dark">
          <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="index.jsp">Accueil</a>
            </li>
            <li class="nav-item">
                <a class="nav-link"  href="<%= request.getContextPath() %>/githubers">githuber</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Contact</a>
            </li>
        </ul>
    </nav>
</head>
</html>
