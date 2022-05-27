package n2exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Carmen", "Ana", "Guillermo", "María", "Felipe", "Francisca", "Eladio", "Luis", "Rebeca"));
        List<String> namesWithLeadingAAnd3Letters = names.stream().filter(s -> s.charAt(0) == 'A').filter(s -> s.length() == 3).toList();

        namesWithLeadingAAnd3Letters.forEach(System.out::println);
    }
}
