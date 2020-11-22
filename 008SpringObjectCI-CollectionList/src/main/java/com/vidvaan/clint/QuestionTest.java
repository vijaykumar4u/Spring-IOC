package com.vidvaan.clint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vidvaan.bean.Question;

public class QuestionTest {

	public static void main(String[] args) {
		Resource resource  = new ClassPathResource("spring.xml");
		BeanFactory beanFactory = new  XmlBeanFactory(resource);
	Question question=	(Question) beanFactory.getBean("reference");
	question.displayInfo();
	///////not executed coz of constructor ambiguty problem

	}

}
