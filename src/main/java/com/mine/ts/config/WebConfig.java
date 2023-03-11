package com.mine.ts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * 拦截器注册
 * @Creator CaoY
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

   /**
    * 把我们定义的拦截器类注册为 Bean
    */
   @Bean
   public UserInterceptor getUserInterceptor() {
      return new UserInterceptor();
   }

   @Override
   public void addViewControllers(ViewControllerRegistry registry) {
      registry.addViewController("/").setViewName("home");
   }

   /**
    * 添加拦截器，并配置拦截地址
    */
   @Override
   public void addInterceptors(InterceptorRegistry registry) {
      List<String> pathPatterns = new ArrayList<>();
      pathPatterns.add("/update");
      registry.addInterceptor(getUserInterceptor()).addPathPatterns(pathPatterns);
   }

}