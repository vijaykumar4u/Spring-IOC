package com.vidvaan.bean;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	private Map<Answer, User> answers;

	public Question(int id, String name, Map<Answer, User> answers) {

		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println("answers are:");
		Set<Entry<Answer, User>> set = answers.entrySet();
		Iterator<Entry<Answer, User>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Answer, User> entry = iterator.next();
			Answer answer = entry.getKey();
			User user = entry.getValue();
			System.out.println("Answer Information:");
			System.out.println(answer);
			System.out.println("Posted By:");
			System.out.println(user);

		}
	}

}