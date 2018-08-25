package com.ternence.springboot.docker.repository;

import com.ternence.springboot.docker.entity.Contacts;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Ternence
 * @version 1.0
 * @since 2018/8/25 11:20
 */
public interface ContactsRepository<T extends Contacts> extends Mapper<T> {

}
