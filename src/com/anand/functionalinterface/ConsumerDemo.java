package com.anand.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println("Name = " + s);
    }
}

public class ConsumerDemo {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("john", "kumar", "prasad");

        // Method 1

            Consumer<String> consumer = new ConsumerImpl();
            students.stream()
                    .forEach(consumer);

        // Method 2

            Consumer<String> consumer1 = x -> System.out.println("Method 2 name = " + x);
            students.stream()
                    .forEach(consumer1);
    }
}
