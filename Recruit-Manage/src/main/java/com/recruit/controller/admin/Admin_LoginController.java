package com.recruit.controller.admin;

import com.recruit.dao.AdminMapper;
import com.recruit.entity.Admin;
import com.recruit.entity.Company;
import com.recruit.serivce.AdminService;
import com.recruit.serivce.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class Admin_LoginController {

    @Autowired
    AdminService adminService;





    // 企业管理员登录
    @RequestMapping("/admin/login")
    public String dologin(
            @RequestParam("login_name") Integer username
            , @RequestParam("login_pass") String password

            , HttpSession session
            , Model model

            ){
        long tel = username;
        Admin admin = new Admin(tel,password);

        System.err.println(admin);

        boolean login = adminService.checkLogin(admin);


        if(login){

            session.setAttribute("admin",login);
            model.addAttribute("admin",login);
            return "admin/main";
        }
//        Admin admin = new Admin(1, username, password);
//        System.out.println(admin);
//        request.setAttribute("user",admin);
        model.addAttribute("error","登录失败");
        return "login";
    }


    /* 注册用户
    * */
    @RequestMapping("/admin/register")
    @ResponseBody
    public String dologin(
            @RequestParam("c_id") Integer cId
            , @RequestParam("c_admin_name") String loginName
            , @RequestParam("c_admin_telno") Long tel
            , @RequestParam("c_admin_email") String email
            , @RequestParam("c_admin_password") String loginPass


             ){

        Admin admin = new Admin(cId,loginName,tel,email,loginPass,0);
//        admin.setCompanyAdminCreateTime("CURRENT_TIMESTAMP");

        int register = adminService.register(admin);
        if(register > 0){
            return "success";
        }


        return "error";
    }





    // 用户退出登录
    @RequestMapping("/admin/logout")
    public String logout(HttpSession session){
        session.removeAttribute("admin");

        return "index";
    }









}
