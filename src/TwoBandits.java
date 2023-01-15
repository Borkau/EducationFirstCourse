import java.util.Scanner;

/*
    https://acm.timus.ru/problem.aspx?space=1&num=1409
 */
public class TwoBandits {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        int count = 1;
        int firstBandit = 0;
        int secondBandit = 0;

        if (scanner.hasNextInt()) {
            firstBandit = scanner.nextInt();
            if (scanner.hasNextInt()) {
                secondBandit = scanner.nextInt();
                count = firstBandit + secondBandit - 1;
            }
            else {
                return;
            }
        }
        else {
            return;
        }
        System.out.println((count - firstBandit) + " " + (count - secondBandit));
    }
}
