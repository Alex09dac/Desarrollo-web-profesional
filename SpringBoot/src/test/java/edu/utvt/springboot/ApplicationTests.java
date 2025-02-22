package edu.utvt.springboot;

import edu.utvt.springboot.data.entities.Student;
import edu.utvt.springboot.data.repositories.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootTest
class ApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	void contextLoads() {

		Student student = new Student(null, "Don Gato","Y su pandilla");
		studentRepository.save(student);
	}

}
