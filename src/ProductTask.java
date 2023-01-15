import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1014
 */
public class ProductTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(number(n));
    }

    private static long number(long n) {
        if (n == 0) return 10;
        if (n == 1) return 1;
        long ans = 0, p = 1;
        for (int i = 9; i >= 2; i--) {
            while (n % i == 0) {
                ans += p * i;
                p = p * 10;
                n /= i;
            }
        }
        return n == 1 ? ans : -1;
    }
}
