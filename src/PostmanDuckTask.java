import java.util.Scanner;
/*
    https://acm.timus.ru/problem.aspx?space=1&num=2023
 */
public class PostmanDuckTask {
    private static final String names[] = {"Alice", "Ariel", "Aurora", "Phil", "Peter", "Olaf", "Phoebus", "Ralph", "Robin",
            "Bambi", "Belle", "Bolt", "Mulan", "Mowgli", "Mickey", "Silver", "Simba", "Stitch",
            "Dumbo", "Genie", "Jiminy", "Kuzko", "Kida", "Kenai", "Tarzan", "Tiana", "Winnie"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        int old = 1;
        int count = 0;
        int steps = 0;

        for (int i = 0; i < inputCount; i++) {
            String inputName = scanner.next();
            for (int j = 0; j < names.length; j++) {
                if (inputName.equals(names[j])) {
                    steps = Math.abs(j / 9 + 1 - old);
                    if (j / 9 + 1 != old) count += steps;
                    old = j / 9 + 1;
                }
            }
        }
        System.out.println(count);
    }
}
