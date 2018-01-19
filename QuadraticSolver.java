//Solves the quadratic equation with inputs (will only solve if it crosses the 'x' axis; otherwise will return NAN)

import java.util.Scanner;

public class QuadraticSolver
{
    public static void main(String[] args)
    {
        System.out.println("Input 'A' ");

        Scanner scanner = new Scanner(System.in);
        Double A = scanner.nextDouble();

        System.out.println("Input 'B' ");
        Double B = scanner.nextDouble();

        System.out.println("Input 'C' ");
        Double C = scanner.nextDouble();

        Double output1 = (-B + (Math.sqrt(B*B-4*A*C)))/(2*A);
        Double output2 = (-B - (Math.sqrt(B*B-4*A*C)))/(2*A);

        System.out.println("x = " + output1);
        System.out.println("x = " + output2);
    }
}
