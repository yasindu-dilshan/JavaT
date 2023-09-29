package org.example.streamApi;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,6,1,8);
        nums.stream()
                .filter(n -> n%2==1)
                .sorted()
                .map(n -> n*2)
                .forEach(System.out::println);
    }
}
