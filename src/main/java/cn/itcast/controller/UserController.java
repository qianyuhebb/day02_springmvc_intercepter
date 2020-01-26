package cn.itcast.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 时间：  2020/1/26
 * 创建者：  Administrator 钟文
 * 描述：
 * 参数：
 * 返回值：
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testIntercept")
    public String testException() throws Exception {



        System.out.println("testIntercept 执行了");




        return "success";
    }
}
