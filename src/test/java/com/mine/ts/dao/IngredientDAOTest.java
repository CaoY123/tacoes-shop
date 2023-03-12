package com.mine.ts.dao;

import com.mine.ts.domain.Ingredient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author CaoY
 * @description IngredientDAO 测试类
 */
@SpringBootTest
public class IngredientDAOTest {

    @Autowired
    private IngredientDAO ingredientDAO;

    @Test
    public void testAdd() {
        Ingredient ingredient = new Ingredient(null, "IGA", Ingredient.Type.SAUCE.name());
        int addCount = ingredientDAO.add(ingredient);
        System.out.println(addCount == 1 ? "添加配料成功" : "添加配料失败");
    }

    @Test
    public void testUpdate() {
        Ingredient ingredient = new Ingredient(30, "IGB", Ingredient.Type.VEGGIES.name());
        int updateCount = ingredientDAO.update(ingredient);
        System.out.println(updateCount == 1 ? "更新配料表记录成功" : "更新失败");
    }

    @Test
    public void testGetById() {
        Ingredient ingredient = ingredientDAO.getById(3);
        System.out.println(ingredient);
    }

    @Test
    public void testGetByName() {
        List<Ingredient> ingredients = ingredientDAO.getByName("意大利饼皮");
        ingredients.forEach(System.out::println);
    }

    @Test
    public void testGetByType() {
        List<Ingredient> ingredients = ingredientDAO.getByType("PROTEIN");
        ingredients.forEach(System.out::println);
    }

    @Test
    public void testDelete() {
        int deleteCount = ingredientDAO.delete(31);
        System.out.println(deleteCount == 1 ? "删除成功" : "删除失败");
    }

}
