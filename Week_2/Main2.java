import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Please Enter second number: ");
        int number2 = input.nextInt();
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        number1++;
        while (number1 < number2) {
            if (number1 % 2 == 1) {
                System.out.println(number1);
            }
            number1++;
        }
    }
}
