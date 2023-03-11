package com.mine.ts.base;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 请求结果类
 * @Creator CaoY
 * @param <T> 数据体类型
 */
@Setter
@Getter
@NoArgsConstructor
public class Result<T> implements Serializable {

   /**
    * 消息
    */
   private String message;

   /**
    * 是否操作成功
    */
   private boolean success;

   /**
    * 返回的数据主体（返回的内容）
    */
   private T data;

   /**
    * 定位到的静态页面
    */
   private String pageUrl;

   /**
    * 设定结果为成功
    *
    * @param msg  消息
    * @param data 数据体
    */
   public void setResultSuccess(String msg, T data) {
      this.message = msg;
      this.success = true;
      this.data = data;
   }

   /**
    * 设定结果为失败
    *
    * @param msg 消息
    */
   public void setResultFailed(String msg) {
      this.message = msg;
      this.success = false;
      this.data = null;
   }

   /**
    * 成功时设置 pageUrl，
    * @param msg
    * @param data
    * @param pageUrl 重定向是需要加 redirect 前缀
    */
   public void setResultSuccess(String msg, T data, String pageUrl) {
      this.message = msg;
      this.success = true;
      this.data = data;
      this.pageUrl = pageUrl;
   }

}