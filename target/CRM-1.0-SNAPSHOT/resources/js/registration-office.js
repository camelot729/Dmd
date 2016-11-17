$(document).ready(function () {
    $("#reg_form").validate({
        rules: {
            city: {
                required: true,
                minlength: 2,
                maxlength: 30
            },
            country: {
                required: true,
                minlength: 2,
                maxlength: 30
            },
            name: {
                required: true,
                minlength: 2,
                maxlength: 30
            }
        },
        messages: {
            city: {
                required: "This field is required",
                minlength: "The minimum number of characters - 2",
                maxlength: "The maximum number of characters - 30"
            },
            country: {
                required: "This field is required",
                minlength: "The minimum number of characters - 2",
                maxlength: "The maximum number of characters - 30"
            },
            name: {
                required: "This field is required",
                minlength: "The minimum number of characters - 2",
                maxlength: "The maximum number of characters - 30"
            }
        }
    });
});