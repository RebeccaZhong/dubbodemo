package com.yanr.rpc.systemb.service;

import com.yanr.rpc.systemb.pojo.User;

import java.util.List;

/**
 * @Author: 钟燕
 * @Description:
 * @Date: Created in 2019/4/9 15:03
 * @Modified By:
 */
public interface UserService {
    List<User> queryAll();
}
