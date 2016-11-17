<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>CRM</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/font-awesome.min.css" rel="stylesheet">
    <link href="/css/prettyPhoto.css" rel="stylesheet">
    <link href="/css/main.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="/js/html5shiv.js"></script>
    <script src="/js/respond.min.js"></script>
    <![endif]-->
    <link rel="shortcut icon" href="/images/ico/logo3.png">
    <link rel="logo3-precomposed" sizes="144x144" href="/images/ico/logo3.png">
</head><!--/head-->
<body>



<header id="header" role="banner">
    <div class="container">
        <div id="navbar" class="navbar navbar-default">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/"></a>
            </div>
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="/staff">Profile</a></li>
                    <li class="active"><a href="/staff/booking">booking</a></li>
                    <li><a href="/logout">logout</a></li>
                </ul>
            </div>
        </div>
    </div>
</header><!--/#header-->


<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>


<section id="services">
    <div class="container">
        <div class="box first">
            <div class="row">
                <div>
                    <div class="center">
                    <p>Arrived :&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;Departed: &nbsp;&nbsp;&nbsp; Name: &nbsp;&nbsp;&nbsp; Surname :</p>
                    <#list list as l>
                        <p>${l.getKey()} &nbsp;&nbsp; ${l.getValue()}&nbsp;&nbsp;&nbsp; Zakirov&nbsp;&nbsp;&nbsp; Anvar</p>
                    </#list>

                    </div>
                </div><!--/.col-md-4-->
            </div><!--/.row-->
        </div><!--/.box-->
    </div><!--/.container-->
</section><!--/#services-->


<#include "footer.ftl">

</body>
</html>