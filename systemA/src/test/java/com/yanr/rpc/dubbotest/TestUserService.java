package com.yanr.rpc.dubbotest;

import com.yanr.rpc.systema.pojo.User;
import com.yanr.rpc.systema.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: 钟燕
 * @Description:
 * @Date: Created in 2019/4/10 14:48
 * @Modified By:
 */
public class TestUserService {
    private UserService userService;
    @Before
    public void setUp () {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:dubbo/*.xml");
        this.userService = applicationContext.getBean(UserService.class);
    }

    @Test
    public void testQueryAll() {
        List<User> users = this.userService.queryAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
