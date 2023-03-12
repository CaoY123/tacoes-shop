package com.mine.ts.dao;

import com.mine.ts.domain.Taco;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author CaoY
 * @description
 */
@SpringBootTest
public class TacoDAOTest {

    @Autowired
    private TacoDAO tacoDAO;

    @Test
    public void testInsert() {
        Taco taco = new Taco();
        taco.setName("墨西哥经典款卷饼");
    }
}
