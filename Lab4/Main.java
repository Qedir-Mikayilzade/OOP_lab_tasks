import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] numbers = new int[10];
            System.out.println("Enter 10 numbers:");

            // read input numbers from user
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = input.nextInt();
            }

            System.out.println("Numbers that can't be divided by 3:");

            // iterate through numbers and check if each number can't be divided by 3
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 3 != 0) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
