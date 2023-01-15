import java.util.Scanner;

/*
    https://acm.timus.ru/problem.aspx?space=1&num=1068
*/
public class ThirdTask {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        Integer num = scanner.nextInt();
        if (num < 0)
            num *= -1;
        int sumOfAP = num * (num + 1) / 2; // формула суммы ариф. прогрессии

        System.out.println(sumOfAP);
    }
}
