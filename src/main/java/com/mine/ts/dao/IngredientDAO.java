package com.mine.ts.dao;

import com.mine.ts.domain.Ingredient;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author CaoY
 * @description 配料表DAO
 */
@Mapper
public interface IngredientDAO {

    /**
     * 新增配料
     * @param ingredient
     * @return
     */
    int add(Ingredient ingredient);

    /**
     * 修改配料信息
     * @param ingredient
     * @return
     */
    int update(Ingredient ingredient);

    /**
     * 根据 id 获取单个配料表记录
     * @param id
     * @return
     */
    Ingredient getById(int id);

    /**
     * 根据配料名获取配料信息，一般情况下只有一个，但是考虑到
     * 特殊情况，此处返回一个List
     * @param name
     * @return
     */
    List<Ingredient> getByName(String name);

    /**
     * 根据类型名获取配料信息
     * @param type
     * @return
     */
    List<Ingredient> getByType(String type);

    /**
     * 根据 id 删除配料信息
     * @param id
     * @return
     */
    int delete(int id);
}
