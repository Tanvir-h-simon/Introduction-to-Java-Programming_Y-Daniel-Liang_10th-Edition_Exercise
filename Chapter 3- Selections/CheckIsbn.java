import java.util.Scanner;
public class CheckIsbn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int d1 = scan.nextInt();
        int d2 = scan.nextInt();
        int d3 = scan.nextInt();
        int d4 = scan.nextInt();
        int d5 = scan.nextInt();
        int d6 = scan.nextInt();
        int d7 = scan.nextInt();
        int d8 = scan.nextInt();
        int d9 = scan.nextInt();

        int tenthDigit = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        if (tenthDigit == 10) {
            System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        } else {
            System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + tenthDigit);
        }
    }

}
