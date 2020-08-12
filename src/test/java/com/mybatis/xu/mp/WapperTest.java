package com.mybatis.xu.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatis.xu.mp.mapper.UserMapper;
import com.mybatis.xu.mp.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName WapperTest.java
 * @Description TODO
 * @createTime 2020年08月11日 16:57:00
 */
@SpringBootTest
public class WapperTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    void testGt() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();

        userQueryWrapper.ge("age", 18);

        List<User> users = userMapper.selectList(userQueryWrapper);

        for (User user : users) {
            System.out.println(user.getName());
        }

    }

    @Test
    void testLike() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();

        userQueryWrapper.likeRight("email", "xu");

        List<User> users = userMapper.selectList(userQueryWrapper);
        for (User user : users) {
            System.out.println(user.getEmail());
        }
    }


}
