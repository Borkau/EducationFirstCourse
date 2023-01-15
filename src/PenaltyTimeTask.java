import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1636
 */
public class PenaltyTimeTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        for (int i = 0; i < 10; i++) {
            int d = scanner.nextInt();
            s += 20 * d;
        }
        if (a <= b - s) System.out.println("No chance.");
        else
            System.out.println("Dirty debug :(");
    }
}
