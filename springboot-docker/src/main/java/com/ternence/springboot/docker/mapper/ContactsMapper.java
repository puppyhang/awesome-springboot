package com.ternence.springboot.docker.mapper;

import com.ternence.springboot.docker.entity.Contacts;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Component//将其标记为一个组件，方便idea的智能检测和提示
@org.apache.ibatis.annotations.Mapper//将其标记为一个Mapper,方便被扫描
public interface ContactsMapper extends Mapper<Contacts> {
}