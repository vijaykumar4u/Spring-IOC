package com.vidvaan.bean;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	private Map<String, String> answers;

	public Question(int id, String name, Map<String, String> answers) {

		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println("answers are:");
		Set<Entry<String, String>> set = answers.entrySet();
		Iterator<Entry<String, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println("Answer:" + entry.getKey() + " Posted By:" + entry.getValue());

		}
	}

}