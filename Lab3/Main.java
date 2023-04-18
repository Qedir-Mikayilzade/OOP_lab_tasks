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

            System.out.println("Numbers higher than 50, smaller than 100 and even:");

            // iterate through numbers and check if each number meets the criteria
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 50 && numbers[i] < 100 && numbers[i] % 2 == 0) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
