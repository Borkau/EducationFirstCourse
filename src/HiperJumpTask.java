import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1296
 */
public class HiperJumpTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), a;
        long count = 0, ans = 0;

        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            count += a;
            if (count < 0)
                count = 0;
            ans = Math.max(count, ans);
        }
        System.out.println(ans);
    }
}