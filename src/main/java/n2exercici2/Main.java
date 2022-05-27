package n2exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 3, 4, 5, 12, 65, 8, 31, 83, 19, 24, 76));
        String integersClassificated = integers.stream().map(integer -> integer % 2 == 0 ? "e" + integer : "o" + integer).collect(Collectors.joining(", "));

        System.out.println(integersClassificated);
    }
}
