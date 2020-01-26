package com.anand.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class FunctionImpl implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer n) {
      return n * n;
    }
}
public class FunctionDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Method 1

            Function<Integer, Integer> function = new FunctionImpl();
            numbers.stream()
                    .map(function)
                    .forEach(System.out::println);

        // Method 2

        Function<Integer, Integer> function1 = x -> x * x;
        numbers.stream()
                .map(function1)
                .forEach(System.out::println);
    }
}
