function getSch(inputVal) {
    var str = inputVal;
    var str1 = str.substr(0,str.indexOf('_'));
    var str2 = str.substr(str.indexOf('_') + 1, str.indexOf('_', str.indexOf('_') + 1));
    var str3 = str2.charAt(str2.length - 1);
    str2 = str2.substr(0,str2.indexOf('_', str2.indexOf('_') + 1));
    console.log('1' + str1);
    console.log('2' + str2);

    str3 = str.replace(str1,'');
    str3 = str3.replace(str2,'');
    str3 = str3.replace('_','');
    str3 = str3.replace('_','');
    console.log(str3);

    $.ajax({
        url: "/schedule/edit",
        method: "get",
        data: {
            staffId: str3,
            day: str1,
            time: str2
        },
        success: function (data) {
            var selectTr = document.getElementById(str1 + "_" + str2);
            selectTr.innerHTML = "";
            selectTr.innerHTML = "<span class='glyphicon glyphicon-ok' aria-hidden='true'></span>";
        }
    });
}
