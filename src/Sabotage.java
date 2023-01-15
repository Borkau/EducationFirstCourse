import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=1290
 */
public class Sabotage {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        Scanner scanner = new Scanner(System.in);
        int nums[] = new int[scanner.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            writer.println(nums[i]);
        }
        writer.close();
    }
}
