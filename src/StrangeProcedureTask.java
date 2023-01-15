import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1214
 */
public class StrangeProcedureTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong(), b = scanner.nextLong();
        if ((a + b) % 2 == 0 || a <= 0 || b <= 0) System.out.println(a + " " + b);
        else
            System.out.println(b + " " + a);
    }
}
