package com.wenxin.Service;

import com.wenxin.pojo.User;
import org.springframework.stereotype.Service;

public interface UserService {
    public User selectUserbyname(User name);
    public boolean InsertUser(User user);
}
