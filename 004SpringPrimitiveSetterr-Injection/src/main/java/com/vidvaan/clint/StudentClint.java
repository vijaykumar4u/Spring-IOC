package com.vidvaan.clint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidvaan.bean.Student;

public class StudentClint {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		Student student=applicationContext.getBean("student",Student.class);
	student.display();
	Student student2=applicationContext.getBean("student2",Student.class);
	student2.display();
		
	}

}
