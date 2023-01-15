import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=2001
 */

public class TwoMathematics {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        int [] firstWeighing = new int[6];

        for (int i = 0; i <= 6; i++) {
            if (scanner.hasNextInt())
                firstWeighing[i] = scanner.nextInt();
        }
        System.out.println((firstWeighing[0] - firstWeighing[4]) + " " + (firstWeighing[1] - firstWeighing[3]));
    }
}
