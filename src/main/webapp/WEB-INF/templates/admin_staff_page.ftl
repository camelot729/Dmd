<!DOCTYPE html>
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

<body data-spy="scroll" data-target="#navbar" data-offset="0">
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
                    <li><a href="/admin/offices">Office</a></li>
                    <li class="active"><a href="/admin/staff">Stuff</a></li>
                    <li><a href="/logout">Log out</a></li>
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
<br>
<br>

<section id="services">
    <div class="container">
        <div class="box first">
            <div class="row">
                <div>
                    <div class="center">

                        <a href="/admin/registration/staff" class="btn btn-lg btn-primary btn-default">New staff</a>

                    <#list staff.content as st>
                        <a href="/admin/staff/profile/${st.id}"><p>${st.firstname} ${st.surname}</p></a>
                    </#list>

                        <nav>
                            <ul class="pager">
                            <#if page == 0>
                                <li><a href="/admin/staff/0">Previous</a></li>
                            <#else>
                                <li><a href="/admin/staff/${page - 1}">Previous</a></li>
                            </#if>

                            <#if page < (maxpage - 1)>
                                <li><a href="/admin/staff/${page + 1}">Next</a></li>
                            <#else>
                                <li><a href="/admin/staff/${page}">Next</a></li>
                            </#if>
                            </ul>
                        </nav>

                    </div>
                </div><!--/.col-md-4-->
            </div><!--/.row-->
        </div><!--/.box-->
    </div><!--/.container-->
</section><!--/#services-->

<#include "footer.ftl">

<script src="/js/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.isotope.min.js"></script>
<script src="/js/jquery.prettyPhoto.js"></script>
<script src="/js/main.js"></script>
</body>
</html>