//Create a numbered right triangle the length of the specified user input

import java.util.Scanner;

public class NumberTriangle2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for(int i = 1; i <= input; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println("\n");

        }
    }

}
