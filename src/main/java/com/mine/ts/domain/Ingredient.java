package com.mine.ts.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @author CaoY
 * @description 配料类
 */
/**
 * @author CaoY
 * @description 配料类
 */
@Data
@NoArgsConstructor
public class Ingredient {
    private Integer id;
    private String name;
    private String type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
