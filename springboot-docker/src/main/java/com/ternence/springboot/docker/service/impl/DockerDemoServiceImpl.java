package com.ternence.springboot.docker.service.impl;

import com.ternence.springboot.docker.entity.Contacts;
import com.ternence.springboot.docker.mapper.ContactsMapper;
import com.ternence.springboot.docker.service.DockerDemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Ternence
 * @version 1.0
 * @since 2018/8/25 0:38
 */
@Service
public class DockerDemoServiceImpl implements DockerDemoService {

    @Resource
    private ContactsMapper contactsMapper;

    @Override
    public List<Contacts> contacts(int page, int pageSize) {
        return contactsMapper.selectAll();
    }
}
