<!DOCTYPE html>
<html lang="en">
<head>

    <?php
        $title = "Selly Oak Late";
        $fileData = array();
        $file = fopen("current.txt", "r");
        while (!feof($file) ) {
            $line = fgets($file);
            $fileData[] = explode(' ', $line);
        }
    ?>

    <title><?php echo $title; ?></title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="css/mainJack.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <!-- Global site tag (gtag.js) - Google Analytics -->
    <script async src="https://www.googletagmanager.com/gtag/js?id=UA-67080220-5"></script>
    <script>
        window.dataLayer = window.dataLayer || [];
        function gtag(){dataLayer.push(arguments);}
        gtag('js', new Date());

        gtag('config', 'UA-67080220-5');
    </script>

</head>
<body>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#"><?php echo $title; ?></a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
        </ul>
    </div>
</nav>

<div>

    <div class="jumbotron" id="padder">
        <h1 class="heading" id="makeCenter">Since: <?php echo implode(" ", $fileData[1]); ?></h1>
        <h1 class="time" id="makeCenter">Delay (hr:min): 000:00</h1>
    </div>

</div>


<div class="container">
    <div class="center">&copy <?php echo date("Y"); ?> Jack Ferguson</div>
</div>

</body>

<script src="js/mainJack.js"></script>

</html>
