//Prompt Java program that accepts any integer values and print true if there is a common digit in both numbers.

import java.util.Scanner;

public class SharesADigit
{
    public static void main(String[] args)
    {
        System.out.println("Input first number: ");
        Scanner scanner = new Scanner(System.in);
        final String number1 = scanner.nextLine();

        System.out.println("Input second number: ");
        final String number2 = scanner.nextLine();

        boolean x = false;
        for(int i = 0; i < number1.length(); i++)
        {
            final char character = number1.charAt(i);
            for(int j = 0; j < number2.length(); j++)
            {
                final char character2 = number2.charAt(j);
                if(character == character2)
                {
                    x = true;
                }
            }

        }
        System.out.print(x);
    }



}
