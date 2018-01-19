//Gives the area of a circle
import java.util.Scanner;

public class CircleArea
{
    public static void main(String[] args)
    {
        System.out.println("Please input the radius of the circle");
        Scanner in = new Scanner(System.in);
        //Area of circle = pi*r*r
        Double userInput = in.nextDouble();
        Double area = userInput*Math.PI;
        //Perimeter of circle = pi*d
        Double peri = userInput*2*Math.PI;

        System.out.println("Area of the circle is: " + area);
        System.out.println("Perimeter of the circle is: " + peri);
    }
}
