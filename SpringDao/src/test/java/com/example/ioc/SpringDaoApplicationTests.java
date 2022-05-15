package com.example.ioc;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringDaoApplicationTests {
	
	@Autowired
	EmployeeDao dao;

	@Test
	void createTest() {
		Employee emp=new Employee();
		emp.setId(11);
		emp.setName("Avandeep");
		dao.create(emp);
	}

}
