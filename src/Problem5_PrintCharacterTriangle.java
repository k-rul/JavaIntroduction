import java.util.Scanner;

/**
 * Created by Momchil on 17-Mar-16.
 */
public class Problem5_PrintCharacterTriangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        for (int row = 0 ; row < size; row++) {
            for (char col = 'a'; col < 'a' + row; col++) {
                System.out.print(col);
                if (col < 'a' + row) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int row = size ; row >= 0; row--) {
            for (char col = 'a'; col < 'a' + row; col++) {
                System.out.print(col);
                if (col < 'a' + row) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
