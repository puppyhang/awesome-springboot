package com.ternence.springboot.docker.mapper;

import com.ternence.springboot.docker.entity.Contacts;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
@org.apache.ibatis.annotations.Mapper
public interface ContactsMapper extends Mapper<Contacts> {
}