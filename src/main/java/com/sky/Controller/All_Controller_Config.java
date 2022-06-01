package com.sky.Controller;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class All_Controller_Config {
    // 输出request的尾巴
    @RequestMapping("/*")
    @ResponseBody
    public String s(Request request) {
        return request.getRequestURI().toString();
    }


}
