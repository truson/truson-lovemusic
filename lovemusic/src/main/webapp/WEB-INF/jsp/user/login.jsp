<%--
  Created by IntelliJ IDEA.
  User: lezi
  Date: 2015/12/13
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
  <title>我的音乐网</title>
  <script type="text/javascript">

  </script>
</head>
<body>
<div style="display: block;" class="login_no_qlogin" id="login">
    <div id="header" class="header">
        <div class="switch" id="switch">
            <a class="switch_btn" id="switch_qlogin" href="javascript:void(0);" tabindex="7">快速登录</a>
            <a class="switch_btn_focus" id="switch_login" href="javascript:void(0);" tabindex="8">帐号登录</a>
            <div style="position: absolute; width: 88px; left: 0px;" class="switch_bottom" id="switch_bottom"></div>
        </div>
    </div>
    <div style="display: none;" class="qlogin" id="qlogin"></div>
    <div style="display: block;" class="qrswitch" id="qrswitch">
        <a class="qrswitch_logo" id="qrswitch_logo" href="javascript:void(0)" draggable="false" title="二维码登录"></a>
    </div>
    <div style="display: block; height: 265px;" class="web_qr_login" id="web_qr_login">
        <div style="position: absolute; top: 0px;" class="web_qr_login_show" id="web_qr_login_show">
            <div style="" class="web_login" id="web_login">
                <div class="tips" id="tips">
                    <noscript id="noscript_area">
                        <span class="noscript">
                            您的浏览器脚本被禁用了，
                            <a href="/assistant/noscript.html" target="_blank" style="color: #29B1F1">查看启用方法</a>
                        </span>
                        <img id="noscript_img" style="width:1px;height:1px;" src="/cgi-bin/report?id=301240" />
                    </noscript>
                    <div class="error_tips" id="error_tips">
                        <span class="error_logo" id="error_logo"></span>
                        <span class="err_m" id="err_m"></span>
                    </div>
                    <div style="display: none;" class="operate_tips" id="operate_tips">
                        <span class="operate_content">
                            手机号码也可登录哦，
                            <a class="tips_link" id="bind_account" href="javascript:void(0);">登录个人中心绑定</a>
                        </span>
                        <span class="down_row"></span>
                    </div>
                    <div style="display: none;" class="loading_tips" id="loading_tips">
                        <span id="loading_wording">登录中</span>
                        <img src="http://imgcache.qq.com/ptlogin/v4/style/0/images/load.gif" id="loading_img"
                             place_src="http://imgcache.qq.com/ptlogin/v4/style/0/images/load.gif" align="absmiddle">
                    </div>
                </div>
                <div class="login_form">
                    <form id="loginform" autocomplete="off" name="loginform" action="" method="post" target="_self" style="margin:0">
                        <div class="uinArea" id="uinArea">
                            <label style="display: block;" class="input_tips" id="uin_tips" for="u">QQ号码/手机/邮箱</label>
                            <div class="inputOuter"><input class="inputstyle" id="u" name="u" value="" tabindex="1" type="text">
                                <a class="uin_del" id="uin_del" href="javascript:void(0);"></a>
                            </div>
                            <ul style="display: none;" class="email_list" id="email_list"></ul>
                        </div>
                        <div class="pwdArea" id="pwdArea">
                            <label class="input_tips" id="pwd_tips" for="p">密码</label>
                            <div class="inputOuter">
                                <input class="inputstyle password" id="p" name="p" value="" maxlength="16" tabindex="2" type="password">
                            </div>
                            <div class="lock_tips" id="caps_lock_tips">
                                <span class="lock_tips_row"></span>
                                <span>大写锁定已打开</span>
                            </div>
                        </div>
                        <div class="verifyArea" id="verifyArea">
                            <div class="verifyinputArea" id="verifyinputArea">
                                <label class="input_tips" id="vc_tips" for="verifycode">验证码</label>
                                <div class="inputOuter">
                                    <input name="verifycode" class="inputstyle verifycode" id="verifycode" value="" tabindex="3" type="text">
                                </div>
                            </div>
                            <div class="verifyimgArea" id="verifyimgArea">
                                <img class="verifyimg" id="verifyimg" title="看不清，换一张">
                                <a tabindex="4" href="javascript:void(0);" class="verifyimg_tips">看不清，换一张</a>
                            </div>
                        </div>
                        <div class="submit">
                            <a class="login_button" href="javascript:void(0);">
                                <input tabindex="6" value="登 录" class="btn" id="login_button" type="submit">
                            </a>
                        </div>
                        <input name="aid" value="24000201" type="hidden">
                        <input name="u1" value="http://music.qq.com/close.html" type="hidden">
                        <input name="fp" value="loginerroralert" type="hidden">
                        <input name="h" value="1" type="hidden">
                        <input name="ptredirect" value="0" type="hidden">
                        <input name="ptlang" value="2052" type="hidden">
                        <input name="daid" value="384" type="hidden">
                        <input name="from_ui" value="1" type="hidden">
                        <input name="dumy" value="" type="hidden">
                    </form>
                </div>
                <div style="display: block;" class="bottom" id="bottom_web">
                    <a href="http://ptlogin2.qq.com/ptui_forgetpwd" class="link" id="forgetpwd" target="_blank">忘了密码？</a>
                    <span class="dotted">|</span>
                    <a href="http://ptlogin2.qq.com/j_newreg_url" class="link" target="_blank">注册新帐号</a>
                    <span class="dotted">|</span>
                    <a class="link" id="feedback_web" href="http://support.qq.com/write.shtml?guest=1&amp;fid=713&amp;SSTAG=hailunna" target="_blank">意见反馈</a>
                </div>
            </div>
            <div style="visibility: hidden;" class="qrlogin" id="qrlogin">
                <div style="display: block;" class="qr_step" id="qrlogin_step1">
                    <div class="qr_tips">
                        一扫即上，用
                        <a class="qr_link" href="http://im.qq.com/mobileqq/#from=login" target="_blank">QQ手机版</a>
                        扫描二维码安全登录
                    </div>
                    <div class="qrlogin_bg"></div>
                    <img src="http://ptlogin2.qq.com/ptqrshow?appid=24000201&amp;e=2&amp;l=M&amp;s=3&amp;d=72&amp;v=4&amp;t=0.3158727789451736&amp;daid=384" class="qrlogin_img" id="qrlogin_img">
                </div>
                <div style="display: none;" class="qr_step" id="qrlogin_step2">
                    <div class="qr_tips">扫描成功，请在手机上确认是否授权登录</div>
                    <div class="kao"></div>
                </div>
                <div class="bottom" id="bottom_qr">
                    <a href="http://im.qq.com/mobileqq/#from=login" class="link" id="qrlogin_help" target="_blank">二维码使用帮助</a>
                    <span class="dotted">|</span>
                    <a href="http://ptlogin2.qq.com/j_newreg_url" class="link" target="_blank">注册新帐号</a>
                    <span class="dotted">|</span>
                    <a class="link" id="feedback_qr" href="http://support.qq.com/write.shtml?guest=1&amp;fid=713&amp;SSTAG=hailunna" target="_blank">意见反馈</a>
                </div>
            </div>
        </div>
    </div>
    <div style="display: none;" class="bottom hide" id="bottom_qlogin">
        <a href="javascript:void(0);" class="link vip_link" id="vip_link2" target="_blank">开通QQ会员</a>
        <span class="dotted" id="vip_dot">|</span>
        <a href="http://ptlogin2.qq.com/j_newreg_url" class="link" target="_blank">注册新帐号</a>
        <span class="dotted">|</span>
        <a class="link" id="feedback_qlogin" href="http://support.qq.com/write.shtml?guest=1&amp;fid=713&amp;SSTAG=hailunna" target="_blank">意见反馈</a>
    </div>
    <div id="authLogin" class="authLogin">
        <div class="authHeader" id="authHeader">
            <div class="logo"></div>
            <span class="title">腾讯业务</span>
        </div>
        <div class="authTips"></div>
        <div class="authWording">
            <span>
                <span>点击头像，确认</span>
                <span>腾讯业务</span>
            </span>
        </div>
        <div class="authInfo">
            <a class="face" id="auth_area" tabindex="1" href="javascript:void(0);" draggable="false" hidefocus="true">
                <img id="auth_face">
                <span id="auth_mengban" class=""></span>
                <span class="uin" id="auth_uin"></span>
                <span class="img_out_focus"></span>
                <span class="nick" id="auth_nick"></span>
            </a>
        </div>
        <div class="cancleAuthOuter" id="cancleAuthOuter">
            <a id="cancleAuth" class="cancleAuth">使用其他帐号</a>
        </div>
        <div class="bottom">
            <a class="link feedback_authLogin" id="feedback_authLogin" href="http://support.qq.com/write.shtml?guest=1&amp;fid=713&amp;SSTAG=hailunna" target="_blank">意见反馈</a>
        </div>
    </div>
</div>
</body>
</html>
