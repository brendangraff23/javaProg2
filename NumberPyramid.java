/*
make such a pattern like a pyramid with a number which will repeat the number in the same row up to 10.

       1
      2 2
     3 3 3
    4 4 4 4

 */
import java.util.Scanner;

public class NumberPyramid
{
    public static void main(String[] args)
    {
        System.out.print("Input number:");
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

            for(int k = 1; k <= i; k++)
            {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
}
