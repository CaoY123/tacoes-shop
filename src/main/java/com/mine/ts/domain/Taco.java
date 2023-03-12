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
@Getter
public class Taco {

    @Setter
    private Long id;

    @Setter
    private Date createdAt;

    @Setter
    private String name;

    public Taco() {
        createdAt = new Date();
        this.ingredients = new ArrayList<>();
    }

    private List<Ingredient> ingredients;

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
