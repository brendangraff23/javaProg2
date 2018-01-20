/*
 Write a Java program to display the number rhombus structure.
Input the number: 7
Expected Output :


      1
     212
    32123
   4321234
  543212345
 65432123456
7654321234567
 65432123456
  543212345
   4321234
    32123
     212
      1
 */

import java.util.Scanner;

public class DiamondNumbers
{
    public static void main(String[] args)
    {
        System.out.println("Input the number of rows to the midpoint of the diamond/number pattern?");
        Scanner scanner = new Scanner(System.in);
        final int in = scanner.nextInt();
        int counter = in;

        for(int i = 1; i <= in; i++)
        {

            for(int j = 1; j<=counter; j++)
            {
                System.out.print(" ");
            }
            counter--;

            for(int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }

            for(int l = i-1; l > 0; l--)
            {
                System.out.print(l);
            }
            System.out.println();

        }
        counter += 2;
        for(int i = in-1; i >= 1; i--)
        {

            for(int j = 1; j<=counter; j++)
            {
                System.out.print(" ");
            }
            counter++;

            for(int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }

            for(int l = i-1; l > 0; l--)
            {
                System.out.print(l);
            }
            System.out.println();

        }
    }
}
