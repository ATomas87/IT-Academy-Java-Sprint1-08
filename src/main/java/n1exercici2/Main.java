package n1exercici2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Julio", "Ana", "Antonio", "María", "José", "Guzmán", "Eladio", "Olga", "Mario"));
        List<String> stringsWithO = strings.stream().filter(s -> s.contains("o")).filter(s -> s.length() > 5).toList();

        stringsWithO.forEach(System.out::println);
    }
}
