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
                    <li class="active"><a href="/admin/expenses">Затраты</a></li>
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

            <!--Load the AJAX API-->
            <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
            <script type="text/javascript">

                // Load the Visualization API and the corechart package.
                google.charts.load('current', {'packages': ['corechart']});

                // Set a callback to run when the Google Visualization API is loaded.
                google.charts.setOnLoadCallback(drawChart);

                // Callback that creates and populates a data table,
                // instantiates the pie chart, passes in the data and
                // draws it.
                function drawChart() {

                    // Create the data table.
                    var data = new google.visualization.DataTable();
                    data.addColumn('string', 'Topping');
                    data.addColumn('number', 'Slices');

                <#--console.log(${salary});-->
                <#--console.log(${rent});-->

                    data.addRows([
                        ['Зарплата сотрудникам', ${salary2}],
                        ['Аренда офисов', ${rent2}],
                    ]);

                    // Set chart options
                    var options = {
                        'title': 'Затраты компании',
                        'width': 600,
                        'height': 500
                    };

                    // Instantiate and draw our chart, passing in some options.
                    var chart = new google.visualization.PieChart(document.getElementById('chart_div'));
                    chart.draw(data, options);
                }
            </script>

            <div id="chart_div"></div>

            <a href="/generate/pdf.htm?">Скачать файл</a>

            <div class="row">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>$</th>
                        <th>Затраты</th>
                        <th>Значение</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td>Зарплаты сотрудникам</td>
                        <td>

                        <#if salary1??>
                        ${salary1}
                        <#else>
                            0
                        </#if>

                        </td>
                    <#--<td>@mdo</td>-->
                    </tr>
                    <tr>
                        <th scope="row">2</th>
                        <td>Аренда помещения</td>
                        <td>

                        <#if rent1??>
                        ${rent1}
                        <#else>
                            0
                        </#if>

                        </td>
                    </tr>


                    <tr>
                        <th scope="row"></th>
                        <td>Итого:</td>
                        <td>

                        <#if expenses??>
                        ${expenses}
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