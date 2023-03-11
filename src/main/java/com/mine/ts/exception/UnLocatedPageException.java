package com.mine.ts.exception;

import com.mine.ts.base.BusinessException;
import com.mine.ts.base.Result;
import com.mine.ts.enums.BusinessExceptionEnum;
import lombok.Data;

/**
 * @author CaoY
 * @date 2023-03-12 0:28
 * @description
 */
public class UnLocatedPageException extends BusinessException {

    public UnLocatedPageException() {
        super(BusinessExceptionEnum.UN_LOCATED_PAGE.getCode(), BusinessExceptionEnum.UN_LOCATED_PAGE.getMsg());
    }

    public UnLocatedPageException(Result result) {
        super(BusinessExceptionEnum.UN_LOCATED_PAGE.getCode(), BusinessExceptionEnum.UN_LOCATED_PAGE.getMsg(), result);
    }
}
