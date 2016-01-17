package com.truson.test.dataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * jdbc连接数据库测试（mysql）
 * 擦~当年明明认认真真看过的，忘得一干二净了
 * Created by lezi on 2015/12/24.
 */
public class JdbcText {
    public static void main(String[] args){
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            //加载mysql驱动
            Class.forName("com.mysql.jdbc.Driver");
            //数据库连接数据
            String url = "http://localhost:3306/lovemusic";
            String user = "root";
            String password = "zxczxc";
            //获取数据库连接
            connection = DriverManager.getConnection(url);
            //statemen对象是Sql的载体
            statement = connection.createStatement();
            //编写sql
            String sql = "select * from user_info where is_delete = 0";
            //执行sql并得到返回对象
            resultSet = statement.executeQuery(sql);
            System.out.println("取到" + resultSet.getFetchSize() + "条数据了");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //切记释放数据库连接
            try{
                if(resultSet != null) {
                    resultSet.close();
                }
                if(statement != null) {
                    statement.close();
                }
                if(connection != null) {
                    connection.close();
                }
            }catch(Exception e) {
                System.err.println("SQLException:"+e.getMessage());
            }
        }
    }
}
