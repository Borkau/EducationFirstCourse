import java.util.ArrayList;
import java.util.Scanner;
/*
https://acm.timus.ru/problem.aspx?space=1&num=1293
*/
public class EnyaTask {
    public static void main(String [] args) {

        ArrayList<Long> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");

        int prod = 1;

        for (int i = 0; i < 3; i++)
        {
            if (scanner.hasNextInt())
                prod *= scanner.nextInt();
            else {
                System.out.println("Ha-ha! Wrong number");
                return;
            }
        }
        System.out.println(prod);
    }
}
