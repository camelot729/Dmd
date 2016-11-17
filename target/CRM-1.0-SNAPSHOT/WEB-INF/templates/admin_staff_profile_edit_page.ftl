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
                        <h3 class="panel-title">${staff.surname} ${staff.firstname}</h3>
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

                <@sf.form class="form-horizontal" action="" method="post" modelAttribute="userform" id="edit_form">
                    <div class=" col-md-9 col-lg-9 ">
                        <table class="table table-user-information">
                            <tbody>
                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="control-label col-xs-4 left" for="position">Доктор:</label>
                                        <div class="col-xs-8">

                                            <div class="form-group">
                                                <@sf.select path="position" cssClass="form-control">
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
                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="control-label col-xs-4 left" for="sex">Пол:</label>
                                        <div class="col-xs-8">
                                            Male
                                        </div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="control-label col-xs-4 left" for="salary">Зарплата:</label>
                                        <div class="col-xs-8">
                                            <#if profile??>
                                                <#if profile.salary??>
                                                    <@sf.input path="salary" type="text" class="form-control" id="salary" placeholder="Зарплата сотрудника" value="${salary}"/>
                                                <#else>
                                                    <@sf.input path="salary" type="text" class="form-control" id="salary" placeholder="Зарплата сотрудника"/>
                                                </#if>
                                            <#else>
                                                <@sf.input path="salary" type="text" class="form-control" id="salary" placeholder="Зарплата сотрудника"/>
                                            </#if>
                                            <@sf.errors path="salary" class = "form-control alert alert-warning text-center"/>
                                            <div class="salary-error col-xs-2">
                                                <#if salaryError??>
                                                            ${salaryError}
                                                        </#if>
                                            </div>
                                        </div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="control-label col-xs-4 left" for="phone">Телефон:</label>
                                        <div class="col-xs-8">

                                            <#if profile??>
                                                <#if profile.phone??>
                                                    <@sf.input path="phone" type="text" class="form-control" id="phone" placeholder="Номер телефона" value="${profile.phone}"/>
                                                <#else>
                                                    <@sf.input path="phone" type="text" class="form-control" id="phone" placeholder="Номер телефона"/>
                                                </#if>
                                            <#else>
                                                <@sf.input path="phone" type="text" class="form-control" id="phone" placeholder="Номер телефона"/>
                                            </#if>

                                                <@sf.errors path="phone" class = "form-control alert alert-warning text-center"/>

                                        </div>
                                    </div>
                                </td>
                            </tr>

                            <#--<tr>-->
                            <#--<td>-->
                            <#--<div class="form-group">-->
                            <#--<label class="control-label col-xs-4 left" for="office">Офис:</label>-->
                            <#--<div class="col-xs-8">-->

                            <#--<div class="form-group">-->
                            <#--<@sf.select path="office" id="office_select" cssClass="form-control">-->
                            <#--<option disabled selected value="">Выберите офис</option>-->
                            <#--</@sf.select>-->
                            <#--<@sf.errors path="office" class = "alert alert-warning"/>-->
                            <#--</div>-->
                            <#--</div>-->
                            <#--</div>-->
                            <#--</td>-->
                            <#--</tr>-->

                            </tbody>


                        </table>

                        <div class="form-group text-center">
                            <div class="col-xs-offset-3 col-xs-9">
                            <#--<a type="button" class="btn btn-warning" value="Вернуться обратно">-->
                                <a href="/admin/staff/profile/${staff.id}" class="btn btn-warning">Вернуться обратно</a>
                                <input type="submit" class="btn btn-primary" value="Сохранить">
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
<script src="/js/jquery.validate.min.js"></script>
<script src="/js/profile-form-validation.js"></script>
</body>
</html>