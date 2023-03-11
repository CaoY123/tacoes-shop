package com.mine.ts.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author CaoY
 * @date 2022-12-17 17:30
 * @description 订单类
 *
 * 这里顺便要实现对于数据有效性的校验，
 * 包括：
 * 1. 在实体类上通过validation坐标的注解来进行数据的校验
 * 2. 在相应的Controller中进行校验，即在数据发送过来的时候也要加上相应的校验有效性的注解
 * 3. 为了使得错误的数据能及时响应给用户，要对前端的页面做修改，以捕捉信息显示给用户
 */
@Data
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;

    private Date placedAt;

    private String name;

    private String street;

    private String city;

    private String state;

    private String zip;

    private String ccNumber;

    private String ccExpiration;

    private String ccCVV;

    private User user;// 用户 与 订单是一对多的关系

    List<Taco> tacos = new ArrayList<>();
}
