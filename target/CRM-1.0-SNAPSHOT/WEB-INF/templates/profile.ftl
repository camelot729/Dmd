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
        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h3 class="panel-title">${client.surname} ${client.firstname}</h3>
                    </div>
                <div class="panel-body">
                <div class="row">
                <div class="col-md-3 col-lg-3 " align="center">
                <#if client?? && client.sex??>
                    <#if client.sex == 'MALE'>
                        <img alt="User Pic" style="width: 140px"
                             src="/images/ico/clientMale.png"
                             class="img-circle img-responsive"></div>
                    <#else>
                        <img alt="User Pic" style="width: 200px"
                             src="/images/ico/clientFemale.png"
                             class="img-circle img-responsive"></div>
                    </#if>
                <#else>
                    <img alt="User Pic" style="width: 140px"
                         src="/images/ico/clientMale.png"
                         class="img-circle img-responsive"></div>
                </#if>

                    <div class=" col-md-9 col-lg-9 ">
                        <table class="table table-user-information">
                            <tbody>
                            <tr>
                            <tr>
                                <td>Gender</td>
                                <td>
                                <#if client??>
                                                <#if client.sex??>
                                ${client.sex}
                                </#if>
                                            </#if>
                                </td>
                            </tr>
                            <tr>
                                <td>Email</td>
                                <td>
                                <#if client??>
                                    <a href="">${client.email}</a>
                                </#if>
                                </td>
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

<footer id="footer">
    <div class="container">
        <div class="row">
            <div class="col-sm-6">
                &copy; 2016 <a target="_blank" href="https://vk.com/id36179438" >by Roman Egorov</a>. All Rights Reserved.
            </div>
            <div class="col-sm-6">
                <img class="pull-right" src="/images/shapebootstrap.png" alt="ShapeBootstrap" title="ShapeBootstrap">
            </div>
        </div>
    </div>
</footer><!--/#footer-->

<script src="/js/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.isotope.min.js"></script>
<script src="/js/jquery.prettyPhoto.js"></script>
<script src="/js/main.js"></script>
</body>
</html>