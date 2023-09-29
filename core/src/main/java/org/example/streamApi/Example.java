package org.example.streamApi;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        // What is Stream

        List<Integer> nums = Arrays.asList(4,5,6,1,8);
        nums.stream()
                .filter(n -> n%2==1)
                .sorted()
                .map(n -> n*2)
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(x -> x % 2 == 0) // Filter even numbers
                .mapToInt(Integer::intValue) // Map to int
                .sum(); // Calculate the sum

        System.out.println("Sum of even numbers: " + sum);


    }
}
