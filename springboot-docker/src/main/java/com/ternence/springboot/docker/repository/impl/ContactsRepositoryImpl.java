package com.ternence.springboot.docker.repository.impl;

import com.ternence.springboot.docker.entity.Contacts;
import com.ternence.springboot.docker.mapper.ContactsMapper;
import com.ternence.springboot.docker.repository.ContactsRepository;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Ternence
 * @version 1.0
 * @since 2018/8/25 11:22
 */
@Repository
public class ContactsRepositoryImpl implements ContactsRepository<Contacts> {

    @Resource
    private ContactsMapper contactsMapper;

    @Override
    public int deleteByPrimaryKey(Object key) {
        return 0;
    }

    @Override
    public int delete(Contacts record) {
        return 0;
    }

    @Override
    public int insert(Contacts record) {
        return 0;
    }

    @Override
    public int insertSelective(Contacts record) {
        return 0;
    }

    @Override
    public boolean existsWithPrimaryKey(Object key) {
        return false;
    }

    @Override
    public List<Contacts> selectAll() {
        return contactsMapper.selectAll();
    }

    @Override
    public Contacts selectByPrimaryKey(Object key) {
        return null;
    }

    @Override
    public int selectCount(Contacts record) {
        return 0;
    }

    @Override
    public List<Contacts> select(Contacts record) {
        return null;
    }

    @Override
    public Contacts selectOne(Contacts record) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Contacts record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Contacts record) {
        return 0;
    }

    @Override
    public int deleteByExample(Object example) {
        return 0;
    }

    @Override
    public List<Contacts> selectByExample(Object example) {
        return null;
    }

    @Override
    public int selectCountByExample(Object example) {
        return 0;
    }

    @Override
    public Contacts selectOneByExample(Object example) {
        return null;
    }

    @Override
    public int updateByExample(Contacts record, Object example) {
        return 0;
    }

    @Override
    public int updateByExampleSelective(Contacts record, Object example) {
        return 0;
    }

    @Override
    public List<Contacts> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) {
        return null;
    }

    @Override
    public List<Contacts> selectByRowBounds(Contacts record, RowBounds rowBounds) {
        return null;
    }
}
