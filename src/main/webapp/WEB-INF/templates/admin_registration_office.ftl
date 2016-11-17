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
                    <li class="active"><a href="/admin/offices">Офисы</a></li>
                    <li><a href="/admin/staff">Сотрудники</a></li>
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
<@sf.form class="form-horizontal" action="/admin/registration/office" method="post" modelAttribute="officeform" id="reg_form">
    <div class="form-group">
        <label class="control-label col-xs-3" for="city">Город:</label>
        <div class="col-xs-6">
            <@sf.input path="city" type="text" class="form-control" id="city" placeholder="Укажите Город"/>
            <@sf.errors path="city" class = "form-control alert alert-warning text-center"/>
            <div class="surname-error col-xs-2">
                <#if cityError??>
                        ${cityError}
                    </#if>
            </div>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-3" for="street">Улица:</label>
        <div class="col-xs-6">
            <@sf.input path="street" type="text" class="form-control" id="street" placeholder="Укажите Улицу и Номер Дома"/>
            <@sf.errors path="street" class = "form-control alert alert-warning text-center"/>
            <div class="street-error col-xs-2">
                <#if streetError??>
                        ${streetError}
                    </#if>
            </div>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-3" for="rent">Стоимость аренды:</label>
        <div class="col-xs-6">
            <@sf.input path="rent" type="text" class="form-control" id="rent" placeholder="Укажите Стоимость Аренды"/>
            <@sf.errors path="rent" class = "form-control alert alert-warning text-center"/>
            <div class="rent-error col-xs-2">
                <#if rentError??>
                        ${rentError}
                    </#if>
            </div>
        </div>
    </div>
    <div class="form-group text-center">
        <div class="col-xs-offset-3 col-xs-9">
            <input type="submit" class="btn btn-primary" value="Добавить">
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
<script src="/js/registration-office.js"></script>
</body>
</html>