package com.yanr.rpc.systemb.service.impl;

import com.yanr.rpc.systemb.pojo.User;
import com.yanr.rpc.systemb.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 钟燕
 * @Description:
 * @Date: Created in 2019/4/9 15:04
 * @Modified By:
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> queryAll() {
        List<User>list =new ArrayList<User>();
        for(int i =0;i <10;i++) {
            User user =new User();
            user.setAge(20+ i);
            user.setId(Long.valueOf(i+ 1));
            user.setPassword("123456");
            user.setUsername("username_"+ i);
            list.add(user);
        }
        return list;
    }
}
