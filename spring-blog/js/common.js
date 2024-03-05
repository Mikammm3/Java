$(document).ajaxSend(function (e, xhr, opt) {
    var user_token = localStorage.getItem("user_token");
    xhr.setRequestHeader("user_token_header", user_token);
});
$(document).ajaxError(function (e, xhr, opt, exc) {
    if (xhr != null && xhr.status == 401) {
        console.log(xhr);
        location.href = "blog_login.html";
    }
});