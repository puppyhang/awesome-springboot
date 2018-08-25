package com.ternence.springboot.docker.controller;

import com.ternence.springboot.docker.api.BusinessApiStatusEnums;
import com.ternence.springboot.docker.api.dto.FormativeResponseObject;
import com.ternence.springboot.docker.service.DockerDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Ternence
 * @version 1.0
 * @since 2018/8/24 23:16
 */
@RestController
@Slf4j
public class DockerDemoController {
    @Resource
    private DockerDemoService dockerDemoService;

    @GetMapping(path = "/")
    public Object index() {
        log.info("Access docker demo app;");
        return "Welcome to docker demo !";
    }

    @GetMapping("/contacts")
    public FormativeResponseObject<List> contacts() {

        return FormativeResponseObject.builder(List.class)
                .from(BusinessApiStatusEnums.GLOBAL_SUCCESS)
                .data(dockerDemoService.contacts(1, 15))
                .build();

    }
}
