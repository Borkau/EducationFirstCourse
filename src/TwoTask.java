import java.util.ArrayList;
import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1001
 */
public class TwoTask {
    public static void main(String [] args) {

        ArrayList<Long> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong()) {
            list.add(scanner.nextLong());
        }
        scanner.close();

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.printf("%.4f%n", Math.sqrt(list.get(i)));
        }
    }
}
