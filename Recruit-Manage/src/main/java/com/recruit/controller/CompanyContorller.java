package com.recruit.controller;

import com.alibaba.fastjson.JSON;
import com.recruit.dao.CompanyMapper;
import com.recruit.until.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/company")
public class CompanyContorller {

    @Autowired
//    CompanyMapper companyMapper;

    @RequestMapping("/page")
    public String ToMain(){
        return "main";
    }


//    @RequestMapping("/test")
//    @ResponseBody
//    public ResultEntity testCe(HttpSession session){

//        User M_user = (User) session.getAttribute("user");
//
//        if(M_user == null){
//            return ResultEntity.failed("数据项为空");
//        }

//        CompanyKey key = new CompanyKey();
//        key.setcId(1);
//        Company company = companyMapper.selectByPrimaryKey(key);
//        String com = JSON.toJSONString(company);
//        return ResultEntity.successWithData(company);

//        return com;
//    }
}
