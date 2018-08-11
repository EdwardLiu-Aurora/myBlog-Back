package com.fclau.blog.service;

import com.fclau.blog.po.User;

/**
 * Created by Edward on 2018/8/4
 */
public interface UserService {
    User checkUser(String username, String password);
}
