import java.util.Scanner;

/*
    https://acm.timus.ru/problem.aspx?space=1&num=1925
 */
public class BritainScientist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        int t1 = 0, t2 = 0, a, b, s = 0;

        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            t1 += a;
            t2 += b;
        }
        s = t1 - t2 + k - 2 * (n + 1);

        if (s >= 0)
            System.out.println(s);
        else
            System.out.println("Big Bang!");
    }
}
