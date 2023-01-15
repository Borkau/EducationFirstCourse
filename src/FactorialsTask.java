import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1083
 */
public class FactorialsTask {
    public static void main(String[] args) {
        long n, d = 1;
        String s;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        s = scanner.next();
        int len = s.length();
        while (n > 0) {
            d *= n;
            n -= len;
        }
        System.out.print(d);
    }
}