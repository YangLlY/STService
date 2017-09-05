<%--
  Created by IntelliJ IDEA.
  User: yly
  Date: 2017/6/20
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<html>
<head>
    <title>bootstrap分页测试</title>
    <script type="text/javascript" src="${path}/Static/js/jquery-1.11.1.min.js"></script>
    <!-- bootstrap的js -->
    <script type="text/javascript" src="${path}/Static/js/bootstrap.min.js" ></script>
    <script type="text/javascript" src="${path}/Static/js/bootstrap-table.js" ></script>
    <script type="text/javascript" src="${path}/Static/js/bootstrap-table-zh-CN.js" ></script>
    <!-- bootstrap样式 -->
    <link rel="stylesheet" href="${path}/Static/css/bootstrap.min.css">
    <link rel="stylesheet" href="${path}/Static/css/bootstrap-table.min.css">
    
    <script type="text/javascript">

        function ActionFormatter(value,row,index) {
            var str= '';

                str += '<a href="javascript:skan()">查看</a>';
                str += '&nbsp;&nbsp;|&nbsp;&nbsp;';
                str += '<a href="javascript:edit()">编辑</a>';

            return str;
        }
    </script>
<%-- <fmt:formatDate value="${ent.inputTime}" pattern="yyyy-MM-dd HH:mm" />--%>
</head>
<body>
<div class="container">
    <!-- 信息列表 title="分页测试" -->
    <%--若为post，则需要配置data-content-type="application/x-www-form-urlencoded"，否则后台使用@RequestParam取不到前端传递的参数--%>
    <table id="datagrid" data-toggle="table"
           data-url="${path}/Test/page_dg.do"
           data-click-to-select="true"
           data-search="true"
           data-method="post"
           data-side-pagination="server"
           data-query-params-type="limit"
           data-content-type="application/x-www-form-urlencoded"
           data-pagination="true"
           data-page-size="2"
           data-page-list="[2,10]"
           data-height="500"
           data-toolbar="#toolbar"
           data-single-select="true"
           >
        <thead>
        <tr>
            <th data-field="name" data-align="center">企业名称</th>
            <th data-field="address" data-align="center">所属区域</th>
            <th data-field="jointime" data-align="center" >加入时间</th>
            <th data-field="action" data-align="center" data-formatter="ActionFormatter">操作</th>
        </tr>
        </thead>
    </table>
</div>
</body>
</html>
