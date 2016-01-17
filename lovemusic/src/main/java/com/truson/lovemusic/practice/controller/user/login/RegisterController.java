package com.truson.lovemusic.practice.controller.user.login;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * 用户注册控制层
 * Created by lezi on 2015/12/26.
 */
@Controller
@RequestMapping(value = "/register")
public class RegisterController {

    /**
     * 根据type参数跳转到不同的登录界面
     * @param type
     * @return
     */
    @RequestMapping(value = "toRegister/{type}")
    public String toRegister(@PathVariable int type){
        String redirectPath = "";
        if(type == 1 ){//账号注册
            redirectPath = "user/accountRegister";
        }else if(type == 2){

        }else if(type == 3){

        }else{
            redirectPath = "user/accountRegister";
        }
        return redirectPath;
    }

    @RequestMapping(value = "generateMsgAuthCode")
    public String generateMsgAuthCode(){
        String appkey = "";
        String url = "";
        String secret = "";
        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
        req.setExtend("123456");
        req.setSmsType("normal");
        req.setSmsFreeSignName("阿里大鱼");
        req.setSmsParamString("{\"code\":\"1234\",\"product\":\"alidayu\"}");
        req.setRecNum("13000000000");
        req.setSmsTemplateCode("SMS_585014");
        AlibabaAliqinFcSmsNumSendResponse rsp = null;
        try {
            rsp = client.execute(req);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        System.out.println(rsp.getBody());
        return "";
    }


    @RequestMapping(value = "getVerifyCode")
    public void getVerifyCode(HttpServletResponse response){

    }




}
