import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=2035
 */
public class TestTourTask {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();
        if (a + b < c) {
            System.out.println("Impossible");
            return;
        }
        if (a == 0 && b == 0 || a == b && a == c) {
            System.out.println(0 + " " + 0);
            return;
        }
        if (Math.max(a, b) < c) {
            if (a < b)
                System.out.println((c - Math.max(a, b)) + " " + Math.max(a, b));
            else {
                System.out.println((c - b) + " " + b);
            }
        }
        if (Math.max(a, b) >= c) {
            if (a > c && b > c) {
                System.out.println(0 + " " + c);
            } else if (a > c && b <= c)
                System.out.println(c + " " + 0);
            else if (a < b && b >= c) {
                System.out.println(a + " " + (c - a));
            }
        }
    }
}
