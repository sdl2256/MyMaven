<%--
  Created by IntelliJ IDEA.
  User: SDL
  Date: 2015/5/4
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试JQuery</title>
    <script type="text/javascript" src="js/jquery-1.11.2.js"></script>
    <script>
        function appendText() {
            var txt1 = "<p>Text.</p>";              // 以 HTML 创建新元素
            var txt2 = $("<p></p>").text("Text!.");  // 以 jQuery 创建新元素
            var txt3 = document.createElement("p");
            txt3.innerHTML = "Text.";               // 通过 DOM 来创建文本
            $("body").append(txt1, txt2, txt3);        // 追加新元素
        }
    </script>
    <script>
        $(document).ready(function () {
            $("button").click(function () {
                $("div").animate({left: '250px'});
            });
        });
    </script>
    <%----%>
    <%--<script type="text/javascript">--%>
    <%--$(document).ready(function () {--%>
    <%--$(".flip").click(function () {--%>
    <%--$(".panel").slideToggle("slow");--%>
    <%--});--%>
    <%--});--%>
    <%--</script>--%>

    <%--<style type="text/css">--%>
    <%--div.panel, p.flip {--%>
    <%--margin: 0px;--%>
    <%--padding: 5px;--%>
    <%--text-align: center;--%>
    <%--background: #e5eecc;--%>
    <%--border: solid 1px #c3c3c3;--%>
    <%--}--%>

    <%--div.panel {--%>
    <%--height: 120px;--%>
    <%--display: none;--%>
    <%--}--%>
    <%--</style>--%>
    <%--<script>--%>
    <%--$(document).ready(function () {--%>
    <%--$("button").click(function () {--%>
    <%--$("#div1").fadeToggle();--%>
    <%--$("#div2").fadeToggle("slow");--%>
    <%--$("#div3").fadeToggle(3000);--%>
    <%--$("#div1").fadeTo("slow", 0.15);--%>
    <%--$("#div2").fadeTo("slow", 0.4);--%>
    <%--$("#div3").fadeTo("slow", 0.7);--%>
    <%--});--%>
    <%--});--%>
    <%--</script>--%>

    <%--<script type="text/javascript">--%>
    <%--$(document).ready(function () {--%>
    <%--$("#hide").click(function () {--%>
    <%--$("p").hide();--%>
    <%--});--%>
    <%--$("#show").click(function () {--%>
    <%--$("p").show();--%>
    <%--});--%>
    <%--});--%>
    <%--</script>--%>

    <%--<script type="text/javascript">--%>
    <%--//        这是为了防止文档在完全加载（就绪）之前运行 jQuery 代码--%>
    <%--$(document).ready(function () {--%>
    <%--$("button").click(function () {--%>
    <%--$("p").hide();--%>
    <%--})--%>
    <%--//            $("p").css("background-color", "red");--%>
    <%--})--%>
    <%--</script>--%>

    <%--<script>--%>
    <%--$(document).ready(function(){--%>
    <%--$("p").click(function(){--%>
    <%--$(this).hide();--%>
    <%--});--%>
    <%--});--%>
    <%--</script>--%>

    <%--<script type="text/javascript">--%>
    <%--$(document).ready(function () {--%>
    <%--$(".ex .hide").click(function () {--%>
    <%--$(this).parents(".ex").hide("slow");--%>
    <%--});--%>
    <%--});--%>
    <%--</script>--%>
    <%--<style type="text/css">--%>
    <%--div.ex {--%>
    <%--background-color: #e5eecc;--%>
    <%--padding: 7px;--%>
    <%--border: solid 1px #c3c3c3;--%>
    <%--}--%>
    <%--</style>--%>
</head>
<body>

<p>This is a paragraph.</p>
<button onclick="appendText()">追加文本</button>

<h2>This is a heading</h2>
<big>city</big>
<p>This is a paragraph.</p>

<p>This is another paragraph.</p>
<button type="button">Click me</button>

<h3>中国办事处</h3>

<div class="ex">
    <button class="hide" type="button">隐藏</button>
    <p>联系人：张先生<br/>
        北三环中路 100 号<br/>
        北京</p>
</div>

<h3>美国办事处</h3>

<div class="ex">
    <button class="hide" type="button">隐藏</button>
    <p>联系人：David<br/>
        第五大街 200 号<br/>
        纽约</p>
</div>


<p id="p1">如果点击“隐藏”按钮，我就会消失。</p>
<button id="hide" type="button">隐藏</button>
<button id="show" type="button">显示</button>

<p>演示带有不同参数的 fadeIn() 方法。</p>
<button>点击这里，使三个矩形淡入</button>
<br><br>

<div id="div1" style="width:80px;height:80px;display:none;background-color:red;"></div>
<br>

<div id="div2" style="width:80px;height:80px;display:none;background-color:green;"></div>
<br>

<div id="div3" style="width:80px;height:80px;display:none;background-color:blue;"></div>

<div class="panel">
    <p>W3School - 领先的 Web 技术教程站点</p>

    <p>在 W3School，你可以找到你所需要的所有网站建设教程。</p>
</div>

<p class="flip">请点击这里</p>

<button>开始动画</button>
<p>默认情况下，所有 HTML 元素的位置都是静态的，并且无法移动。如需对位置进行操作，记得首先把元素的 CSS position 属性设置为 relative、fixed 或 absolute。</p>

<div style="background:#98bf21;height:100px;width:100px;position:absolute;">
</div>

</body>
</html>
