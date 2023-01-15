import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1370
 */
public class SorcererTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = m; i < m + 10; i++) {
            System.out.print(a[i % n]);
        }
    }
}
