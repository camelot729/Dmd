$(document).ready(function(){
    var d = new Date();
    $("#edit_form").validate({
        rules: {
            phone: {
                minlength: 11,
                maxlength: 11
            }
        },
        messages: {
            phone: {
                minlength: "Длина номера должна быть 11 символов",
                maxlength: "Длина номера должна быть 11 символов"
            }
        }
    });
});
