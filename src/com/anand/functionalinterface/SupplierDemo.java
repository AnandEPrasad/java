package com.anand.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

class SupplierImpl implements Supplier<String> {

    @Override
    public String get() {
        return "No names method 1";
    }
}

public class SupplierDemo {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("john","kumar","prasad");

        // Method - 1
            Supplier<String> supplier = new SupplierImpl();
            System.out.println(
              students.stream()
                    .filter(x -> x.startsWith("z"))
                    .findAny()
                    .orElseGet(supplier)
            );

        // Method - 2

            Supplier<String> supplier1 = () -> "No names method 2";
            System.out.println(
                    students.stream()
                            .filter(x -> x.startsWith("z"))
                            .findAny()
                            .orElseGet(supplier1)
            );

    }
}
