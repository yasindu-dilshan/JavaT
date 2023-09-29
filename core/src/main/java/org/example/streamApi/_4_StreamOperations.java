package org.example.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class _4_StreamOperations {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");


        // Intermediate Operations - return the stream itself

        // -> Filter
        memberNames.stream().filter(s -> s.startsWith("A"))
                .forEach(System.out::println);


        System.out.println("-----------------------------------");


        // -> Map
        memberNames.stream().filter(s -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);


        System.out.println("-----------------------------------");


        // -> Sorted
        memberNames.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);



        // Terminal Operations - return a result of a certain type after processing all the stream elements

        // -> forEach()
        // -> collect()

        System.out.println("-----------------------------------");


        // -> count()
        long totalMatched = memberNames.stream()
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println(totalMatched);


        System.out.println("-----------------------------------");


        // -> reduce()
        Optional<String> reduced = memberNames.stream()
                .reduce((s1, s2) -> s1 + " -#- " + s2);
        reduced.ifPresent(System.out::println);
    }
}
