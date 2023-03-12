package com.mine.ts.dao;

import com.mine.ts.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author CaoY
 * @date 2023-03-12 20:18
 * @description UserDAO测试类
 */
@SpringBootTest
public class UserDAOTest {

    @Autowired
    UserDAO userDAO;

    @Test
    public void addTest() {
        User user = new User();
        user.setUsername("张三");
        user.setPassword("XXXXXXX");
        int addCount = userDAO.add(user);
        System.out.println(addCount == 1 ? "添加成功" : "添加失败");
    }

    @Test
    public void updateTest() {
        User user = new User();
        user.setId(3);
        user.setUsername("张三");
        user.setPassword("zsXXXXXX");
        int updateCount = userDAO.update(user);
        System.out.println(updateCount == 1 ? "更新成功" : "更新失败");
    }

    @Test
    public void testGetById() {
        User user = userDAO.getById(1);
        System.out.println(user);
    }

    @Test
    public void testGetByUsername() {
        User user = userDAO.getByUsername("caoy");
        System.out.println(user);
    }

    @Test
    public void testDelete() {
        // 这个要删除的 id 根据实际测出的情况而定
        int deleteCount = userDAO.delete(3);
        System.out.println(deleteCount == 1 ? "删除成功" : "删除失败");
    }

}
