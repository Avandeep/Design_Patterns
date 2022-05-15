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
	StudentDao dao;

	@Test
	void createTest() {
		Student stu=new Student();
		stu.setId(13);
		stu.setName("Avandeep");
		stu.setTestScore(90);
		dao.create(stu);
	}
	
	@Test
	void deleteTest() {
		int Id=12;
		dao.delete(Id);
	}

}
