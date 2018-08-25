package com.ternence.springboot.docker;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MapperScan注解一定要把 "*" 加上
 */
@MapperScan(basePackages = {"com.ternence.springboot.docker.mapper.*"},
        annotationClass = Mapper.class)
@EnableTransactionManagement
@SpringBootApplication
public class DockerApplicationStarter {

    public static void main(String[] args) {
        SpringApplication.run(DockerApplicationStarter.class);
    }
}
