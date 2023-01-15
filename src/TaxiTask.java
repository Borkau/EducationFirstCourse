import java.util.Scanner;

/*
    https://acm.timus.ru/problem.aspx?space=1&num=1607
 */
public class TaxiTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a, b, x, y = 0;
        a = in.nextLong();
        x = in.nextLong();
        b = in.nextLong();
        y = in.nextLong();
        if (a >= b) {
            System.out.println(a);
            return;
        }
        while (a <= b) {
            if (a + x >= b) {
                System.out.println(b);
                return;
            }
            a += x;
            b -= y;
        }
        System.out.println(a);
    }
}