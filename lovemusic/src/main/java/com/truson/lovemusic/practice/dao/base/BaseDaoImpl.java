package com.truson.lovemusic.practice.dao.base;

import java.util.List;

/**
 * 基础dao实现类
 * @param <T>   实体
 * @author lezi
 * @since 2015-12-24
 */
public abstract class BaseDaoImpl<T> extends MyBatisSupport implements BaseDao<T> {

    //todo 这样定义常量的意义是什么？代码美观？
    private final static String DEFAULT_SELECT_BY_ID = "get";
    private final static String DEFAULT_SELECT_LIST = "selectList";
    private final static String DEFAULT_INSERT = "insert";
    private final static String DEFAULT_UPDATE = "update";
    private final static String DEFAULT_DELETE = "delete";
    private final static String DEFAULT_COUNT = "count";
    private final static String DEFAULT_LAST_SEQUENCE = "lastSequence";

    /**
     * 获取命名空前前缀
     * todo 能不能直接获取到子类的全限定名而不要用这种子类实现的方式？
     * @param statement
     * @return
     */
    public abstract String getNameSpace(String statement);

    /**
     * 根据主键ID查询实体对象
     * @param id
     * @return
     */
    public T get(Long id){
        return selectOne(getNameSpace(DEFAULT_SELECT_BY_ID), id);
    }

    /**
     * 根据条件查询数据列表
     * @param queryCondition
     * @param <T>
     * @return
     */
    public <T> List<T> selectList(T queryCondition){
        return selectList(getNameSpace(DEFAULT_SELECT_LIST), queryCondition);
    }

    /**
     * 插入一条数据
     * @param entity
     * @return
     */
    public int insert(T entity){
        return insert(getNameSpace(DEFAULT_INSERT), entity);
    }

    /**
     * 更新一条数据
     * @param entity
     * @return
     */
    public int update(T entity){
        return update(getNameSpace(DEFAULT_UPDATE), entity);
    }

    /**
     * 物理删除一条数据
     * @param entity
     * @return
     */
    public int delete(T entity){
        return update(getNameSpace(DEFAULT_DELETE), entity);
    }

    /**
     * 根据条件查询数据总条数
     * @param queryCondition
     * @return
     */
    public int count(T queryCondition){
        Integer count = selectOne(getNameSpace(DEFAULT_COUNT), queryCondition);
        if(count == null)
            count = 0;
        return count;
    }

    /**
     * 查询插入数据的ID，在事务开启状态下有效
     * @return
     */
    public Long lastSequence(){
        return (Long)selectOne(getNameSpace(DEFAULT_LAST_SEQUENCE), null);
    }

}
