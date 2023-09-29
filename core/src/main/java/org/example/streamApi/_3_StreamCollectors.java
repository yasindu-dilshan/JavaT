package org.example.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _3_StreamCollectors {
    /**
     * After performing the intermediate operations on elements in the stream, we can collect the processed elements
       again into a Collection using stream Collector methods
     */
    public static void main(String[] args) {

        // -> Collect Stream Elements to a list
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbers = stream.filter(i -> i%2 == 0)
                .toList();
        System.out.println(evenNumbers);
    }
}
