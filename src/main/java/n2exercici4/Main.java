package n2exercici4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(
                List.of("1231", "Julio", "Ana", "En un lugar de La Mancha...", "Xilófono", "María", "octubre", "6432342131", "Guzmán", "septiembre", "Olga", "Samsung")
        );

        //Alfabéticamente por el primer carácter
        strings.stream().sorted((s1, s2) -> Character.compare(s1.charAt(0), s2.charAt(0))).forEach(System.out::println);
        System.out.println();
        //Primero las que contienen la letra 'e'
        strings.stream().sorted(Comparator.comparing(s -> !s.contains("e"))).forEach(System.out::println);
        System.out.println();
        //Cambiar la letra 'a' por un '4'
        strings.stream().map(s -> s.contains("a") ? s.replace("a", "4") : s).forEach(System.out::println);
        System.out.println();
        //Mostrar sólo elementos numéricos
        strings.stream().filter(s -> s.matches("\\d+")).forEach(System.out::println);
    }
}
