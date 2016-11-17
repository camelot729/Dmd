<#assign s=JspTaglibs["http://www.springframework.org/tags/form"]>

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
<div class="container">


<@s.form class="form-horizontal" action="/client/hotel/profile/${hotel.id}/booking" method="post" modelAttribute="bookingform">
    <div class="form-group">

        <label class="control-label col-xs-3"">Arrive: (Enter date in type: YYYY-MM-DD)</label>
        <div class="col-xs-6">
            <@s.input path="arrived" type="date" class="form-control" placeholder="1996-1-11"/>
        </div>
    </div>

    <div class="form-group">

        <label class="control-label col-xs-3">Departe: (Enter date in type: YYYY-MM-DD)</label>

        <div class="col-xs-6">
            <@s.input path="departe" type="date" class="form-control" placeholder="1996-2-11"/>
        </div>

    </div>

    <div class="form-group center">
        <label class="control-label col-xs-3">Number of the room:</label>
        <div class="col-xs-6">
            <#list rooms as room>
                <@s.radiobutton path="room" name="room" value="${room}"/>${room}
            </#list>
        </div>
    </div>

    <div class="form-group center">
        <div class="col-xs-offset-3 col-xs-9">
            <input type="submit" class="btn btn-primary" value="Booking4">
        </div>
    </div>
</div>
</@s.form>

<#include "footer.ftl">
</div>

<script src="/js/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.isotope.min.js"></script>
<script src="/js/jquery.prettyPhoto.js"></script>
<script src="/js/main.js"></script>
<script src="/js/jquery.validate.min.js"></script>
</body>
</html>