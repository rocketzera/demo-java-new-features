package io.github.rocketzera.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Ruby", "PHP");

        // Antes do Java 8
        Comparator<String> comparador = new Comparator<>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        Collections.sort(palavras, comparador);

        System.out.println(palavras);


        // Depois do Java 8
        List<String> palavras2 = Arrays.asList("Java", "Ruby", "PHP");

        Comparator<String> comparador2 = Comparator.comparingInt(String::length);

        palavras2.sort(comparador2);

        System.out.println(palavras2);
    }
}
