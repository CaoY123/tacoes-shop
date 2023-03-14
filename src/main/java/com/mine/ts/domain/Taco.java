package com.mine.ts.domain;


import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author CaoY
 * @date 2022-12-16 1:46
 * @description 墨西哥卷饼类
 */
@Data
@ToString
public class Taco {

    private Long id;

    private Date createdAt;

    private String name;

    private List<Ingredient> ingredients;

    public Taco() {
        createdAt = new Date();
        this.ingredients = new ArrayList<>();
    }


    /**
     * 添加配料，注意只有在没有的基础上才添加
     * @param ingredient
     */
    public void addIngredient(Ingredient ingredient) {
        if (!this.ingredients.contains(ingredient)) {
            this.ingredients.add(ingredient);
        }
    }
}
