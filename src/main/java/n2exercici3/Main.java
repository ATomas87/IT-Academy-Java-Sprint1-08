package n2exercici3;

public class Main {
    public static void main(String[] args) {
        Operator operatorSum = (n1, n2) -> n1 + n2;

        Operator operatorSub = (n1, n2) -> n1 - n2;

        Operator operatorMul = (n1, n2) -> n1 * n2;

        Operator operatorDiv = (n1, n2) -> n1 / n2;

        System.out.println(operatorSum.operation(2,5));
        System.out.println(operatorSub.operation(2,5));
        System.out.println(operatorMul.operation(2,5));
        System.out.println(operatorDiv.operation(2,5));
    }
}
