jQuery.extend(jQuery.validator.messages, {
    required: "Това поле е задължително.",
    remote: "Please fix this field.",
    email: "Моля въведете валиден Е-мейл адрес.",
    url: "Please enter a valid URL.",
    date: "Please enter a valid date.",
    dateISO: "Please enter a valid date (ISO).",
    number: "Въведете число.",
    digits: "Трябва да съдърба само цифри..",
    creditcard: "Please enter a valid credit card number.",
    equalTo: "Двете пароли не съвпадат",
    accept: "Please enter a value with a valid extension.",
    maxlength: jQuery.validator.format("Please enter no more than {0} characters."),
    minlength: jQuery.validator.format("Please enter at least {0} characters."),
    rangelength: jQuery.validator.format("Please enter a value between {0} and {1} characters long."),
    range: jQuery.validator.format("Please enter a value between {0} and {1}."),
    max: jQuery.validator.format("Please enter a value less than or equal to {0}."),
    min: jQuery.validator.format("Въведете стойност по-голяма от {0}")
});

$(document).ready(function () {
	$('#regForm').validate({ // initialize the plugin
		rules: {
	        passwordConfirm: {
	            required: true,
	            equalTo: "#password"
	        }
		}
	});
});


