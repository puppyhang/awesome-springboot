package com.ternence.springboot.docker.repository;

import com.ternence.springboot.docker.entity.Contacts;
import tk.mybatis.mapper.common.Mapper;

/**
 * 联系人仓库,继承自Mapper接口,这里相当于作为Mapper通用接口的一个代理,可以在实现类中
 * 用对应的mapper实现这些方法，这样方便service调用那些通用的操作数据库的方法，这里还可以自定义一些自己的
 * 资源仓库访问方法,以用于和service解耦，如果service直接使用mapper，在复杂的业务中会导致其代码臃肿难看
 *
 * @author Ternence
 * @version 1.0
 * @since 2018/8/25 11:20
 */
public interface ContactsRepository<T extends Contacts> extends Mapper<T> {

}
