package com.wenxin.Service;

import com.wenxin.mapper.UserMapper;
import com.wenxin.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper usermapper;
    public User selectUserbyname(User user){
        return usermapper.selectOne(user);
    }
    @Transactional
    public boolean InsertUser(User user){
        int i=usermapper.insert(user);
        if(i==1){
            return true;
        }
        else
            return false;
    }
}
