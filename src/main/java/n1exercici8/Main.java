package n1exercici8;

public class Main {
    public static void main(String[] args) {
        Reverser reverser = s -> {
            String newString = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                newString += s.charAt(i);
            }
            return newString;
        };

        System.out.println(reverser.reversed("Hola a todos"));
    }
}
