// 定义新的函数，获取登录状态
function getLoginStatus() {
    $.ajax({
        type: 'get',
        url: 'login',
        success:function(body) {
            // 已经登录的状态
            console.log("已经登录了");
        },
        error: function() {
            // error 这里对应的回调函数，就是在响应状态码不为 2xx 的时候会触发
            // 当服务器返回 403 的时候，就会触发当前这个 error 部分的逻辑了
            // 强制要求页面跳转到博客登录页
            // 为啥不在服务器直接返回一个 302 这样的重定向响应，直接跳转到登录页呢？
            // 302 这种响应，无法被 ajax 直接处理(如果是通过提交 form 表单，点击 a 标签这种触发的 http 请求 ，浏览器可以响应 302)

            // 前端页面跳转的实现方式
            location.assign('login.html');
        }
    });
}