package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Julio", "Ana", "Antonio", "María", "José", "Guzmán", "Eladio", "Olga", "Mario"));
        List<String> stringsWithO = strings.stream().filter(s -> s.contains("o")).toList();

        stringsWithO.forEach(System.out::println);
    }
}
