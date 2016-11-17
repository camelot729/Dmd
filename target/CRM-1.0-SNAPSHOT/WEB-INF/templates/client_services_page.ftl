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
<#include "headerClient.ftl">
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

<section id="services">
    <div class="container text-center">
        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h3 class="panel-title">Записаться на прием</h3>
                    </div>
                <div class="panel-body">
                <div class="row">

                <@sf.form class="form-horizontal" action="" method="post" modelAttribute="recepForm" id="edit_form">
                    <div class=" col-md-9 col-lg-9 ">
                        <table class="table table-user-information">
                            <tbody>
                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="control-label col-xs-4 left" for="position">Специальность:</label>
                                        <div class="col-xs-8">

                                            <div class="form-group">
                                                <@sf.select path="position" id="position_select" cssClass="form-control">
                                                    <option disabled selected value="">Выберите специальность</option>
                                                    <@sf.option value="ОНКОЛОГ"> Онколог </@sf.option>
                                                    <@sf.option value="ТЕРАПЕВТ"> Терапевт </@sf.option>
                                                    <@sf.option value="ХИРУРГ"> Хирург </@sf.option>
                                                    <@sf.option value="ОКУЛИСТ"> Окулист </@sf.option>
                                                </@sf.select>
                                                <@sf.errors path="position" class = "alert alert-warning"/>
                                            </div>
                                        </div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="control-label col-xs-4 left" for="doctor">Врач:</label>
                                        <div class="col-xs-8">

                                            <div class="form-group">
                                                <@sf.select path="doctor" id="doctor_select" cssClass="form-control">
                                                    <option disabled selected value="">Выберите специальность</option>
                                                </@sf.select>
                                                <#list doctors.content as doctor>
                                                    <a href="/client/office/profile/${doctor.id}"><p>${doctor.firstname} ${doctor.surname}</p></a>
                                                </#list>
                                                <@sf.errors path="doctor" class = "alert alert-warning"/>
                                            </div>
                                        </div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="control-label col-xs-4 left" for="day">День:</label>
                                        <div class="col-xs-8">

                                            <div class="form-group">
                                                <@sf.select path="day" id="day_select" cssClass="form-control">
                                                    <option disabled selected value="">Выберите день</option>
                                                    <@sf.option value="MONDAY"> Понедельник </@sf.option>
                                                    <@sf.option value="TUESDAY"> Вторник </@sf.option>
                                                    <@sf.option value="WEDNESDAY"> Среда </@sf.option>
                                                    <@sf.option value="THURSDAY"> Четверг </@sf.option>
                                                    <@sf.option value="FRIDAY"> Пятница </@sf.option>
                                                    <@sf.option value="SATURDAY"> Суббота </@sf.option>
                                                    <@sf.option value="SUNDAY"> Воскресенье </@sf.option>
                                                </@sf.select>
                                                <@sf.errors path="day" class = "alert alert-warning"/>
                                            </div>
                                        </div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="control-label col-xs-4 left" for="time">Время:</label>
                                        <div class="col-xs-8">

                                            <div class="form-group">
                                                <@sf.select path="time" id="time_select" cssClass="form-control">
                                                    <option disabled selected value="">Выберите день</option>
                                                </@sf.select>
                                                <@sf.errors path="time" class = "alert alert-warning"/>
                                            </div>
                                        </div>
                                    </div>

                                </td>
                            </tr>
                            </tbody>
                        </table>

                        <div class="form-group text-center">
                            <div class="col-xs-offset-3 col-xs-9">
                                <input type="submit" class="btn btn-primary" value="Записаться">
                            </div>
                        </div>

                    </div>
                </div>
                </div>

                </@sf.form>

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
<script src="/js/services.js"></script>
</body>
</html>