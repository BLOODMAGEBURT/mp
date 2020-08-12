package com.mybatis.xu.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.xu.mp.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName UserMapper.java
 * @Description TODO
 * @createTime 2020年08月06日 14:57:00
 */
@Repository  // 代表持久层
public interface UserMapper extends BaseMapper<User> {
}
