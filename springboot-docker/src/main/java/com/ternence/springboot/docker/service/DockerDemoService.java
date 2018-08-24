package com.ternence.springboot.docker.service;

import com.ternence.springboot.docker.entity.Contacts;

import java.util.List;

/**
 * @author Ternence
 * @version 1.0
 * @since 2018/8/25 0:37
 */
public interface DockerDemoService {

    List<Contacts> contacts(int page, int pageSize);
}
