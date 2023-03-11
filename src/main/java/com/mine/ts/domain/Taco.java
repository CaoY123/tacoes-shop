package com.mine.ts.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author CaoY
 * @date 2022-12-16 1:46
 * @description 墨西哥卷饼类
 */
@Data
public class Taco {

    private Long id;

    private Date createdAt;

    private String name;

    private List<Ingredient> ingredients;// 成分

    public Taco() {
        ingredients = new ArrayList<>();
        createdAt = new Date();
    }
}
