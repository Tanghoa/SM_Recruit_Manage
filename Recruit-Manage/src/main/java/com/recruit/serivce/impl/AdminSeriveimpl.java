package com.recruit.serivce.impl;

import com.recruit.dao.AdminMapper;
import com.recruit.entity.Admin;
import com.recruit.entity.AdminExample;
import com.recruit.serivce.AdminService;
import com.recruit.serivce.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminSeriveimpl implements AdminService {


    @Autowired
    AdminMapper adminMapper;

    @Override
    public boolean checkLogin(Admin admin) {
        AdminExample example = new AdminExample();

        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyAdminTelnoEqualTo(admin.getCompanyAdminTelno());

        List<Admin> list = adminMapper.selectByExample(example);

        if(list == null){
            return false;
        }
        return true;
    }

    @Override
    public int register(Admin admin) {
        int insert = adminMapper.insert(admin);
        return insert;
    }

    @Override
    public int update(Admin admin) {

        AdminExample example = new AdminExample();

        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyAdminNameEqualTo(admin.getCompanyAdminName());

        int update = adminMapper.updateByExampleSelective(admin, example);
        System.out.println(update > 0 ? "true":"false");
        return update;
    }

    @Override
    public boolean delete(Admin admin) {

        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyAdminTelnoEqualTo(admin.getCompanyAdminTelno());
        int delete = adminMapper.deleteByExample(example);

//        System.out.println(delete > 0 ? "yes":"no");
        return delete > 0;
    }

}
