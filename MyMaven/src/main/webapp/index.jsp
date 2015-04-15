<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.sun.mine.dll.jni.*" %>

<body>
    Current time: <%= new java.util.Date() %>

    <%
//        System.out.println(System.getProperty( "java.library.path"));
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.SayHello("");
        TestDll d = new TestDll();
        d.set(30);
        System.out.println(d.get());
    %>
    <%= d.get() %>
    <%--<%--%>
        <%--System.out.println(System.getProperty( "java.library.path"));--%>
        <%--HelloWorld hello = new HelloWorld();--%>
        <%--hello.SayHello("myName");--%>
    <%--%>--%>
<%--//    TestDll d = new TestDll();--%>
<%--//    d.set(30);--%>
<%--//    out.println(d.get());--%>

</body>
