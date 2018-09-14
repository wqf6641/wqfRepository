package com.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//≈‰÷√…®√Ë≥ı ºªØ¿‡
@MapperScan("com.dao")//…®√Ëmybatis◊¢Ω‚
@ComponentScan("com")//…®√Ëspring◊¢Ω‚
public class AppConfig {

}
