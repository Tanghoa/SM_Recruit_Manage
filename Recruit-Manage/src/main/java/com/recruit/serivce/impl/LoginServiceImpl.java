package com.recruit.serivce.impl;

import com.recruit.dao.UserMapper;
import com.recruit.entity.User;
import com.recruit.entity.UserExample;
import com.recruit.serivce.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserMapper userMapper;


    @Override
    public boolean checkLogin(User user) {
        UserExample example = new UserExample();

        UserExample.Criteria criteria = example.createCriteria();

        criteria.andUNameEqualTo(user.getuName())
                .andUPassEqualTo(user.getuPass());
        List<User> list = userMapper.selectByExample(example);

        if (list.size() == 0){
            return false;
        }
        return true;
    }

    @Override
    public void register(User user) {
        userMapper.insert(user);
    }

    @Override
    public int updata(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();

        criteria.andUNameEqualTo(user.getuName());
       return userMapper.updateByExampleSelective(user, example);

    }
}
