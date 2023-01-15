import java.util.Scanner;

/*
    https://acm.timus.ru/problem.aspx?space=1&num=1881
 */
public class LongCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0, size = 0, list = 1, row = 1;
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int n = scanner.nextInt();
        String s = "";

        for (int i = 0; i < n; i++) {
            s = scanner.next();
            size += s.length();
            if (size == w) {
                row++;
                size = 0;
            } else if (size > w) {
                row++;
                size = s.length() + 1;
            } else
                size++;
        }
        if (size == 0) row--;
        System.out.println((int) Math.ceil(row * 1. / h));
    }
}