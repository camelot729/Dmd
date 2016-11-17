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
<#include "headerClient.ftl">
<br>
<br>
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

                        <#list list as l>
                            <a href="/client/myBooking/${l.getValue()}"><p>${l.getKey()}</p></a>
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