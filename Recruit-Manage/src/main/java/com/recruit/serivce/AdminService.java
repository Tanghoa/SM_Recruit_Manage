package com.recruit.serivce;

import com.recruit.entity.Admin;

public interface AdminService {

     boolean checkLogin(Admin admin);

     int register(Admin admin);

     int update(Admin admin);

    /***
     * 根据收手机号删除
     * @param admin
     * @return
     */
     boolean delete(Admin admin);


}
