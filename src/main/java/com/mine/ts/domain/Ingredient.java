package com.mine.ts.domain;

import lombok.*;

/**
 * @author CaoY
 * @date 2022-12-16 1:23
 * @description 配料类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {
    private Integer id;
    private String name;
    private String type;

    public static enum Type {
        WRAP,
        PROTEIN,
        VEGGIES,
        CHEESE,
        SAUCE
    }
}
