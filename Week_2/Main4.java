import java.util.Scanner;

public class Main4 {
    public int greatestNumber(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public double averageNumber(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;
        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values you want to input: ");
        int numValues = scanner.nextInt();
        int[] values = new int[numValues];
        for (int i = 0; i < numValues; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }
        Main4 m3 = new Main4();
        double average = m3.averageNumber(values);
        int largest = m3.greatestNumber(values);
        
        System.out.println("Average: " + average);
        System.out.println("Largest value: " + largest);

        scanner.close();
    }
}
