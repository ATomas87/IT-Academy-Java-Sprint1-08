package n1exercici7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Julio", "Ana", "En un lugar de La Mancha...", "María", "octubre", "Guzmán", "septiembre", "Olga", "Samsung"));

        //strings.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
        strings.sort(Comparator.comparingInt(String::length).reversed());
        strings.forEach(System.out::println);
    }
}
