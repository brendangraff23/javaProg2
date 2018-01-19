//Reverses a string
import java.util.Scanner;

public class StringReversal
{

    public static void main(String[] args)
    {
        System.out.println("Write anything and string will be reversed:");
        final Scanner SCANNER = new Scanner(System.in);
        String userInput = SCANNER.nextLine();

        for(int i = userInput.length() - 1; i >= 0; i--)
        {
            final char CHARACTER = userInput.charAt(i);
            System.out.print(CHARACTER);
        }
    }
}
