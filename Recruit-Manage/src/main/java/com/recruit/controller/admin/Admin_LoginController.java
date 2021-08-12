package com.recruit.controller.admin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.recruit.dao.AdminMapper;
import com.recruit.entity.Admin;
import com.recruit.entity.Company;
import com.recruit.entity.Test;
import com.recruit.serivce.AdminService;
import com.recruit.serivce.CompanyService;
import com.recruit.until.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
@CrossOrigin
@Controller
public class Admin_LoginController {

    @Autowired
    AdminService adminService;

    @RequestMapping("/admin/to/login")
    @ResponseBody
    // 方法必须加 @RequestBody  字段也需保持一致
    public ResultEntity toLogin(@RequestBody  Test admin,HttpSession session){

        session.setAttribute("user",admin);

        System.out.println(admin);
        return ResultEntity.successWithData(admin);
    }


    public void test(HttpServletResponse  response) throws IOException {
        response.sendRedirect("http://localhost:8080");

    }



    @RequestMapping("/get/login")
//    @ResponseBody
    public void  getLogin(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException {

        Test user = (Test) session.getAttribute("user");
        Test user1 = (Test) request.getSession().getAttribute("user");


        System.out.println("user1 = " + user);

//        if(user != null){
//            return ResultEntity.successWithData(user);
//        }

        if(user1 != null){
            request.setAttribute("user",user1);
//            ResultEntity<Test> data = ResultEntity.successWithData(user1);
            String s = JSON.toJSONString(user1);
            response.sendRedirect("http://localhost:8080/#/adminIndex?user="+s);

        }

    }

    // 区分不同用户的登录信息

    // HttpSession session = request.getSession();       // 获取Session对象
    //session.setAttribute("loginTime", new Date());     // 设置Session中的属性

    @RequestMapping("/to/delete/session")
    @ResponseBody
    public String deleteSession(HttpSession session){
        session.removeAttribute("user");
        return "ok";
    }


    @RequestMapping("/to/insertmodel")
    @ResponseBody
    public String  insertSession(HttpServletRequest request, HttpSession session){
        Test test = new Test();
        test.setId(1);
        test.setPassword("123");
        test.setUsername("zs");
        request.getSession().setAttribute("user",test);
        session.setAttribute("user",test);
        return "ok";
    }


    @RequestMapping("/tes")
    public String getToTestModel(Model model){
        model.addAttribute("user","df");
        return "a";
    }









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
