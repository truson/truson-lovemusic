<%--
  Created by IntelliJ IDEA.
  User: lezi
  Date: 2015/12/13
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div style="display: block;" class="enterA" id="enterA">
    <a href="http://zc.qq.com/chs/new.html" id="enterBanner" onclick="window.index&amp;&amp;index.reportBanner()"></a>
    <div class="haomaTitle">
        <div class="haoma-inner" id="haoma-inner">注册帐号</div>
    </div>
    <form action="" method="post" onsubmit="return window.index&amp;&amp;index.submit()">
        <div class="box box_3" style="z-index:0">
            <label class="item" for="nick">昵称</label>
            <div class="ipt_box nick_ipt_box">
                <div id="nick_bg" class="bg_error">
                    <input class="new_txt" id="nick" name="nick" tabindex="6" style="z-index:0" maxlength="24" autocomplete="off" type="text">
                </div>
            </div>
            <div class="info">
                <table>
                    <tbody>
                    <tr>
                        <td id="nick_info" class="error">昵称不可以为空</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="box box_4">
            <label class="item" for="password">密码</label>
            <div class="ipt_box">
                <div id="password_bg" class="bg_txt">
                    <input class="new_txt" id="password" name="password" tabindex="7" maxlength="16" type="password">
                </div>
            </div>
            <div class="info pwd_info">
                <div class="pwd_tips hide" id="pwd_tips">
                    <div class="default" id="pwd_tip1">长度为6-16个字符</div>
                    <div class="default" id="pwd_tip3">不能包含空格</div>
                    <div class="default" id="pwd_tip2">不能是9位以下纯数字</div>
                </div>
                <table id="pwd_result" class="hide">
                    <tbody>
                    <tr>
                        <td id="password_pic">弱</td>
                    </tr>
                    <tr>
                        <td id="password_info" class="password_info"></td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="box box_5">
            <label class="item" for="password_again">确认密码</label>
            <div class="ipt_box">
                <div id="password_again_bg" class="bg_txt">
                    <input class="new_txt" name="pass_again" id="password_again" tabindex="8" maxlength="16" type="password">
                </div>
            </div>
            <div class="info">
                <table>
                    <tbody>
                    <tr>
                        <td id="password_again_info" class="hidden"></td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="box box_6">
            <div class="item">性别</div>
            <div class="ipt_box nobg sex_box">
                <a name="male" id="sex_1" class="checked" tabindex="9">男</a>
                <a id="sex_2" class="unchecked" name="femail" tabindex="10">女</a>
            </div>
            <div class="info">
                <table>
                    <tbody>
                    <tr>
                        <td id="sex_info" class="hidden"></td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="box box_7">
            <div class="item">生日</div>
            <div class="ipt_box nopadding nobg">
                <div id="inptu_search_tips" class="paopao" style="display:none">
                    <span id="inptu_search_tips_wording" class="p_l"></span>
                    <span class="p_r"></span>
                </div>
                <div id="birthday_type_box">
                    <a href="javascript:void(0)" id="birthday_type_value" class="value_box" tabindex="11">公历</a>
                    <ul id="birthday_type_ul" class="hide">
                        <li id="birthday_0" value="0" class="hover">公历</li>
                        <li id="birthday_1" value="1">农历</li>
                    </ul>
                </div>
                <div id="year_box">
                    <div id="year_bg" class="year_bg_txt">
                        <input id="year_value" class="year_value" tabindex="12" value="年" maxlength="10" autocomplete="off">
                    </div>
                    <ul id="year_ul" class="hide">
                        <li value="1896" id="year_119">1896年</li>
                    </ul>
                </div>
                <div id="month_box">
                    <input id="month_value" class="month_value" tabindex="13" value="月" maxlength="4" autocomplete="off">
                    <ul id="month_ul" class="hide"></ul>
                </div>
                <div id="day_box">
                    <input id="day_value" class="day_value" tabindex="14" value="日" maxlength="4" autocomplete="off">
                    <ul id="day_ul" class="hide"></ul>
                </div>
            </div>
            <div class="info">
                <table>
                    <tbody>
                    <tr>
                        <td id="birthday_info" class="hidden"></td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="box box_8">
            <div class="item">所在地</div>
            <div class="ipt_box nopadding nobg">
                <div id="country_box">
                    <div id="country_value_bg" class="area_value_bg">
                        <input id="country_value" class="country_value" tabindex="15" maxlength="20" autocomplete="off" type="text">
                    </div>
                    <ul id="country_ul" class="hide">
                        <li value="1" id="country_0">中国</li>
                    </ul>
                </div>
                <div id="province_box">
                    <div id="province_value_bg" class="area_value_bg">
                        <input id="province_value" class="province_value" tabindex="16" maxlength="20" autocomplete="off" type="text">
                    </div>
                    <ul id="province_ul" class="hide">
                        <li value="11" id="province_0">北京</li>
                    </ul>
                </div>
                <div id="city_box">
                    <div id="city_value_bg" class="area_value_bg">
                        <input id="city_value" class="city_value" tabindex="17" maxlength="20" autocomplete="off" type="text">
                    </div>
                    <ul id="city_ul" class="hide">
                        <li value="1" id="city_0">东城</li>
                    </ul>
                </div>
            </div>
            <div class="info">
                <table>
                    <tbody>
                    <tr>
                        <td id="area_info" class="hidden"></td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="box box_9" id="code_box">
            <label class="item" for="code">验证码</label>
            <div class="ipt_box code_bg">
                <input id="code" class="" name="code" tabindex="18" autocomplete="off" maxlength="8" type="text">
                <img id="code_img" style="float:left;cursor:pointer;margin-left:5px" src="http://captcha.qq.com/getimage?aid=1007901&amp;r=0.6940250209289487" title="点击换一张" onclick="window.index&amp;&amp;index.changeCode(!0)" height="53" width="130">
            </div>
            <div class="info">
                <table>
                    <tbody>
                    <tr>
                        <td class="" id="code_info">
                            <span id="code_info_err" class="tips">请输入图中的字母，不区分大小写</span>
                        </td>
                    </tr>
                    <tr>
                        <td style="height:18px">
                            <span class="change" onclick="window.index&amp;&amp;index.changeCode(!0)" title="点击换一张">点击换一张</span>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div id="phone_box" class="phone_box_land ">
            <div id="sea_phone" class="box box_2 sea_phone">
                <label class="item" for="sea_country_input">地区</label>
                <div class="sea_country_box" id="sea_country_box">
                    <div class="sea_area_value_bg">
                        <input id="sea_country_input" autocomplete="off" class="sea_country_input" tabindex="19">
                    </div>
                    <ul class="combox-list hide">
                        <li class="hover" id="ac1450009059446_0" _value="中国&nbsp;0086">中国&nbsp;0086</li>
                    </ul>
                </div>
            </div>
            <div id="land_phone" class="box box_2 land_phone">
                <label class="item" for="phone_num">
                    <span style="display:inline-block;text-align:center">手机号码</span>
                </label>
                <div id="" class="ipt_box">
                    <div class="ipt_other">
                        <div id="phone_num_bg" class="bg_txt">
                            <input id="phone_num" class="new_txt" name="phone_num" tabindex="20" autocomplete="off" maxlength="11" type="text">
                            <a class="phone_del hide" id="phone_del" href="javascript:void(0);"></a>
                        </div>
                    </div>
                </div>
                <div class="info">
                    <table>
                        <tbody>
                        <tr>
                            <td id="phone_info" class="tip"></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="box box_phone_tip">
                <div class="tip" style="margin-left:189px">
                    <div style="font-size:14px;margin-bottom:5px">忘记密码时，可通过该手机号码快速找回密码</div>
                    <span id="sea_entry" class="tip">
                        请输入中国大陆手机号码（不含小灵通）
                        <br>
                        其他地区号码
                        <a onclick="index.seaPhone()" href="javascript:void(0);">点击这里</a>
                    </span>
                </div>
            </div>
            <div id="sms_box" class="box" style="z-index:0">
                <div class="item"></div>
                <div class="ipt_box verima_ipt_box" id="verima_ipt_box">
                    <div id="verima_bg" class="bg_txt">
                        <input class="new_txt" id="verima" name="verima" style="z-index:0" autocomplete="off" maxlength="6" tabindex="21" type="text">
                    </div>
                    <label id="verima_label" class="noplinfo hide">系统已将验证码发送到您的手机，请填入验证码</label>
                </div>
                <div class="getverima">
                    <div id="getverima" title="获取短信验证码">
                        <span id="timeLeft"></span>
                        <span id="verimaTip">获取短信验证码</span>
                    </div>
                </div>
                <div class="info">
                    <table>
                        <tbody>
                        <tr>
                            <td id="verima_info" class="hidden"></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div id="up_box" class="box hide">
                <div class="item"></div>
                <div class="">
                    <p>
                        请用此手机号发送
                        <span class="green">1</span>
                        到
                        <span class="green">1069 0700 511</span>
                        完成验证
                    </p>
                    <div class="tip">
                        注： 1、您仅需支付运营商收取的标准短信资费，无需任何额外费用。
                        <br>
                        2、腾讯公司承诺不会对外泄漏您的手机号码及用于其他任何商业用途。
                    </div>
                </div>
            </div>
        </div>
        <div class="box box_10" id="qzone_box">
            <div class="item"></div>
            <div class="ipt_box qzone_box nopadding">
                <a class="checked" name="qzone" id="qzone" tabindex="22">同时开通QQ空间</a>
            </div>
        </div>
        <div class="box box_11">
            <div class="item"></div>
            <div class="ipt_box">
                <div class="agree_box">
                    <a name="agree" class="a_1 checked" id="agree" tabindex="22">我已阅读并同意相关服务条款和隐私政策</a>
                    <div id="x_box" class="x_box">
                        <div id="x_switcher" title="点击查看用户协议"></div>
                        <p>
                            <a id="item_1" href="agreement1_chs.html" target="_blank" title="点击查看《QQ号码规则》">《QQ号码规则》</a>
                            <br>
                            <a style="display: inline;" id="item_2" href="http://qzone.qq.com/web/tk.html" target="_blank" title="点击查看《QQ空间服务协议》">《QQ空间服务协议》</a>
                            <br>
                            <a id="item_3" href="http://www.qq.com/privacy.htm" target="_blank" title="点击查看《隐私政策》">《隐私政策》</a>
                            <br>
                        </p>
                    </div>
                </div>
                <div class="submit">
                    <input class="" value="提交注册" title="提交注册" tabindex="23" id="submit" type="submit">
                </div>
            </div>
            <div class="info"></div>
        </div>
    </form>
</div>
</body>
</html>
