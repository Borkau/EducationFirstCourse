import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=2012
 */
public class GrishaTask {
    private final static double COUNT_TASKS_FOR_FOUR_HOUR = 5.33; // 4/0.75

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count tasks");
        boolean isGrishaCan = false;

        if (scanner.hasNextInt()) {
            int lastTasks = 12 - scanner.nextInt();
            isGrishaCan = lastTasks <= COUNT_TASKS_FOR_FOUR_HOUR;
        }
        System.out.println(isGrishaCan ? "YES" : "NO");
    }
}
