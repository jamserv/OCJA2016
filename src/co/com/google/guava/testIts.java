/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.google.guava;

import com.google.common.base.Preconditions;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author erlang
 */
public class testIts {

    public static final String ERROR_ILEGAL_ARGUMENT = "El valor ingresado no es valido.";
    public static final String ERROR_ILEGAL_ARGUMENT_BYZERO = "El valor debe ser positivo.";

    public static void main(String[] args) {
//        Map<Integer, String> map = Maps.newHashMap();
//        validate(3);
//            notNull("");

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(15);
        numbers.add(51);
        numbers.add(53);
        numbers.add(35);
        numbers.add(45);
        numbers.add(32);
        numbers.add(43);
        numbers.add(16);

        Ordering ordering = Ordering.natural();
        System.out.println("Input List: ");
        System.out.println(numbers);

        Collections.sort(numbers, ordering);
        System.out.println("Sorted List: ");
        System.out.println(numbers);

        System.out.println("======================");
        System.out.println("List is sorted: " + ordering.isOrdered(numbers));
        System.out.println("Minimum: " + ordering.min(numbers));
        System.out.println("Maximum: " + ordering.max(numbers));

        Collections.sort(numbers, ordering.reverse());
        System.out.println("Reverse: " + numbers);

        numbers.add(null);
        System.out.println("Null added to Sorted List: ");
        System.out.println(numbers);

        Collections.sort(numbers, ordering.nullsFirst());
        System.out.println("Null first Sorted List: ");
        System.out.println(numbers);
        System.out.println("======================");

        List<String> names = new ArrayList<>();

        names.add("Ram");
        names.add("Shyam");
        names.add("Mohan");
        names.add("Sohan");
        names.add("Ramesh");
        names.add("Suresh");
        names.add("Naresh");
        names.add("Mahesh");
        names.add(null);
        names.add("Vikas");
        names.add("Deepak");

        System.out.println("Another List: ");
        System.out.println(names);

        Collections.sort(names, ordering.nullsFirst().reverse());
        System.out.println("Null first then reverse sorted list: ");
        System.out.println(names);
    }

    /**
     *
     * @param a
     * @throws IllegalArgumentException
     */
    private static void validate(Integer a) throws IllegalArgumentException {
        try {
            Preconditions.checkArgument(a >= 5, ERROR_ILEGAL_ARGUMENT, a);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    /**
     *
     * @param a
     * @return
     * @throws IllegalArgumentException
     */
    private static void notNull(String value) throws java.lang.NullPointerException {
        Preconditions.checkArgument(value == null, ERROR_ILEGAL_ARGUMENT_BYZERO, value);
    }
}
