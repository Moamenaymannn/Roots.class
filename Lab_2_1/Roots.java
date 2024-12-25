import java.util.function.BiFunction;
import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
   
        BiFunction<Double, Double, Double> discriminant = (b, c) -> (b * b - 4 * 1 * c);

        
        BiFunction<Double, Double, String> solveQuadratic = (b, c) -> {
            double disc = discriminant.apply(b, c);

            if (disc > 0) {
                double root1 = (-b + Math.sqrt(disc)) / (2 * 1);
                double root2 = (-b - Math.sqrt(disc)) / (2 * 1);
                return "Roots are: " + root1 + " and " + root2;
            } else if (disc == 0) {
                double root = -b / (2 * 1);
                return "Root is: " + root;
            } else {
                return "No real roots (Discriminant is negative)";
            }
        };

       System.out.println("Enter Value : b =\t");
        double b = in.nextInt();
       System.out.println("Enter Value : c =\t");
        double c = in.nextInt();
        String result = solveQuadratic.apply(b, c);

        
        System.out.println(result);
    }
}

