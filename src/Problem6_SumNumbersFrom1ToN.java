import java.util.Scanner;

/**
 * Created by Momchil on 17-Mar-16.
 */
public class Problem6_SumNumbersFrom1ToN {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
