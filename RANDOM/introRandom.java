package RANDOM;//This is written because i am writing this code in a folder called RANDOM.
import java.util.Random;
public class introRandom
{
    public static void main(String[] args)
    {
        Random random=new Random();
        int x=random.nextInt(6);
        System.out.println("Integer value:"+x);
        //On using the above line we get random numbers from 0 to 6.
        //When we use it to roll a dice. if we get 0 it'll be invalid so..
        //in below code we add +1 after the declaration of the number. and we get the values 1 to the declared number.
        int y=random.nextInt(6)+1;
        System.out.println(y);
        double a=random.nextDouble(y);
        System.out.println("Double value:"+a);

        boolean b=random.nextBoolean();
        System.out.println("Boolean value will be:"+b);

    }
}