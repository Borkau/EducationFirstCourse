import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1079
 */
public class MaximumTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n != 0) {
                maxValue(n);
            } else {
                System.exit(0);
            }
        }
    }

    private static void maxValue(int c) {
        long a[] = new long[c + 1], max = 0;
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= c; i++) {
            if (i % 2 == 0) {
                a[i] = a[i / 2];
            } else {
                a[i] = a[i / 2] + a[i / 2 + 1];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        if (c == 1) {
            System.out.println(1);
        } else
            System.out.println(max);
    }
}
