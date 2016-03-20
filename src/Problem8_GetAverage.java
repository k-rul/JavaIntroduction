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

        System.out.println(String.format("%.2f", FindAvg(a,b,c)));

    }

    private static double FindAvg(double x, double y, double z){

        return (x+y+z)/3;
    }
}
