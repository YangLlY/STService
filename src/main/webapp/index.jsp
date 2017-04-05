
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="utf-8"/>
    <title>登录</title>

    <link type="text/css" rel="stylesheet" media="all" href="/Static/css/login.css" />

    <link rel="shortcut icon" href="/Static/img/logo.ico" type="image/x-icon"/>
    <link rel="icon" href="/Static/img/logo.ico" type="image/x-icon"/>

</head>

<body>
<div class="container">
    <div class="header" >
        <a class="header_logo"></a>
    </div>
    <div class="content" >
        <div class="content_wrapper">
            <div class="login_pictures">
                <div class="login_pictures_title">
                    金华市流动人口管理系统
                </div>


                <div class="login_pictures_picture">
                </div>
            </div>
            <div class="login_container">
                <div class="login_header">
                    <p>用&nbsp;户&nbsp;登&nbsp;录
                    </p>
                </div>
                <div class="login_tips">
                </div>
                <div class="login_form">
                    <form class="loginform" action="/user/login.do" method="post">
                        <table>
                            <tr>
                                <td class="login_info">账号：</td>

                                <td  ><input name="userCode"  type="text" class="login_input" /></td>
                            </tr>
                            <tr>
                                <td class="height20"></td>
                            </tr>
                            <tr>
                                <td class="login_info">密码：</td>

                                <td  ><input name="userPassword"  type="password" class="login_input" /></td>
                            </tr>
                            <tr>
                                <td class="height20"></td>
                            </tr>
                            <tr>
                                <td class="login_info"></td>
                                <td >
                                    <a href="javascript:document.forms[0].submit();" ><input class="login_button" value="登录" type="submit" /></a>

                                </td>

                                <td width="55px"><span class="required"></span></td>
                            </tr>

                        </table>
                    </form>

                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
