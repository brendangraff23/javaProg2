//Gives a random 3-digit number out of number set {1,2,3,4} (random exercise)

public class ThreeDigit
{
    //create a unique three-digit number out of 1,2,3,4
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();


        for(int i = 0; i < 3; i++)
        {

            float randomSb = Math.round(Math.random()*4);
            String randString = Float.toString(randomSb);

            while(sb.toString().contains(randString) || randomSb == 0)
            {
                randomSb = Math.round(Math.random()*4);
                randString = Float.toString(randomSb);
            }

            sb.append(randomSb);
            String newString = sb.toString().replaceAll("[0,.]","");

            if(newString.length()==3)
            {
                System.out.println(newString);
            }

        }



    }

}
