package com.recruit.controller;

import com.recruit.entity.User;
import com.recruit.serivce.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;

//    @RequestMapping("/")
//    public String toMain(){
//        return "user/main";
//    }


    @RequestMapping("/to/page")
    public String getToLogin(){
        return "user/index";
    }


    // 用户登录
    @RequestMapping("/user/login")
    public String dologin(
            @RequestParam("username") String username
            , @RequestParam("password") String password

            , HttpSession session
            , Model model

            ){



        User user = new User(username, password);
        boolean login = loginService.checkLogin(user);

        if(login){

            session.setAttribute("user",user);
            model.addAttribute("user",user);
            return "user/main";
        }
//        Admin admin = new Admin(1, username, password);
//        System.out.println(admin);
//        request.setAttribute("user",admin);
        model.addAttribute("error","登录失败");
        return "user/index";
    }


    /* 注册用户
    * */
    @RequestMapping("/user/register")
    @ResponseBody
    public String dologin(
            @RequestParam("username") String username
            , @RequestParam("password") String password
            ,@RequestParam("tel") String tel
    ){
        System.out.println("username="+username+"password="+password+"tel="+tel);
        User user = new User(username, password, tel);
        loginService.register(user);
        return "success";
    }


    // 用户更新密码
    @RequestMapping("/user/updata")
    @ResponseBody
    public String updata(
            @RequestParam("username") String username
            , @RequestParam("password") String password){

        User user = new User(username, password);
        int updata = loginService.updata(user);
        if(updata > 0 ){
            return "success";
        }

        return "error";


    }



    // 用户退出登录
    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");

        return "login";
    }



    @RequestMapping("/to-login")
    public String tologin(HttpServletRequest request){
        request.setAttribute("user","zs");
        return "login";
    }

    @RequestMapping("/")
    public String login(HttpServletRequest request){
        if(request.getAttribute("user") != null){
            return "redirect:/rlogin";
        }
       return "index";
    }

    @RequestMapping("/rlogin")
    public String checkLogin(){


        return "login";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
//        Admin admin = adminMapper.selectByPrimaryKey(1);
//        User user = lo.selectByPrimaryKey(1);
//        String msg = JSON.toJSONString(user);
////        System.out.println(admin);
        return "msg";
    }

}
