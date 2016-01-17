package com.truson.lovemusic.practice.dao.base;

import java.util.List;

/**
 * 基础dao接口<实体>
 * todo 说实话，目前完全体会不到这种接口到实现的好处
 * @author lezi
 * @since 2015-12-24
 * @param <T> 实体
 */
interface BaseDao<T> {

    /**
     * 根据主键ID查询实体对象
     * @param id
     * @return
     */
    T get(Long id);

    /**
     * 根据条件查询数据列表
     * @param queryCondition
     * @param <T>
     * @return
     */
    <T> List<T> selectList(T queryCondition);

    /**
     * 插入一条数据
     * @param entity
     * @return
     */
    int insert(T entity);

    /**
     * 更新一条数据
     * @param entity
     * @return
     */
    int update(T entity);

    /**
     * 物理删除一条数据
     * @param entity
     * @return
     */
    int delete(T entity);

    /**
     * 根据条件查询数据总条数
     * @param queryCondition
     * @return
     */
    int count(T queryCondition);

    /**
     * 查询插入数据的ID，在事务开启状态下有效
     * @return
     */
    Long lastSequence();

}
