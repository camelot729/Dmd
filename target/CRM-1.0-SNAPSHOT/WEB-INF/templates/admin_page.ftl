<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Страница администратора</title>
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
                    <li class="active"><a href="/admin">Прибыль</a></li>
                    <li><a href="/admin/expenses">Затраты</a></li>
                    <li><a href="/admin/offices">Офисы</a></li>
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
                        <th>$</th>
                        <th>Прибыль</th>
                        <th>Значение</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td>Прибыль</td>
                        <td>
                        <#if profit??>
                        ${profit}
                        <#else>
                            0
                        </#if>
                        </td>
                    <#--<td>@mdo</td>-->
                    </tr>

                    <tr>
                        <th scope="row"></th>
                        <td>Итого:</td>
                        <td>

                        <#if profit??>
                        ${profit}
                        <#else>
                            0
                        </#if>

                        </td>
                    </tr>
                    </tbody>
                </table>
            </div><!--/.row-->
        </div><!--/.box-->
    </div><!--/.container-->
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