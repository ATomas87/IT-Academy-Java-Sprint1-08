package n1exercici6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Julio", "Ana", "En un lugar de La Mancha...", "María", "octubre", "Guzmán", "septiembre", "Olga", "Samsung"));

        strings.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        strings.forEach(System.out::println);
    }
}
