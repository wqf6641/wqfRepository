package com.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//����ɨ���ʼ����
@MapperScan("com.dao")//ɨ��mybatisע��
@ComponentScan("com")//ɨ��springע��
public class AppConfig {

}
