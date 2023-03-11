package com.mine.ts.domain;

import com.mine.ts.dao.UserDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author CaoY
 * @description 用户类的测试
 */
@SpringBootTest
@Slf4j
public class UserTest {

    @Autowired
    private UserDAO userDAO;

    // 测试日志处理效果 以及 数据库查询用户表
    @Test
    public void test1() {
        User user = null;
        user = userDAO.getByUsername("abc");
        System.out.println(user);
//        try {
//            user = userDAO.getByUsername("abc");
//        } catch (Exception e) {
//            log.warn("没有查询到User对象，具体错误信息：{}", e.getMessage());
//            user = null;
//        }
//        System.out.println(user);
    }

}
