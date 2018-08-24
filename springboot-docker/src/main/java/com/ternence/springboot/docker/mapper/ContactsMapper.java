package com.ternence.springboot.docker.mapper;

import com.ternence.springboot.docker.entity.Contacts;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@Repository
public interface ContactsMapper extends Mapper<Contacts> {
}