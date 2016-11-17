<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<#assign sec=JspTaglibs["http://www.springframework.org/security/tags"]>

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
<#include "header.ftl">

<br>
<br>
<br>
<br>
<br>
<div class="container">

<@sf.form class="form-horizontal" action="/registration/client" method="post" modelAttribute="userform" id="reg_form">
    <div class="form-group">
        <label class="control-label col-xs-3" for="surname">Surname:</label>
        <div class="col-xs-6">
            <@sf.input path="surname" type="text" class="form-control" id="surname" placeholder="Enter surname"/>
            <@sf.errors path="surname" class = "form-control alert alert-warning text-center"/>
            <div class="surname-error col-xs-2">
                <#if surnameError??>
                        ${surnameError}
                </#if>
            </div>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-3" for="firstName">Name:</label>
        <div class="col-xs-6">
            <@sf.input path="firstname" type="text" class="form-control" id="firstname" placeholder="Enter name"/>
            <@sf.errors path="firstname" class = "form-control alert alert-warning text-center"/>
            <div class="firstname-error col-xs-2">
                <#if firstnameError??>
                        ${firstnameError}
                    </#if>
            </div>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-3" for="sex">Gender:</label>
        <div class="col-xs-6">
            <@sf.radiobutton path="sex" name="sex" value="MALE" checked="checked"/>Male
            <@sf.radiobutton path="sex" name="sex" value="FEMALE"/>Female
            <div class="sex-error col-xs-2">
                <#if sexError??>
                    ${sexError}
                </#if>
            </div>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-3" for="inputEmail">Email:</label>
        <div class="col-xs-6">
            <@sf.input path="email" type="text" class="form-control" id="email" placeholder="Enter e-mail"/>
            <@sf.errors path="email" class = "form-control alert alert-warning text-center"/>
            <div class="email-error col-xs-2">
                <#if emailError??>
                        ${emailError}
                    </#if>
            </div>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-3" for="login">Login:</label>
        <div class="col-xs-6">
            <@sf.input path="login" type="text" class="form-control" id="login" placeholder="Enter login"/>
            <@sf.errors path="login" class = "form-control alert alert-warning text-center"/>
            <div class="login-error col-xs-2">
                <#if loginError??>
                        ${loginError}
                    </#if>
            </div>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-3" for="inputPassword">Password:</label>
        <div class="col-xs-6">
            <@sf.input path="password" type="password" class="form-control" id="password" placeholder="Enter password"/>
            <@sf.errors path="password" class = "form-control alert alert-warning text-center"/>
            <div class="password-error col-xs-2">
                <#if passwordError??>
                        ${passwordError}
                    </#if>
            </div>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-3" for="confirmPassword">Confirm the password:</label>
        <div class="col-xs-6">
            <@sf.input path="repassword" type="password" class="form-control" id="repassword" placeholder="Confirm the password"/>
            <@sf.errors path="repassword" class = "form-control alert alert-warning text-center"/>
            <div class="password-error col-xs-2">
                <#if repasswordError??>
                        ${repasswordError}
                    </#if>
            </div>
        </div>
    </div>
    <div class="form-group text-center">
        <div class="col-xs-offset-3 col-xs-9">
            <input type="submit" class="btn btn-primary" value="Регистрация">
            <input type="reset" class="btn btn-default" value="Очистить форму">
        </div>
    </div>
</@sf.form>
</div>

<#include "footer.ftl">

<script src="/js/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.isotope.min.js"></script>
<script src="/js/jquery.prettyPhoto.js"></script>
<script src="/js/main.js"></script>
<script src="/js/jquery.validate.min.js"></script>
<script src="/js/registration-validation.js"></script>
</body>
</html>