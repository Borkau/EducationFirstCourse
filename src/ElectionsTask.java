import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1263
 */
public class ElectionsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int a[] = new int[m + 1];
        int b[] = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a[i] == j) b[j]++;
            }
        }
        for (int j = 1; j <= n; j++) {
            b[j] *= 100;
            System.out.printf("%.2f", b[j] * 1. / m);
            System.out.println("%");
        }
    }
}
