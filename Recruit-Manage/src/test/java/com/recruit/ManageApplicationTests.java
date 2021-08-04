package com.recruit;

import com.recruit.dao.AdminMapper;
import com.recruit.dao.CompanyMapper;
import com.recruit.entity.Admin;
import com.recruit.entity.AdminExample;
import com.recruit.serivce.AdminService;
import com.recruit.serivce.CompanyService;
import com.recruit.serivce.LoginService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ManageApplicationTests {

    @Autowired
    LoginService loginService;

    @Autowired
    AdminService companyService;

    @Autowired
    AdminMapper adminMapper;

    // 企业注册信息
    @Test
    void contextLoads() {
        Admin admin = new Admin(2,"圣达菲企业",15947125586L,"doate@163.com","123456",0);

//        admin.setCompanyAdminCreateTime();
        int register = companyService.register(admin);

        System.out.println(register > 0 ? "yes":"no");


    }

    // 检查登录
    @Test
    void checkLogin(){
        Admin admin = new Admin(15947312285L,"123456");
//        boolean checkLogin = companyService.checkLogin(admin);
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();

        criteria.andCompanyAdminTelnoEqualTo(admin.getCompanyAdminTelno());
//        criteria.andCompanyIdEqualTo(1);
        List<Admin> list = adminMapper.selectByExample(example);
//        Admin admin1 = adminMapper.selectByPrimaryKey(1);
        Admin ad = list.get(0);
        System.out.println(ad);
        if(ad != null){
            System.out.println("ok");
            return;
        }
        System.out.println( "failed");
    }
    // 更新操作 测试
    @Test
    void update(){
        Admin admin = new Admin();
        admin.setCompanyAdminEmail("464@163.com");
        admin.setCompanyAdminName("zs");

        AdminExample example = new AdminExample();

        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyAdminNameEqualTo(admin.getCompanyAdminName());

        int update = adminMapper.updateByExampleSelective(admin, example);
        System.out.println(update > 0 ? "true":"false");
    }

    @Test
    void tes_del(){

        Admin admin = new Admin();
        admin.setCompanyAdminTelno(15947312285L);
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyAdminTelnoEqualTo(admin.getCompanyAdminTelno());
        int delete = adminMapper.deleteByExample(example);

        System.out.println(delete > 0 ? "yes":"no");
    }




}
