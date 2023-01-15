import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1902
 */
public class NeoVeniceTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        double s = scanner.nextDouble();

        for (int i = 0; i < n; i++) {
            System.out.printf("%.6f", s + (scanner.nextInt() - s + t) / 2);
            System.out.println();
        }
    }
}
