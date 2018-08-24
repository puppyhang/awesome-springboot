package com.ternence.springboot.docker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages={"com.ternence.springboot.docker.mapper"})
@SpringBootApplication
public class DockerApplicationStarter {

    public static void main(String[] args) {
        SpringApplication.run(DockerApplicationStarter.class);
    }
}
