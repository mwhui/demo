package com.wenhui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {
    @GetMapping("/success")
    public String sucTest(Map<String,Object> map) {
        List<String> list = new ArrayList<>();
        list.add("跨越长城：一个正在努力成长的未来架构师");
        list.add("走向世界：记录小白的成长");
        list.add("github博客：527173005@qq.com");
        map.put("msg", "你好");
        map.put("lists",list);
        return "success";
    }
}
