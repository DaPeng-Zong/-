package com.leyou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class leyouCorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        //1,添加cors配置信息
        CorsConfiguration config = new CorsConfiguration();
        //1.1 允许的域，不要写*，否则cookie无法使用
        config.addAllowedOrigin("http://manage.leyou.com");
        //1.2是否允许发送cookie信息
        config.setAllowCredentials(true);
        //1.3允许的请求方式
        config.addAllowedMethod("*");
        //1.4允许的头信息
        config.addAllowedHeader("*");

        //2,添加映射路径，我们拦截一切请求
        UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
        configSource.registerCorsConfiguration("/**", config);

        //3，返回新的Corsfilter
        return new CorsFilter(configSource);
    }
}
