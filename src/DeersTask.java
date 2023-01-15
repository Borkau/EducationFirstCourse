import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1740
 */
public class DeersTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int h = scanner.nextInt();
        int d = 0;
        float max = 0, min;

        while (k > d) {
            d += l;
            max += h;
        }
        min = (k / l) * h;
        System.out.printf("%.5f", min);
        System.out.print(" ");
        System.out.printf("%.5f", max);
    }
}
