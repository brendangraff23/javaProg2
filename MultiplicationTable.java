//Gives multiples of a number 20x

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        System.out.println("Please input number. Output will give you a multiplication table up to 20");

        Scanner in = new Scanner(System.in);
        float inputNum = in.nextFloat();


        for(int i = 0; i < 21; i++)
        {
            System.out.println(inputNum*i);
        }




    }


}
