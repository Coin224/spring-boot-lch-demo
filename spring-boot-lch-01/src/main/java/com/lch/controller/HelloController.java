package com.lch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Controller
 * 控制类 主要负责请求分发  组装响应
 */
@Controller
public class HelloController {

    /**
     * @RequestMapping
     * 指定方法和请求之间的映射关系
     * @ResponseBody
     * 为了返回json类型的数据结构
     * @return
     */
    @RequestMapping
    @ResponseBody
    public String hello() {
        return "hello world";
    }
}
