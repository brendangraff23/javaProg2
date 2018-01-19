//Input a random integer; output will sum digits together

import java.util.Scanner;

public class IntegerAdder
{
    public static void main(String[] args)
    {
        System.out.println("Input a random integer; output will add the digits together");
        final Scanner SCANNER = new Scanner(System.in);
        String userInput = SCANNER.nextLine();

        int total = 0;

        for(int i = 0; i < userInput.length(); i++)
        {
            final char CHARACTER = userInput.charAt(i);
            total += Integer.parseInt(Character.toString(CHARACTER));
        }
        System.out.println(total);
    }
}
