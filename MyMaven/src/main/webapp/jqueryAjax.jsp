<%--
  Created by IntelliJ IDEA.
  User: SDL
  Date: 2015/5/5
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <script src="/jquery/jquery-1.11.1.min.js"></script>
    <script>
        $(document).ready(function () {
            $("button").click(function () {
                $.get("/example/jquery/demo_test.asp", function (data, status) {
                    alert("数据：" + data + "\n状态：" + status);
                });
            });
        });
    </script>
</head>
<body>

<button>向页面发送 HTTP GET 请求，然后获得返回的结果</button>

</body>
</html>
