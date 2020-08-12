package com.mybatis.xu.mp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatis.xu.mp.mapper.UserMapper;
import com.mybatis.xu.mp.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MpApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {

        System.out.println(userMapper.selectList(null));

    }

    @Test
    void testInsert() {
        User user = new User();
        user.setName("wangerxiao");
        user.setAge(18);
        user.setEmail("wangerxiao@gmail.com");

        int result = userMapper.insert(user);
        System.out.println(result);
    }

    @Test
    void testUpdate() {
        User user = new User();
        user.setId(1293084892872142849L).setEmail("xybobo@vocoor.com").setAge(20);

        int result = userMapper.updateById(user);
        System.out.println(result);

    }

    @Test
    void testOptimisticLocker() {

        User user1 = userMapper.selectById(1293084892872142849L);

        user1.setName("wangErXiao");

        User user2 = userMapper.selectById(1293084892872142849L);

        user2.setName("JianSuYing");
        userMapper.updateById(user2);

        userMapper.updateById(user1);
    }


    // 测试分页
    @Test
    void testPage() {
        Page<User> userPage = new Page<>(2, 5);

        IPage<User> userIPage = userMapper.selectPage(userPage, null);

        List<User> records = userIPage.getRecords();

        for (User record : records) {

            System.out.println(record.getName());
        }

    }


}
