package com.truson.test.taobao;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

/**
 * 测试淘宝大鱼的发送短信功能
 * Created by lezi on 2015/12/27.
 */
public class SendMsgTest {

    public static void main(String[] args){
        String appkey = "23290440";
        String url = "http://gw.api.taobao.com/router/rest";
        String secret = "148eb28e4075f235f8798d853e20b0d1";
        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
        req.setExtend("123456");
        req.setSmsType("normal");
        req.setSmsFreeSignName("注册验证");
        req.setSmsParamString("{\"code\":\"1234\",\"product\":\"lovemusic\"}");
        req.setRecNum("13264377885");
        req.setSmsTemplateCode("SMS_3865119");
        AlibabaAliqinFcSmsNumSendResponse rsp = null;
        try {
            rsp = client.execute(req);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        System.out.println(rsp.getBody());
    }


}
