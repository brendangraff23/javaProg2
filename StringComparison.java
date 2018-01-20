
import java.util.Scanner;

public class StringComparison
{
    public static void main(String[] args) {
        System.out.println("Input first string: ");
        Scanner scanner = new Scanner(System.in);
        String in1 = scanner.nextLine();
        String in1Up = in1.toUpperCase();

        System.out.println("Input second sentence to compare to first: ");
        String in2 = scanner.nextLine();
        String in2Up = in2.toUpperCase();

        if(in1.equals(in2))
        {
            System.out.println("Sentences are identical");
        } else if(in1Up.equals(in2Up))
        {
            System.out.println("Sentences are lexicographically identical, except for case differences");
        } else
        {
            System.out.println("Sentences are different");
        }


    }
}
