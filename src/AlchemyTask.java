import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1573
 */
public class AlchemyTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), n = scanner.nextInt();
        boolean blue = false;
        boolean red = false;
        boolean yellow = false;

        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            if (s.equals("Blue") || s.equals("blue"))
                blue = true;
            if (s.equals("Red") || s.equals("red"))
                red = true;
            if (s.equals("Yellow") || s.equals("yellow"))
                yellow = true;
        }

        long result = 1;

        if (blue) result *= a;
        if (red) result *= b;
        if (yellow) result *= c;

        System.out.println(result);
    }
}