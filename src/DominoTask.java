import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1502
 */
public class DominoTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long s = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                s += i;
                s += j;
            }
        }
        System.out.println(s);
    }
}
