package com.martea.makemoney.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //设置所有的请求可以进行跨域
        registry.addMapping("/**")
                //允许跨域的ip
                .allowedOrigins("http://localhost:8080")
                //请求的方法 可以不设置 有默认的
                .allowedMethods("*")
                //请求头 可以不设置 有默认的
                .allowedHeaders("*");
    }
}