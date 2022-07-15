package com.hopefuls.config;/**
 * @author Denwher
 * @version 1.0
 */

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @projectName: nusuch
 * @package: com.hopefuls.config
 * @className: MPConfig
 * @author: Denwher
 * @description: TODO mybatis plus 插件设置
 * @date: 2022/7/14
 * @version: 1.0
 */
@Configuration
public class MPConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
