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
                    <li class="active"><a href="/staff">Profile</a></li>
                    <li><a href="/staff/booking">booking</a></li>
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


<section id="services">
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
                <div class="panel panel-info">
                    <div class="panel-heading">

                        <h3 class="panel-title">${staff.surname} ${staff.firstname}</h3>
                    </div>
                    <div class="panel-body">
                    <div class="row">
                    <div class="col-md-3 col-lg-3 " align="center">
                    <#if staff?? && staff.sex??>
                        <#if staff.sex == 'MALE'>
                            <img alt="User Pic"
                                 src="/images/ico/doctorM.jpg"
                                 class="img-circle img-responsive"></div>
                        <#else>
                            <img alt="User Pic"
                                 src="/images/ico/doctorF.jpg"
                                 class="img-circle img-responsive"></div>
                        </#if>
                    <#else>
                        <img alt="User Pic"
                             src="/images/ico/doctorM.jpg"
                             class="img-circle img-responsive"></div>
                    </#if>

                        <div class=" col-md-9 col-lg-9 ">
                            <table class="table table-user-information">
                                <tbody>

                                <tr>
                                <tr>
                                    <td>Gender</td>
                                    <td>
                                    ${staff.sex}
                                    </td>
                                </tr>

                                <tr>
                                    <td>Email</td>
                                    <td>
                                        <a href="">${staff.email}</a>
                                    </td>
                                </tr>

                                </tr>

                                </tbody>
                            </table>

                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
    </div>
</section><!--/#services-->

<#include "footer.ftl">

<script src="/js/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.isotope.min.js"></script>
<script src="/js/jquery.prettyPhoto.js"></script>
<script src="/js/main.js"></script>
</body>
</html>