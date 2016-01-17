package com.truson.lovemusic.practice.dao.base;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * dao与spring.mybatis的桥梁，用以支持dao中可能使用到的各类查询方式
 * @author lezi
 */
public class MyBatisSupport {

	@Autowired @Qualifier("sqlTemplate")
	private SqlSessionTemplate sqlTemplate;

    /**
     * 查询一条数据
     * @param statement 用来映射到sqlmap中配置的sql
     * @param parameter 用来填充sql的参数对象
     * @param <T>
     * @return
     */
    public <T> T selectOne(String statement, Object parameter){
        return sqlTemplate.selectOne(statement, parameter);
    }

    /**
     * 根据查询条件查询数据列表
     * @param statement
     * @param parameter
     * @param <T>
     * @return
     */
    public <T> List<T> selectList(String statement, Object parameter){
        return sqlTemplate.selectList(statement, parameter);
    }

    /**
     * 插入一条数据
     * @param statement
     * @param parameter
     * @return
     */
    public int insert(String statement, Object parameter){
        return sqlTemplate.insert(statement, parameter);
    }

    /**
     * 更新一条数据
     * @param statement
     * @param parameter
     * @return
     */
    public int update(String statement, Object parameter){
        return sqlTemplate.update(statement, parameter);
    }

    /**
     * 物理删除一条数据
     * @param statement
     * @param parameter
     * @return
     */
    public int delete(String statement, Object parameter){
        return sqlTemplate.delete(statement, parameter);
    }


}
