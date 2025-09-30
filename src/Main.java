import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of integers");
        int numbers = scanner.nextInt();

        Array_laba array = new Array_laba(numbers);
        array.display();
        array.evenOrOdd();
    }
}