//This program takes two inputs and outputs them added, subtracted, multiplied, divided, and modulus
import java.util.Scanner;

public class TwoInputManyOutputs
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me number 1");

        final float number1 = scanner.nextFloat();

        System.out.println("Give me number 2");
        final float number2 = scanner.nextFloat();

        final String str1 = Float.toString(number1);
        final String str2 = Float.toString(number2);

        System.out.println(str1 + " + " + str2 + " = " + (number1 + number2));
        System.out.println(str1 + " - " + str2 + " = " + (number1 - number2));
        System.out.println(str1 + " * " + str2 + " = " + (number1 * number2));
        System.out.println(str1 + " / " + str2 + " = " + (number1 / number2));
        System.out.println(str1 + "(modulus) % " + str2 + " = " + (number1 % number2));

        System.out.println(str1 + " squared = " + (number1*number1));
        System.out.println(str2 + " squared = " + (number2*number2));

    }

}
