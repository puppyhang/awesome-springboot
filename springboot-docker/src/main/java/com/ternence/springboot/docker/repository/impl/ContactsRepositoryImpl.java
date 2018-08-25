package com.ternence.springboot.docker.repository.impl;

import com.ternence.springboot.docker.entity.Contacts;
import com.ternence.springboot.docker.mapper.ContactsMapper;
import com.ternence.springboot.docker.repository.ContactsRepository;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 这里应该捕获所有的数据库操作异常,然后将其转化为可读的信息到日志中，不要让其返回到页面上
 *
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
        return contactsMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int delete(Contacts record) {
        return contactsMapper.delete(record);
    }

    @Override
    public int insert(Contacts record) {
        return contactsMapper.insert(record);
    }

    @Override
    public int insertSelective(Contacts record) {
        return contactsMapper.insertSelective(record);
    }

    @Override
    public boolean existsWithPrimaryKey(Object key) {
        return contactsMapper.existsWithPrimaryKey(key);
    }

    @Override
    public List<Contacts> selectAll() {
        return contactsMapper.selectAll();
    }

    @Override
    public Contacts selectByPrimaryKey(Object key) {
        return contactsMapper.selectByPrimaryKey(key);
    }

    @Override
    public int selectCount(Contacts record) {
        return contactsMapper.selectCount(record);
    }

    @Override
    public List<Contacts> select(Contacts record) {
        return contactsMapper.select(record);
    }

    @Override
    public Contacts selectOne(Contacts record) {
        return contactsMapper.selectOne(record);
    }

    @Override
    public int updateByPrimaryKey(Contacts record) {
        return contactsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Contacts record) {
        return contactsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByExample(Object example) {
        return contactsMapper.deleteByExample(example);
    }

    @Override
    public List<Contacts> selectByExample(Object example) {
        return contactsMapper.selectByExample(example);
    }

    @Override
    public int selectCountByExample(Object example) {
        return contactsMapper.selectCountByExample(example);
    }

    @Override
    public Contacts selectOneByExample(Object example) {
        return contactsMapper.selectOneByExample(example);
    }

    @Override
    public int updateByExample(Contacts record, Object example) {
        return contactsMapper.updateByExample(record, example);
    }

    @Override
    public int updateByExampleSelective(Contacts record, Object example) {
        return contactsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public List<Contacts> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) {
        return contactsMapper.selectByExampleAndRowBounds(example, rowBounds);
    }

    @Override
    public List<Contacts> selectByRowBounds(Contacts record, RowBounds rowBounds) {
        return contactsMapper.selectByRowBounds(record, rowBounds);
    }
}
