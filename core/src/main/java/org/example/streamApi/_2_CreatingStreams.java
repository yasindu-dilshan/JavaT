package org.example.streamApi;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _2_CreatingStreams {
    public static void main(String[] args) {
        // ->  Stream.of()
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        //stream.forEach(System.out::print);

        // Stream is conceptually a pipeline in which elements are computed on demand.

        // -> Stream.generate()
        Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
        //randomNumbers.limit(20).forEach(System.out::println);


         // -> Stream of String chars or tokens
        IntStream intStream = "12345_abcdef".chars();
        intStream.forEach(System.out::println);

    }
}
