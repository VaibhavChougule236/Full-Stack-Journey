package com.Jdbc.SpringJdbc;

import com.Jdbc.SpringJdbc.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {

	@Autowired
	private UserDao userDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userDao.createTable();
		userDao.insertUsers("Vaibhav",42);
		//userDao.deletetUsers("Vaibhav");
	}
}
