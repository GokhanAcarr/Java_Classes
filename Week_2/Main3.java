import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values you want to input: ");
        int numValues = scanner.nextInt();
        int[] values = new int[numValues];
        for (int i = 0; i < numValues; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }
        double sum = 0;
        int largest = values[0];
        for (int i = 0; i < numValues; i++) {
            sum += values[i];
            if (values[i] > largest) {
                largest = values[i];
            }
        }
        double average = sum / numValues;
        System.out.println("Values entered by the user:");
        for (int i = 0; i < numValues; i++) {
            System.out.println("Value " + (i + 1) + ": " + values[i]);
        }

        System.out.println("Average: " + average);
        System.out.println("Largest value: " + largest);

        scanner.close();
    }
}
