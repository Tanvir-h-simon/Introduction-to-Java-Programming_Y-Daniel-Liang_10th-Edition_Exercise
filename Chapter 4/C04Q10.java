import java.util.Scanner;

public class C04Q10 {
    public static void main(String[] args) {
        String set1 =
                " 1  3  5  7\n" +
                        " 9 11 13 15\n" +
                        "17 19 21 23\n" +
                        "25 27 29 31";

        String set2 =
                " 2  3  6  7\n" +
                        "10 11 14 15\n" +
                        "18 19 22 23\n" +
                        "26 27 30 31";

        String set3 =
                " 4  5  6  7\n" +
                        "12 13 14 15\n" +
                        "20 21 22 23\n" +
                        "28 29 30 31";

        String set4 =
                " 8  9 10 11\n" +
                        "12 13 14 15\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        String set5 =
                "16 17 18 19\n" +
                        "20 21 22 23\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        int day = 0;

        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Set 1
        System.out.print("Is your birthday in Set1?\n");
        System.out.print(set1);
        System.out.print("\nEnter Y for Yes and N for No: ");
        char answer = input.nextLine().toUpperCase().charAt(0);
        if (answer == 'Y') {
            day += 1;
        }

        // Set 2
        System.out.print("\nIs your birthday in Set2?\n");
        System.out.print(set2);
        System.out.print("\nEnter Y for Yes and N for No: ");
        answer = input.nextLine().toUpperCase().charAt(0);
        if (answer == 'Y') {
            day += 2;
        }

        // Set 3
        System.out.print("\nIs your birthday in Set3?\n");
        System.out.print(set3);
        System.out.print("\nEnter Y for Yes and N for No: ");
        answer = input.nextLine().toUpperCase().charAt(0);
        if (answer == 'Y') {
            day += 4;
        }

        // Set 4
        System.out.print("\nIs your birthday in Set4?\n");
        System.out.print(set4);
        System.out.print("\nEnter Y for Yes and N for No: ");
        answer = input.nextLine().toUpperCase().charAt(0);
        if (answer == 'Y') {
            day += 8;
        }

        // Set 5
        System.out.print("\nIs your birthday in Set5?\n");
        System.out.print(set5);
        System.out.print("\nEnter Y for Yes and N for No: ");
        answer = input.nextLine().toUpperCase().charAt(0);
        if (answer == 'Y') {
            day += 16;
        }

        // Display birthday
        System.out.println("\nYour birthday is " + day + "!");
    }
}
