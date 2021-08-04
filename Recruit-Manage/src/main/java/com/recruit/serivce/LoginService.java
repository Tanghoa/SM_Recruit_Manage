package com.recruit.serivce;

import com.recruit.entity.User;

public interface LoginService {
    // 登录判断
    public boolean checkLogin(User user);

    // 注册
    public void register(User user);

    // 修改
    public int updata(User user);

}
