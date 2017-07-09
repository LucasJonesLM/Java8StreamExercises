package com.technologyconversations.java8exercises.streams;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Joining {

    private Joining() {
    }

    public static String namesToString7(List<Person> people) {
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }

    public static String namesToString(List<Person> people) {
        return people.stream().map(p -> p.getName()).collect(Collectors.joining(", ", "Names: ", "."));
    }

}
