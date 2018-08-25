package com.ternence.springboot.docker;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = {"com.ternence.springboot.docker.mapper"},
        annotationClass = Mapper.class)
@EnableTransactionManagement
@SpringBootApplication
public class DockerApplicationStarter {

    public static void main(String[] args) {

        SpringApplication.run(DockerApplicationStarter.class);
    }
}
