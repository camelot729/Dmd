<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Tour Agency</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
    <link rel="shortcut icon" href="images/ico/logo3.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->

<body data-spy="scroll" data-target="#navbar" data-offset="0">
<#include "header.ftl">

<section id="main-slider" class="carousel">
    <div class="carousel-inner">
        <div class="item active">
            <div class="container">
                <div class="carousel-content">
                    <h1>Khadeev & Makseev Tour Agency</h1>
                    <p class="lead">We are the best tour agency 2016!</p>
                </div>
            </div>
        </div><!--/.item-->
        <div class="item">
            <div class="container">
                <div class="carousel-content">
                    <h1>Find your home anywhere in the world</h1>
                    <p class="lead"></p>
                </div>
            </div>
        </div><!--/.item-->
    </div><!--/.carousel-inner-->
    <a class="prev" href="#main-slider" data-slide="prev"><i class="icon-angle-left"></i></a>
    <a class="next" href="#main-slider" data-slide="next"><i class="icon-angle-right"></i></a>
</section><!--/#main-slider-->

<section id="services">
    <div class="container">
        <div class="box first">
            <div class="row">
                <div class="col-md-4 col-sm-6">
                    <div class="center">
                        <img width="124" height="119" src="images/indexPage/ico/i2.ico"<br>
                        <h4>Trained staff</h4>
                    </div>
                </div><!--/.col-md-4-->
                <div class="col-md-4 col-sm-6">
                    <div class="center">
                        <img width="124" height="119" src="images/indexPage/ico/i1.png"<br>
                        <h4>A full range of services</h4>
                    </div>
                </div><!--/.col-md-4-->
                <div class="col-md-4 col-sm-6">
                    <div class="center">
                        <img width="124" height="119" src="images/indexPage/ico/i4.jpg"<br>
                        <h4>Nice and comfortable rooms</h4>
                    </div>
                </div><!--/.col-md-4-->
            </div><!--/.row-->
        </div><!--/.box-->
    </div><!--/.container-->
</section><!--/#services-->

<section id="portfolio">
    <div class="container">
        <div class="box">
            <ul class="portfolio-items col-4">
                <li class="portfolio-item apps">
                    <div class="item-inner">
                        <div class="portfolio-image">
                            <img style="width: 220px" src="images/indexPage/k1.jpg" alt="">
                            <div class="overlay">
                                <a class="preview btn btn-danger" href="images/indexPage/k1.jpg"><i class="icon-eye-open"></i></a>
                            </div>
                        </div>
                    </div>
                </li><!--/.portfolio-item-->
                <li class="portfolio-item joomla bootstrap">
                    <div class="item-inner">
                        <div class="portfolio-image">
                            <img style="width: 220px" src="images/indexPage/k2.jpg" alt="">
                            <div class="overlay">
                                <a class="preview btn btn-danger" href="images/indexPage/k2.jpg"><i class="icon-eye-open"></i></a>
                            </div>
                        </div>
                    </div>
                </li><!--/.portfolio-item-->
                <li class="portfolio-item bootstrap wordpress">
                    <div class="item-inner">
                        <div class="portfolio-image">
                            <img style="width: 220px" src="images/indexPage/k3.jpg" alt="">
                            <div class="overlay">
                                <a class="preview btn btn-danger" href="images/indexPage/k3.jpg"><i class="icon-eye-open"></i></a>
                            </div>
                        </div>
                    </div>
                </li><!--/.portfolio-item-->
                <li class="portfolio-item joomla wordpress apps">
                    <div class="item-inner">
                        <div class="portfolio-image">
                            <img style="width: 220px" src="images/indexPage/k4.jpg" alt="">
                            <div class="overlay">
                                <a class="preview btn btn-danger" href="images/indexPage/k4.jpg"><i class="icon-eye-open"></i></a>
                            </div>
                        </div>
                    </div>
                </li><!--/.portfolio-item-->
            </ul>
        </div><!--/.box-->
    </div><!--/.container-->
</section><!--/#portfolio-->

<#include "footer.ftl">

<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.isotope.min.js"></script>
<script src="js/jquery.prettyPhoto.js"></script>
<script src="js/main.js"></script>
</body>
</html>