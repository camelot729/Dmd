$(document).ready(function () {
    $("#position_select").on("change", function () {
        getDoctors()
    });
    $("#day_select").on("change", function () {
        getTime()
    });
});

function getDoctors() {
    var doctor = $('#position_select').val();
    console.log(doctor);
    //var elem = findElementById("id")
    $.ajax({
        url: "/doctors",
        data: {
            doctor: doctor,
            //url: "/services?type" + doctor.value()
        },
        success: function (data) {
            addOptions(data, "doctor_select")
        }
    });
}

function getTime() {
    var doctor = $('#doctor_select').val();
    var day = $('#day_select').val();
    console.log(doctor);
    console.log(day);
    $.ajax({
        url: "/schedule",
        data: {
            doctor: doctor,
            day: day,
        },
        success: function (data) {
            console.log(data);
            if (data.length == 0) {
                var _select = document.getElementById('time_select');
                _select.innerHTML = "";
                var option = document.createElement("option");
                var optionText = document.createTextNode("В этот день врач не работает");
                option.appendChild(optionText);
                option.setAttribute("value", "");
                _select.appendChild(option);
            } else {
                addOptions(data, "time_select")
            }
        }
    });
}

function addOptions(data, selectName) {
    var models = data;

    var _select = document.getElementById(selectName);
    _select.innerHTML = "";

    if (models.length == 0){
        var option = document.createElement("option");
        var optionText = document.createTextNode("Нет доступных докторов");
        option.appendChild(optionText);
        _select.appendChild(option);
        _select.style.display = "inline";
    } else {

        for (var i in models) {
            var option = document.createElement("option");

            var str = "";

            if (selectName == "doctor_select") {


                if (models[i][0] != undefined) {
                    str += models[i][0];
                }

                if (models[i][1] != undefined) {
                    str += " ";
                    str += models[i][1];
                }

                //if (models[i][2] != undefined) {
                //    str += " ";
                //    str += models[i][2];
                //}
            } else {
                str += models[i];
            }

            var optionText = document.createTextNode(str);
            option.appendChild(optionText);

            if (selectName == "doctor_select") {
                option.setAttribute("value", models[i][2]);
            } else {
                option.setAttribute("value", models[i]);
            }
            _select.appendChild(option);
        }
        _select.style.display = "inline";
    }
}


