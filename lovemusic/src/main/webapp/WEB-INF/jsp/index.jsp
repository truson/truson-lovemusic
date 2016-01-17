<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>我的音乐网</title>
    <link rel="stylesheet" href="/static/css/frame_only.css" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

<script type="text/javascript">
    function openRegisterPage(){
        var url = "/register/toRegister/1";
        location.href = url;
    }
</script>


</head>
<body>
<div class="frame_top" id="js_frame_top">
    <div class="header_top">
        <div class="navlist">
            <ul>
                <li class="mod_user" id="top_info"><p class="top_info unlogined" id="spanuserinfo">您还未登录，<a href="javascript:;" onclick="g_user.openLoginPage();" title="马上登录">马上登录</a></p></li>
                <li class="mod_user" id="top_regiter">
                    <a href="javascript:;" onclick="openRegisterPage();" title="免费注册">免费注册</a>
                </li>
                <li class="nav_musicvip"><img src="http://i.gtimg.cn/music/icon/vip.png?max_age=2592000" alt="绿钻"/><a title="绿钻" href="http://vip.music.qq.com" target="_blank"><span>绿钻</span></a></li>
                <li class="nav_software"><a href="http://kg.qq.com/?pgv_ref=qqmusic.y.topmenu" target="_blank" title="全民K歌"><span>全民K歌</span></a></li>
                <li class="nav_software"><a href="http://y.qq.com/yanchu/?pgv_ref=qqmusic.y.topmenu" target="_blank" title="QQ演出"><span>QQ演出</span></a></li>
                <li class="nav_qplay"><a href="http://y.qq.com/y/static/down/qplay.html?pgv_ref=qqmusic.y.topmenu" target="_blank" title="QPlay"><span>QPlay</span></a></li>
            </ul>
        </div>
    </div>
  <div class="main_top" id="divtopmenu">
    <h1 class="frame_logo"><img class="img_logo" src="http://imgcache.gtimg.cn/mediastyle/musicprotal/img/frame_logo_min.png?max_age=259200" alt="QQ音乐"/><a href="about:blank" onclick="showIndex();top.pgvClickStat('logo.qqmusic');" target="contentFrame" class="logo" title="QQ音乐-中国最新最全免费正版高品质音乐平台！">QQ音乐</a></h1>
    <div class="frame_search">
      <a href="http://y.qq.com/y/static/s_search/search.html" class="hide" accesskey="s" target="contentFrame">需要搜索的朋友，在这里敲击回车键进入，或者按快捷键Alt加s进入</a>
      <input type="text" value="找到好音乐" class="search_text" id="keyword" onfocus="if(this.value=='找到好音乐'){this.value='';};MUSIC.css.addClassName(this.parentNode, 'search_focus');MUSIC.widget.intellMatch.set(this.value);"  onblur="if(this.value==''){this.value='找到好音乐';};MUSIC.css.removeClassName(this.parentNode, 'search_focus');MUSIC.widget.intellMatch.clear();"  onkeydown="var event=MUSIC.event.getEvent();if(event.keyCode==13){if (window.frames['contentFrame'].location.href.indexOf('y.qq.com/y/static/s_search/')!=-1) { MUSIC.dom.get('contentFrame').src = 'http://y.qq.com/y/static/s_search/search.html?type=1';setTimeout(function(){top.frames['contentFrame'].g_simpleSearchChn.submit(MUSIC.dom.get('keyword').value.trim());}, 100); }	else {MUSIC.widget.intellMatch.search();}}" x-webkit-speech speech lang="zh-CN" autocomplete="off"/><input type="button" value="搜索" onclick="if (window.frames['contentFrame'].location.href.indexOf('y.qq.com/y/static/s_search/')!=-1) { MUSIC.dom.get('contentFrame').src = 'http://y.qq.com/y/static/s_search/search.html?type=1';setTimeout(function(){top.frames['contentFrame'].g_simpleSearchChn.submit(MUSIC.dom.get('keyword').value.trim());}, 100); }	else {var event=MUSIC.event.getEvent();if(event.keyCode==13){}else MUSIC.widget.intellMatch.curIndex=-1;MUSIC.widget.intellMatch.search();}" id="search_form" class="go_search" />
      <div class="search_result" id="keywords_list">
        <ul>
        </ul>
      </div>
    </div>
    <div class="navigation">
      <ul id="divnavigation">
        <li class="nav_home" ><a href="about:blank" onclick="showIndex();" target="contentFrame"
                ><span>音乐馆</span></a></li>
        <li class="nav_mv"><a href="http://i.y.qq.com/v8/fcg-bin/fcg_v8_mvout4web.fcg?format=html&tpl=tpl&pgv_ref=qqmusic.y.topmenu" target="contentFrame"><span>MV</span></a></li>
        <li class="nav_mymusic"><a href="/y/static/mymusic/mymusic_index.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame"><span>我的音乐</span></a></li>
        <li class="nav_software"><a href="/y/static/down/index.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame"><span>下载客户端</span></a></li>
      </ul>
    </div>
    <div class="sub_navigation" id="divsubmenu">
      <!--音乐馆-->
      <p class="sub_lib">
        <a href="about:blank" onclick="showIndex();" target="contentFrame">首页</a>|
        <a href="http://i.y.qq.com/v8/fcg-bin/fcg_v8_toplist_cp.fcg?page=index&format=html&tpl=20&pgv_ref=qqmusic.y.topmenu" target="contentFrame">排行榜</a>|
        <a href="/y/static/taoge/taoge_list.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame" >歌单广场</a>|
        <a href="/y/static/radio/index.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame" >电台</a>|
        <a href="/y/static/singer/index/all_hot_1.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame">歌手</a>|
        <a  href="y/static/shoufa/index.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame">独家首发</a>|
        <a  href="/y/static/album/index.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame">专辑</a>
      </p>
      <p class="sub_mv"><a  href="http://i.y.qq.com/v8/fcg-bin/fcg_v8_mvout4web.fcg?format=html&tpl=tpl&pgv_ref=qqmusic.y.topmenu" target="contentFrame">MV推荐</a>|<a  href="/y/static/mv/mv_toplist.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame">MV排行榜</a>|<a  href="/y/static/mv/lib.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame">MV库</a>|<a  href="/y/static/mv/live/1.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame">音乐现场</a>|<a  href="/y/static/mv/topic/1.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame">MV专题</a>|<a  href="/y/static/mv/mv_play.html?cid=brh8ox942pb5wwk&pgv_ref=qqmusic.y.topmenu" target="target">巅峰榜盛典</a></p>
      <!--我的音乐-->
      <p class="sub_mymusic"><a href="/y/static/mymusic/mymusic_index.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame">主页</a>|<a href="/y/static/mymusic/mymusic_albumlist.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame">歌单</a>|<a href="/y/static/mymusic/mymusic_mvlist.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame">MV收藏</a>|<a  href="/y/static/mymusic/mymusic_follow_listen.html?type=mylisten&pgv_ref=qqmusic.y.topmenu" target="contentFrame">听众</a>|<a  href="/y/static/mymusic/mymusic_follow_listen.html?type=singer&pgv_ref=qqmusic.y.topmenu" target="contentFrame">收听</a></p>
      <!--Qplay-->
      <p class="sub_qplay"><a href="http://y.qq.com/y/static/down/qplay.html?pgv_ref=qqmusic.y.topmenu" target="_blank">功能介绍</a>|<a href="/y/static/qplay/qplay_coop.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame" class="nonce">合作厂商</a></p>
      <!--下载客户端-->
      <p class="sub_software"><a href="/y/static/down/index.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame">首页</a>|<a href="/y/static/down/detail.html?pgv_ref=qqmusic.y.topmenu" target="contentFrame">下载</a></p>
    </div>
  </div>
</div>
</body>
</html>
