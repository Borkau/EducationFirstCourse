import java.util.ArrayList;
import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1877
 */
public class CodesTask {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        int firstLock = 0;
        int secondLock = 0;

        if (scanner.hasNextInt())
            firstLock = scanner.nextInt();
        if (scanner.hasNextInt())
            secondLock = scanner.nextInt();

        boolean canOpen = firstLock % 2 == 0 || secondLock % 2 != 0;
        System.out.println(canOpen ? "YES" : "NO");
    }
}
