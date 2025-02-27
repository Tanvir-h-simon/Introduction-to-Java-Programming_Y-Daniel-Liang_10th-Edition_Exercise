import java.util.Scanner;

public class C04Q01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double r = scan.nextDouble(); // r = radius

        double s = 2 * r * Math.sin(Math.PI * 1 / 5);
        double area = (5 * (Math.pow(s, 2))) / (4 * Math.tan(Math.PI * 1 / 5));

        System.out.printf("The area of the pentagon is %.2f", area);
    }
}
