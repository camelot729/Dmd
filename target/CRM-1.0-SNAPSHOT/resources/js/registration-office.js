$(document).ready(function () {
    $("#reg_form").validate({
        rules: {
            city: {
                required: true,
                minlength: 2,
                maxlength: 30
            },
            street: {
                required: true,
                minlength: 2,
                maxlength: 30
            },
            rent: {
                required: true
            }
        },
        messages: {
            city: {
                required: "Это поле обязательно для заполнения",
                minlength: "Минимальное число символов - 2",
                maxlength: "Максимальное число символов - 30"
            },
            street: {
                required: "Это поле обязательно для заполнения",
                minlength: "Минимальное число символов - 2",
                maxlength: "Максимальное число символов - 30"
            },
            rent: {
                required: "Это поле обязательно для заполнения",
            }
        }
    });
});