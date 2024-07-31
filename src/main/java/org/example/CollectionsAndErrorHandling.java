package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsAndErrorHandling {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        // Adding integers to the list, including duplicates
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(2);
        integers.add(4);
        integers.add(3);
        integers.add(5);

        Set<Integer> uniqueIntegers = new HashSet<>();
        int sum = 0;
        double average = 0.0;

        try {
            // Removing duplicates using a Set
            uniqueIntegers.addAll(integers);

            // Calculating the sum
            for (Integer num : uniqueIntegers) {
                sum += num;
            }

            // Calculating the average
            if (uniqueIntegers.size() > 0) {
                average = (double) sum / uniqueIntegers.size();
            } else {
                throw new ArithmeticException("Division by zero");
            }

            // Printing the results
            System.out.println("Original list: " + integers);
            System.out.println("List without duplicates: " + uniqueIntegers);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
