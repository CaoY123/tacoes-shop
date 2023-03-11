package com.mine.ts.config;

import com.mine.ts.base.BusinessException;
import com.mine.ts.base.Result;
import com.mine.ts.exception.UnLocatedPageException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice
public class GlobalExceptionHandler {
//    @ExceptionHandler(value = Exception.class)
    public ModelAndView handleException(Exception e) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("error"); // 默认错误页面

        if (e instanceof UnLocatedPageException) {
            UnLocatedPageException exception = (UnLocatedPageException) e;
            Result result = exception.getResult();

            if (result.getPageUrl() != null) {
                // 如果设置了redirectUrl属性，则重定向到指定页面
                mav.setViewName(result.getPageUrl());
            } else {
                // 否则返回JSON格式的Result对象
                mav.addObject("result", result);
            }
        }

        return mav;
    }
}
