import java.util.Scanner;

/**
 * Created by Momchil on 18-Mar-16.
 */
public class Problem8_GetAverage {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        System.out.println(String.format("%s", FindAvg(a,b,c)));

    }

    private static String FindAvg(double x, double y, double z){

        return Double.toString((x+y+z)/3);
    }
}
