package com.vidvaan.clint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidvaan.bean.MessageBean;

public class BeanAliasTest {

	public static void main(String[] args) {
		MessageBean message;
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		MessageBean messageBean = context.getBean("messageBean", MessageBean.class);
		messageBean.displayInjectedValue();
		System.out.println();
		System.out.println("get the bean instance from container with alias   name...");
		System.out.println(context.getBean("mb1"));

		message = (MessageBean) context.getBean("mb2");

		System.out.println(message);
		System.out.println(context.getBean("mb3"));

		System.out.println();
		System.out.println("Alias names of 'messageBean' are...");
		String aliasNames[] = context.getAliases("messageBean");
		for (String aliasnames : aliasNames) {
			System.out.println(aliasnames);
		}

	}

}
