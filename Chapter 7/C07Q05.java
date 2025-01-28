import java.util.Scanner;

public class C07Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int[] numbers = new int[10];
        int[] distinctNumbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            boolean isDistinct = true;

            // Check if the number is already in distinctNumbers
            for (int j = 0; j < count; j++) {
                if (numbers[i] == distinctNumbers[j]) {
                    isDistinct = false;
                    break; // Exit the loop
                }
            }

            if (isDistinct) {
                distinctNumbers[count] = numbers[i];
                count++;
            }
        }

        System.out.println("The number of distinct numbers is: " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(distinctNumbers[i] + " ");
        }
    }
}