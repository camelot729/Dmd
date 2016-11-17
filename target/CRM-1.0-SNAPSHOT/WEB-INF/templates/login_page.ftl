<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>HMS</title>
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
<#include "header.ftl">
<br><br><br><br>
<br><br><br><br>
<br><br><br><br>
<div class="container col-md-4 col-md-offset-4">
    <form class="form-signin" action="/login/process" method="post" id="reg_form">
        <h2 class="form-signin-heading">Sign in</h2>

    <#if error??>
        <p class="alert alert-danger"> Wrong login or password! </p>
    </#if>

        <label for="login" class="sr-only">Login</label>
        <input type="text" id="login" class="form-control" placeholder="Login" name="login" required autofocus>
        <label for="password" class="sr-only">Password</label>
        <input type="password" id="password" class="form-control" placeholder="Password" name="password" required>

        <div>
            <label for="remember-me">Remember me</label>
            <input type="checkbox" name="remember-me" id="remember-me"/>
        </div>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Log in</button>
    </form>
</div>


<script src="/js/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.isotope.min.js"></script>
<script src="/js/jquery.prettyPhoto.js"></script>
<script src="/js/main.js"></script>
<script src="/js/jquery.validate.min.js"></script>
<script src="/js/registration-validation.js"></script>
</body>
</html>