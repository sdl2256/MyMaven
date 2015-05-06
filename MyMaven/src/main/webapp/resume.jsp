<%--
  Created by IntelliJ IDEA.
  User: SDL
  Date: 2015/5/6
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base target="download"/>

    <title>My JSPaaa 'test.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
  <link rel="stylesheet" type="text/css" href="styles.css">
  -->

    <script type="text/javascript">
    </script>

</head>

<body>
<form action="loadOut.action" method="post">
    <table>
        <tr>
            <td>
                姓名：
            </td>
            <td>
                <input type="text" name="user" value="张三">
            </td>
        </tr>
        <tr>
            <td>
                性别：
            </td>
            <td>
                <input type="text" name="sex" value="男">
            </td>
        </tr>
        <tr>
            <td>
                出生日期：
            </td>
            <td>
                <input type="text" name="birthday" value="1900-1-1">
            </td>
        </tr>
        <tr>
            <td>
                地址：
            </td>
            <td>
                <input type="text" name="address" value="湖北武汉">
            </td>
        </tr>
        <tr>
            <td>
                备注：
            </td>
            <td>
                <input type="text" name="remark" value="备注。。。。">
            </td>
        </tr>
    </table>
    <input type="submit" name="fileout" value="导出">

</form>
</body>
</html>
