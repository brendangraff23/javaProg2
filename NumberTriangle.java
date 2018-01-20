//The goal of this program: print out a number right triangle the length of the numbers shown;
//however, a much more straightforward manner of acheiving the same objective can be found in 'NumberTriangle2.java'

import java.util.Scanner;

public class NumberTriangle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        StringBuilder numSb = new StringBuilder();

        for(int i = 0; i < userInput; i++)
        {
           int numOut = i+1;
           String numHolder = Integer.toString(numOut);
           numSb.append(numHolder);
           System.out.println(numSb);
        }

    }

}
