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
                    <li><a href="/admin/expenses">Затраты</a></li>
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


<section id="services">
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h3 class="panel-title">${staff.surname} ${staff.firstname} </h3>
                    </div>
                <div class="panel-body">
                <div class="row">

                <div class="col-md-3 col-lg-3 " align="center">
                <#if staff?? && staff.sex??>
                    <#if staff.sex == 'MALE'>
                        <img alt="User Pic"
                             src="/images/ico/doctorM.jpg"
                             class="img-circle img-responsive">
                    <#else>
                        <img alt="User Pic"
                             src="/images/ico/doctorF.jpg"
                             class="img-circle img-responsive">
                    </#if>
                <#else>
                    <img alt="User Pic"
                         src="/images/ico/doctorM.jpg"
                         class="img-circle img-responsive">
                </#if>
                </div>

                <div class=" col-md-9 col-lg-9 ">
                    <table class="table table-user-information">
                        <tbody>
                        <tr>
                            <td>Специальность:</td>
                            <td>
                            <#if profile??>
                                            <#if profile.position??>
                            ${profile.position}
                            </#if>
                                        </#if>
                            </td>
                        </tr>
                        <tr>
                        <tr>
                            <td>Пол:</td>
                            <td>Мужской</td>
                        </tr>
                        <tr>
                            <td>Зарплата:</td>
                            <td>
                            <#if profile??>
                                            <#if profile.salary??>
                            ${profile.salary}
                            </#if>
                                        </#if>
                            </td>
                        </tr>
                        <tr>
                            <td>Email:</td>
                            <td>
                            <#if profile??>
                                <#if staff??>
                                    <#if staff.email??>
                                        <a href="">${staff.email}</a>
                                    </#if>
                                </#if>
                            </#if>
                            </td>
                        </tr>
                        <td>Телефон:</td>
                        <td>
                        <#if profile??>
                            <#if profile.phone??>
                            ${profile.phone}(Mobile)
                            </#if>
                        </#if>
                        </td>


                        </tr>

                        </tbody>
                    </table>

                    <a href="/admin/schedule/${staff.id}" class="btn btn-primary">Часы приема</a>
                    <#--<a href="#" class="btn btn-primary">Пациенты</a>-->
                </div>
            </div>
        </div>
        <div class="panel-footer text-right">
            <a href="/admin/staff/edit/profile/${staff.id}" data-original-title="Edit this user"
               data-toggle="tooltip" type="button"
               class="btn btn-sm btn-warning"><i class="glyphicon glyphicon-edit"></i></a>
            <#if profile.position??>
            <a href="/admin/edit/schedule/${staff.id}" data-original-title="Edit schedule"
               data-toggle="tooltip" type="button"
               class="btn btn-sm btn-warning"><i class="glyphicon glyphicon-calendar"></i></a>
            </#if>
        <#--<form action="/admin/staff/delete/${staff.id}" method="post">-->
        <#--<button data-original-title="Remove this person"-->
        <#--data-toggle="tooltip"-->
        <#--class="btn btn-sm btn-danger"><i class="glyphicon glyphicon-remove"></i></button>-->
        <#--</form>-->
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
                &copy; 2016 <a target="_blank" href="https://vk.com/id36179438">by Roman Egorov</a>. All Rights
                Reserved.
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