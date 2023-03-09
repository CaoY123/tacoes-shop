package com.mine.ts.domain;


import lombok.Data;

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

    void createdAt() {
        createdAt = new Date();
    }

    private String name;

    private List<Ingredient> ingredients = new ArrayList<>();// 成分
}
