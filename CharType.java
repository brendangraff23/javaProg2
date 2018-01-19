import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 4 types:
// letter / space / number / other

public class CharType
{
    public static void main(String[] args)
    {
        System.out.println("Write a random bunch of numbers, letters, spaces: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> numbers = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        List<Character> spaces = new ArrayList<>();
        List<Character> other = new ArrayList<>();

        for(int i = 0; i < input.length(); i++)
        {
            final char character = input.charAt(i);
            if(Character.isDigit(character))
            {
                numbers.add(character);
            } else if (Character.isAlphabetic(character))
            {
                letters.add(character);
            } else if(character == ' ')
            {
                spaces.add(character);
            } else
            {
                other.add(character);
            }
        }

        System.out.println("Number count: " + numbers.size());
        System.out.println("Letter count: " + letters.size());
        System.out.println("Spaces count: " + spaces.size());
        System.out.println("Other count: " + other.size());



    }

}
