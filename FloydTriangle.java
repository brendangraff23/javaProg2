/*
print Floyd's Triangle. Go to the editor

1
01
101
0101
10101

 */
import java.util.Scanner;

public class FloydTriangle
{
    public static void main(String[] args)
    {
        System.out.print("How many row's of Floyd's Triangle would you like?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int k = 0;
        for(int i = 1; i <= input; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                if( k == 1)
                {
                    k = 0;
                } else
                {
                    k = 1;
                }
                System.out.print(k);
            }
            System.out.print("\n");
        }
    }

}
