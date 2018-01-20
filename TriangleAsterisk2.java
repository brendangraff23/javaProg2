/*
Write a java program to generate a following @'s triangle.

      *
     **
    ***
   ****
 */

import java.util.Scanner;

public class TriangleAsterisk2
{
    public static void main(String[] args)
    {
        System.out.println("Input number of rows:");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int counter = in;

        for(int i = 1; i <= in; i++)
        {
            for(int j = 1; j <= counter; j++)
            {
                System.out.print(" ");
            }
            counter--;

            for(int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
