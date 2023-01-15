import java.io.PrintWriter;
import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1180
 */
public class StoneGamesTask {
    public static void main(String[] args) {
        long result = 0;
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        String s = scanner.next();
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(i) - '0';
        }
        if (result % 3 == 0) {
            writer.println(2);
        } else {
            writer.println(1);
            writer.println(result % 3);
        }
        writer.flush();
    }
}
