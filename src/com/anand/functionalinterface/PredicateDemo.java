package com.anand.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class PredicateImpl implements Predicate<Integer> {

    @Override
    public boolean test(Integer n) {
        return n % 2 == 0;
    }
}

public class PredicateDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        // Method 1
            Predicate<Integer> predicate = new PredicateImpl();
            numbers.stream()
                    .filter(predicate)
                    .forEach(System.out::println);

        // Method 2
            Predicate<Integer> predicate1 = x -> x %2 == 0;
            numbers.stream()
                .filter(predicate1)
                .forEach(System.out::println);
    }
}
