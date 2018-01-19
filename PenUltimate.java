// Prints out second-to-last word in inputted sentence
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PenUltimate
{
    public static void main(String[] args)
    {
        System.out.println("Write a sentence, any sentence, and see the second to last word printed out:");
        final Scanner SCANNER = new Scanner(System.in);
        final String userInput = SCANNER.nextLine();
        StringBuilder strBuild = new StringBuilder();
        List<String> arrayString = new ArrayList<>();

        for(int i = 0; i < userInput.length(); i++)
        {
            final char CHARACTER = userInput.charAt(i);
            if(CHARACTER != (' '))
            {
                strBuild.append(CHARACTER);
            } else
            {
                arrayString.add(strBuild.toString());
                strBuild = new StringBuilder();
            }
        }

        //add trailing word
        arrayString.add(strBuild.toString());
        System.out.println("Broken down array List: " + arrayString);
        final int secondToLast = arrayString.size() - 2;
        System.out.println("Second to last word is: " + arrayString.get(secondToLast));

    }

}
