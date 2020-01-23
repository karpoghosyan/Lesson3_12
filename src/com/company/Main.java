package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + "  ");
        }
        System.out.println();
        Collections.swap(numbers, 1, 3);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + "  ");
        }
    }
}
