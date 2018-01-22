//input numbers (+ or -) separated by space; output the maximum value of numbers set

import java.util.Scanner;

public class MaximumValue
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers with a space in between and output will be the max and min values");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        int number2 = 0;
        for(int i = 0; i < numbers.length - 1; i++)
        {
            int number1 = Integer.parseInt(numbers[i]);
            number2 = Integer.parseInt(numbers[i + 1]);

            if(number1 > number2)
            {
                number2 = number1;
            }
        }

        System.out.println("greatest = " + number2);

    }

}
