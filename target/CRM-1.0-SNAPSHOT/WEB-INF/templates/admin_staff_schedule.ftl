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
<br>
<br>
<br>
<br>
<br>

<section id="services">
    <div class="container">
        <div class="box first">
            <div class="row">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>День\Время</th>
                        <th>9:00 - 10:00</th>
                        <th>10:00 - 11:00</th>
                        <th>11:00 - 12:00</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>Понедельник</td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "MONDAY") && (schedule[i][1] == "AM9_AM10")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "MONDAY") && (schedule[i][1] == "AM10_AM11")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "MONDAY") && (schedule[i][1] == "AM11_PM12")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                    </tr>
                    <tr>
                        <td>Вторник</td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "TUESDAY") && (schedule[i][1] == "AM9_AM10")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "TUESDAY") && (schedule[i][1] == "AM10_AM11")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "TUESDAY") && (schedule[i][1] == "AM11_PM12")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                    </tr>
                    <tr>
                        <td>Среда</td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "WEDNESDAY") && (schedule[i][1] == "AM9_AM10")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "WEDNESDAY") && (schedule[i][1] == "AM10_AM11")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "WEDNESDAY") && (schedule[i][1] == "AM11_PM12")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                    </tr>
                    <tr>
                        <td>Четверг</td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "THURSDAY") && (schedule[i][1] == "AM9_AM10")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "THURSDAY") && (schedule[i][1] == "AM10_AM11")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "THURSDAY") && (schedule[i][1] == "AM11_PM12")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                    </tr>
                    <tr>
                        <td>Пятница</td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "FRIDAY") && (schedule[i][1] == "AM9_AM10")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "FRIDAY") && (schedule[i][1] == "AM10_AM11")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "FRIDAY") && (schedule[i][1] == "AM11_PM12")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                    </tr>
                    <tr>
                        <td>Суббота</td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "SATURDAY") && (schedule[i][1] == "AM9_AM10")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "SATURDAY") && (schedule[i][1] == "AM10_AM11")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "SATURDAY") && (schedule[i][1] == "AM11_PM12")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                    </tr>
                    <tr>
                        <td>Воскресенье</td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "SUNDAY") && (schedule[i][1] == "AM9_AM10")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "SUNDAY") && (schedule[i][1] == "AM10_AM11")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                        <td>
                        <#if schedule??>
                            <#list 0..21 as i>
                                <#if schedule[i]?? && (schedule[i][0] == "SUNDAY") && (schedule[i][1] == "AM11_PM12")>
                                    <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
                                </#if>
                            </#list>
                        </#if>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div><!--/.box-->
    </div><!--/.container-->
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