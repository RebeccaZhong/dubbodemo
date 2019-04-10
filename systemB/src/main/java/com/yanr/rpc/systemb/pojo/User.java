package com.yanr.rpc.systemb.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * User对象
 * @Author: 钟燕
 * @Description:
 * @Date: Created in 2019/4/9 11:32
 * @Modified By:
 */
@Getter @Setter
public class User implements Serializable {
    private static final long serialVersionUID = -7105199107883070295L;
    private Long id;
    private String username;
    private String password;
    private Integer age;
}
