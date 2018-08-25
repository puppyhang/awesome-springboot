/**
 * 资源仓库(数据库，NOSQL)等的访问层,避免mapper和service过度耦合,意为service需要的数据可能需要
 * mapper来进行查询之后组合，多用单表查询之后组合,而不是连接查询，连接查询只要有一行数据变化，缓存就会失效
 * 所以在互联网时代，连接查询效率是很差的。
 *
 * @author Ternence
 * @version 1.0
 * @since 2018/8/25 11:17
 */
package com.ternence.springboot.docker.repository;