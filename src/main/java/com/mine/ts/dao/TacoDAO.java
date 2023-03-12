package com.mine.ts.dao;

import com.mine.ts.domain.Ingredient;
import com.mine.ts.domain.Taco;
import org.apache.ibatis.annotations.Mapper;

import javax.xml.crypto.Data;
import java.util.List;

/**
 * @author CaoY
 * @date 2023-03-12 22:55
 * @description 卷饼表DAO
 */
@Mapper
public interface TacoDAO {

    /**
     * 新增一种卷饼
     * @param taco
     * @return
     */
    int add(Taco taco);

    /**
     * 修改卷饼信息，主要是修改 名字 和 配料表信息
     * @param taco
     * @return
     */
    int update(Taco taco);

    /**
     * 根据 id 获取卷饼信息
     * @param id
     * @return
     */
    Taco getById(int id);

    /**
     * 根据名字获取卷饼信息
     * @param name taco 表中的 name 是唯一的
     * @return
     */
    Taco getByName(String name);

    /**
     * 获取 begin - end 之间创建的所有taco
     * @param begin
     * @param end
     * @return
     */
    List<Taco> getBetweenDur(Data begin, Data end);

    /**
     * 根据 id 删除 taco 表记录
     * @param id
     * @return
     */
    int delete(int id);

    /**
     * 根据 taco 表的 id 查询该 taco 中的所有配料信息
     * @param id
     * @return
     */
    List<Ingredient> getIngredients(int id);

}
