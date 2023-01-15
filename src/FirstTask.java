import java.util.Arrays;
import java.util.Scanner;

public class FirstTask {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers for summing");
        double[] numbers = new double[2];
        for (int i = 0; i < numbers.length; i++) {
            if (scanner.hasNextDouble())
                numbers[i] = scanner.nextDouble();
        }

        if (numbers.length > 1) {
            System.out.println(Arrays.stream(numbers).sum());
        }
        scanner.close();
    }
}
