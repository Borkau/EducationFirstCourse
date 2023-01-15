import java.util.Scanner;

/*
    https://acm.timus.ru/problem.aspx?space=1&num=1110
 */
public class DegreeTask {

    public static void main(String[] args) {
        int n, m, y;
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        y = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            if (degree(i, n, m) == y) {
                System.out.print(i + " ");
                b = false;
            }
        }
        if (b) System.out.print(-1);
    }

    public static int degree(int x, int n, int m) {
        int res = 1;
        while (n > 0) {
            if (n % 2 == 1) res = (res * x) % m;
            x = (x * x) % m;
            n >>= 1;
        }
        return res;
    }
}
