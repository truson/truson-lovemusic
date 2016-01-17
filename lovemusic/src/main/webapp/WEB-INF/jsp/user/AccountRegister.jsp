<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的音乐网</title>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
</head>
<body>
<div>
    <div>
        <div>注册账号</div>
    </div>
    <form action="/register/accountRegister" method="post">
        <div>
            <label>账号</label>
            <div>
                <input name="account" tabindex="1" maxlength="24" autocomplete="off" type="text">
            </div>
            <div>
                <div>请输入账号</div>
            </div>
        </div>
        <div>
            <label>密码</label>
            <div>
                <input name="pwd" tabindex="2" maxlength="16" autocomplete="off" onpaste="return false" type="password">
            </div>
            <div>
                <div>请设置密码</div>
            </div>
        </div>
        <div>
            <label>确认密码</label>
            <div>
                <input name="pwdRepeat" tabindex="3" maxlength="16" autocomplete="off" onpaste="return false" type="password">
            </div>
            <div>
                <div>请再次输入密码</div>
            </div>
        </div>
        <div>
            <label for="code">验证码</label>
            <div>
                <input id="code" name="code" tabindex="4" autocomplete="off" maxlength="8" type="text">
                <img id="code_img" src="" title="点击换一张" onclick="">
            </div>
            <div>
                <table>
                    <tbody>
                    <tr>
                        <td class="" id="code_info">
                            <span id="code_info_err">请输入图中的字母，不区分大小写</span>
                        </td>
                    </tr>
                    <tr>
                        <td style="height:18px">
                            <span onclick="" title="点击换一张">点击换一张</span>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </form>
</div>
</body>
</html>
