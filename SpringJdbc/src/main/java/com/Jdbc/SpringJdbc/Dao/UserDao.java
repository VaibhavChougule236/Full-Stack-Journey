package com.Jdbc.SpringJdbc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public UserDao(){

    }

    public int createTable(){
        String query="CREATE TABLE IF NOT EXISTS User ( id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(200),age INT)";
        int affectedRow=this.jdbcTemplate.update(query);
        return affectedRow;
    }

    public int insertUsers(String name, int age) {
        String query = "INSERT INTO User(name, age) VALUES(?, ?)";
        int affectedRow = this.jdbcTemplate.update(query, name, age);
        return affectedRow;
    }


    public int deletetUsers(String name){
        String query="DELETE FROM User WHERE name=?";
        int affectedRow=this.jdbcTemplate.update(query,new Object[]{name});
        return affectedRow;
    }

}
