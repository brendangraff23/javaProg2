/*
Write a Java program to get the character at the given index within the String
 */

import java.util.Scanner;

public class characterIndex
{
    public static void main(String[] args) {
        System.out.println("Input any string: ");
        Scanner scanner = new Scanner(System.in);
        String in1 = scanner.nextLine();

        System.out.println("Input character index you seek: ");
        int in2 = scanner.nextInt();

        System.out.println(in1.charAt(in2));
    }
}
