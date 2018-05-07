package com.pc.boot.bootbusinessone.system.service.imp;

import com.pc.system.mapper.UserDao;
import com.pc.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by PC on 2017/7/26.
 */
@Service("uerService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Map<String,Object> findUserByid(int id) {
        return userDao.getUserById(id);
    }
}
