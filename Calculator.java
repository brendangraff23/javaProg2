//This is a simple, left-to-right calculator.  It ignores the order of operations


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {

        final Scanner scanner = new Scanner(System.in);
        final String userInput = scanner.nextLine().replace(" ", "");

        StringBuilder numberSb = new StringBuilder();
        final List<Float> numbers = new ArrayList<>();
        final List<Character> operators = new ArrayList<>();

        for (int i = 0; i < userInput.length(); i++)
        {
            final char character = userInput.charAt(i);
            if (Character.isDigit(character))
            {
                numberSb.append(character);
            }
            else
            {
                numbers.add(Float.parseFloat(numberSb.toString()));
                operators.add(character);
                numberSb = new StringBuilder();
            }
        }

        // add trailing number
        numbers.add(Float.parseFloat(numberSb.toString()));

        float total = 0;
        for (int i = 0; i < numbers.size() - 1; i++)
        {
            float number1 = i == 0 ? numbers.get(i) : total;
            float number2 = numbers.get(i + 1);

            char operator = operators.get(i);
            switch(operator)
            {
                case '+':
                    total = number1 + number2;
                    break;
                case '-':
                    total = number1 - number2;
                    break;
                case '/':
                    total = number1 / number2;
                    break;
                case '*':
                    total = number1 * number2;
                    break;
            }
        }

        System.out.println(total);
    }
}
