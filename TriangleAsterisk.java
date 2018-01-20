/*
Generate *'s triangle below

Test Data
Input the number: 6
Expected Output :

******
 *****
  ****
   ***
    **
     *
 */

import java.util.Scanner;

public class TriangleAsterisk
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int counter = 0;

        for(int i = in; i > 0; i--)
        {

            for(int j = 1; j <= counter; j++)
            {
                System.out.print(" ");
            }
            counter++;

            for(int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            
            System.out.println();


        }


    }
}
