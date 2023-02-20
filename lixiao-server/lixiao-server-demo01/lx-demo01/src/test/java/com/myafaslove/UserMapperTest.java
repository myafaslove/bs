package com.myafaslove;

import com.myafaslove.entity.User;
import com.myafaslove.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author myafaslove
 * @description:
 * @date 2023/2/20 - 15:32
 */
@SpringBootTest
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testGetAll() {
//        userMapper.insert()
//        userMapper.selectById()
//        userMapper.updateById()
//        userMapper.delete()
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testAdd() {
        User user = new User(null, "jack", 18, "ssss@qq.com");
        userMapper.insert(user);
    }

    @Test
    public void testUpdate() {
        User user = new User(1L, "wuF", 23, "ssss@qq.com");
        userMapper.updateById(user);
    }

    @Test
    public void testDelete() {
        userMapper.deleteById(1627576084390326273L);
    }
}
