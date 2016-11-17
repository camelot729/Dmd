$(document).ready(function () {
    $("#reg_form").validate({
        rules: {
            firstname: {
                required: true,
                minlength: 2,
                maxlength: 30
            },
            surname: {
                required: true,
                minlength: 2,
                maxlength: 30
            },
            patronymic: {
                required: true,
                minlength: 2,
                maxlength: 30
            },
            email: {
                required: true,
                email: true
            },
            login: {
                required: true,
                minlength: 3,
                maxlength: 16
            },
            age: {
                required: true
            },
            password: {
                required: true,
                minlength: 6,
                maxlength: 24
            },
            repassword: {
                required: true,
                minlength: 6,
                maxlength: 24,
                equalTo: "#password"
            }
        },
        messages: {
            firstname: {
                required: "Это поле обязательно для заполнения",
                minlength: "Минимальное число символов - 2",
                maxlength: "Максимальное число символов - 30"
            },
            surname: {
                required: "Это поле обязательно для заполнения",
                minlength: "Минимальное число символов - 2",
                maxlength: "Максимальное число символов - 30"
            },
            patronymic: {
                required: "Это поле обязательно для заполнения",
                minlength: "Минимальное число символов - 2",
                maxlength: "Максимальное число символов - 30"
            },
            email: {
                required: "Это поле обязательно для заполнения",
                email: "Введите коректную почту"
            },
            login: {
                required: "Это поле обязательно для заполнения",
                minlength: "Минимальное число символов - 3",
                maxlength: "Максимальное число символов - 16",
                //regexp: "Поле должно содержать латинские символы или цифры"
            },
            age: {
                required: "Это поле обязательно для заполнения"
            },
            password: {
                required: "Это поле обязательно для заполнения",
                minlength: "Минимальное число символов - 6",
                maxlength: "Максимальное число символов - 24"
            },
            repassword: {
                required: "Это поле обязательно для заполнения",
                minlength: "Минимальное число символов - 6",
                maxlength: "Максимальное число символов - 24",
                equalTo: "Пароли не совпадают"
            }
        }
    });
});