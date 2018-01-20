//make such a pattern like right angle triangle with a number which will repeat a number in a row.The pattern is as follows :
//1
//22
//333
//4444

import java.util.Scanner;

public class NumberTriangle3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int counter = 0;

        for(int i = 0; i < in; i++)
        {
            while(counter <= i)
            {
                System.out.print(i+1);
                counter++;
            }
            System.out.println("\n");

            counter = 0;

        }
    }


}
