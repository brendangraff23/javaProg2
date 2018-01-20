//Create a diamond pattern like below where you input the number of rows at the midpoint of the diamond (3 in this case):
/*

   *
  ***
 *****
  ***
   *

 */


import java.util.Scanner;

public class DiamondPattern
{
    public static void main(String[] args)
    {
        System.out.print("How many rows of diamond (at midpoint)?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int inCounter = input;
        for(int i = 1; i <= input; i++)
        {

            for(int j = 1; j <= inCounter; j++)
            {
                System.out.print(" ");
            }
            inCounter--;

            for(int k = 1; k <= i*2-1; k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        inCounter+=2;

        for(int i = (input - 1); i >= 1; i--)
        {

            for(int j = 1; j <= inCounter; j++)
            {
                System.out.print(" ");
            }
            inCounter++;

            for(int k = 1; k <= 2*i-1; k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");

        }


    }
}
