package com.mine.ts.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author CaoY
 * @description 业务异常枚举类
 */
@Getter
@AllArgsConstructor
public enum BusinessExceptionEnum {

    UN_LOCATED_PAGE("404404", "未定位到页面异常");

    private String code;
    private String msg;
}
