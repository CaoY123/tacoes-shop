package com.mine.ts.dao;

import com.mine.ts.domain.Ingredient;
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
        taco.addIngredient(new Ingredient(1, "蒸制饼皮", Ingredient.Type.WRAP.name()));
        taco.addIngredient(new Ingredient(5, "美国精品肥牛", Ingredient.Type.PROTEIN.name()));
        taco.addIngredient(new Ingredient(10, "生菜", Ingredient.Type.VEGGIES.name()));
        taco.addIngredient(new Ingredient(17, "玛斯卡彭奶酪", Ingredient.Type.CHEESE.name()));
        taco.addIngredient(new Ingredient(22, "柱侯酱汁", Ingredient.Type.SAUCE.name()));

//        System.out.println(taco);
        int addCount = tacoDAO.add(taco);
        System.out.println("新增卷饼个数：" + addCount);

    }
}
