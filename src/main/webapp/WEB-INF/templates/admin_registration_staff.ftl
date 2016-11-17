<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>

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
                    <li><a href="/admin">Прибыль</a></li>
                    <li><a href="/admin">Затраты</a></li>
                    <li><a href="/admin">Поставки</a></li>
                    <li><a href="/admin/offices">Офисы</a></li>
                    <li class="active"><a href="/admin/staff">Сотрудники</a></li>
                    <li><a href="/logout">Выход</a></li>
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
<div class="container">
<@sf.form class="form-horizontal" action="/admin/registration/staff" method="post" modelAttribute="userform" id="reg_form">
    <div class="form-group">
        <label class="control-label col-xs-3" for="surname">Фамилия:</label>
        <div class="col-xs-6">
            <@sf.input path="surname" type="text" class="form-control" id="surname" placeholder="Введите фамилию"/>
            <@sf.errors path="surname" class = "form-control alert alert-warning text-center"/>
            <div class="surname-error col-xs-2">
                <#if surnameError??>
                        ${surnameError}
                    </#if>
            </div>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-3" for="firstName">Имя:</label>
        <div class="col-xs-6">
            <@sf.input path="firstname" type="text" class="form-control" id="firstname" placeholder="Введите имя"/>
            <@sf.errors path="firstname" class = "form-control alert alert-warning text-center"/>
            <div class="firstname-error col-xs-2">
                <#if firstnameError??>
                        ${firstnameError}
                    </#if>
            </div>
        </div>
    </div>
    <#--<div class="form-group">-->
        <#--<label class="control-label col-xs-3" for="patronymic">Отчество:</label>-->
        <#--<div class="col-xs-6">-->
            <#--<@sf.input path="patronymic" type="text" class="form-control" id="patronymic" placeholder="Введите отчество"/>-->
            <#--<@sf.errors path="patronymic" class = "form-control alert alert-warning text-center"/>-->
            <#--<div class="patronymic-error col-xs-2">-->
                <#--<#if patronymicError??>-->
                        <#--${patronymicError}-->
                    <#--</#if>-->
            <#--</div>-->
        <#--</div>-->
    <#--</div>-->
    <div class="form-group">
        <label class="control-label col-xs-3" for="sex">Пол:</label>
        <div class="col-xs-6">
            <@sf.radiobutton path="sex" name="sex" value="MALE" checked="checked"/>Мужской
            <@sf.radiobutton path="sex" name="sex" value="FEMALE"/>Женский
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
            <@sf.input path="email" type="text" class="form-control" id="email" placeholder="Введите почту"/>
            <@sf.errors path="email" class = "form-control alert alert-warning text-center"/>
            <div class="email-error col-xs-2">
                <#if emailError??>
                        ${emailError}
                    </#if>
            </div>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-3" for="login">Логин:</label>
        <div class="col-xs-6">
            <@sf.input path="login" type="text" class="form-control" id="login" placeholder="Введите логин"/>
            <@sf.errors path="login" class = "form-control alert alert-warning text-center"/>
            <div class="login-error col-xs-2">
                <#if loginError??>
                        ${loginError}
                    </#if>
            </div>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-3" for="inputPassword">Пароль:</label>
        <div class="col-xs-6">
            <@sf.input path="password" type="password" class="form-control" id="password" placeholder="Введите пароль"/>
            <@sf.errors path="password" class = "form-control alert alert-warning text-center"/>
            <div class="password-error col-xs-2">
                <#if passwordError??>
                        ${passwordError}
                    </#if>
            </div>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-3" for="confirmPassword">Подтвердите пароль:</label>
        <div class="col-xs-6">
            <@sf.input path="repassword" type="password" class="form-control" id="repassword" placeholder="Введите пароль ещё раз"/>
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

<script src="/js/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.isotope.min.js"></script>
<script src="/js/jquery.prettyPhoto.js"></script>
<script src="/js/main.js"></script>
<script src="/js/jquery.validate.min.js"></script>
<script src="/js/registration-validation.js"></script>
</body>
</html>