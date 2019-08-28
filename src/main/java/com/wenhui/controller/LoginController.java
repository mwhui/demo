package com.wenhui.controller;

import com.wenhui.entities.Loginnum;
import com.wenhui.entities.User;
import com.wenhui.mapper.LoginnumMapper;
import com.wenhui.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class LoginController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private LoginnumMapper loginnumMapper;
    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        User user = new User();
        user.setUsername(username);
        String pwd = userMapper.getPassword(user.getUsername());
//        System.out.printf("数据库"+pwd);
//        System.out.printf("浏览器"+password);
        if(pwd.equals(password)){
            //登陆成功，防止表单重复提交，可以重定向到主页
            session.setAttribute("loginUser",username);
//            登录成功时时查询当前日期，向数据库写入一次登录操作次数
            Loginnum loginnum = new Loginnum();
            Calendar c = Calendar.getInstance();
            int weekday = c.get(Calendar.DAY_OF_WEEK);
            loginnum.setId((weekday == 1 ? 7 : weekday - 1));
            System.out.printf("当前星期"+(weekday == 1 ? 7 : weekday - 1));
            int num = loginnumMapper.getNum(loginnum.getId());
            loginnum.setNum(num+1);
            loginnumMapper.Update(loginnum);
            //查询所有登录次数，将值put到网页
            List<Integer> login_list=new ArrayList<Integer>();
            for (Loginnum l:loginnumMapper.getAll()){
//                map.put(String.valueOf("week"+l.getId()),l.getNum());
//                session.setAttribute(String.valueOf("week"+l.getId()),l.getNum());
//                System.out.println(session.getAttribute(String.valueOf("week"+l.getId())));
                login_list.add(l.getNum());
            }
            session.setAttribute("login_list",login_list);
            return "redirect:/main.html";
        }else{

            //登陆失败
            map.put("msg","用户名密码错误");
            return  "login";
        }

    }
}