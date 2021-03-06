package com.pc.boot.bootbusinessone.system.mapper;

import com.pc.system.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * Created by PC on 2017/7/26.
 */
@Mapper
public interface UserDao {

    Map<String,Object> getUserById(int id);

    SysUser findByUserName(String name);
}
