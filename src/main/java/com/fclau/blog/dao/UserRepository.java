package com.fclau.blog.dao;

import com.fclau.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Edward on 2018/8/4
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String username, String password);
}
