package com.technologyconversations.java8exercises.streams;

import java.util.Comparator;
import java.util.List;

public class OldestPerson {

	public static Person getOldestPerson7(List<Person> people) {
		Person oldestPerson = new Person("", 0);
		for (Person person : people) {
			if (person.getAge() > oldestPerson.getAge()) {
				oldestPerson = person;
			}
		}
		return oldestPerson;
	}

	public static Person getOldestPerson(List<Person> people) {
		return people.stream() // Convert collection to Stream
				.max((a, b) -> {
					int x = a.getAge();
					int y = b.getAge();
					if (x == y) {
						return 0;
					} else if (x < y) {
						return -1;
					} else {  // x > y
						return +1;
					}
				}).get();

		// .max(Comparator.comparing(Person::getAge)) 
		// .get(); 

	}

}
