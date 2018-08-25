package com.ternence.springboot.docker.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 配置Druid的数据源
 *
 * @author Ternence
 * @version 1.0
 * @since 2018/8/25 13:34
 */
@Configuration
@ServletComponentScan
public class DruidConfiguration {

    @Bean
    //加载时读取指定的配置信息,前缀为spring.datasource.druid
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DataSource druidDataSource() {

        return new DruidDataSource();
    }
}
