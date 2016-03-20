/**
 * Created by Momchil on 17-Mar-16.
 */
public class Problem4_PrintCharacters {
    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z'; i++) {
        System.out.print(i);
            if (i != 'z') {
                System.out.print(" ");
            }

        }
    }
}
