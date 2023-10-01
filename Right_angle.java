import java.util.Scanner;
public class Right_angle 
{
    public static void main(String[] args)
    {
         double c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first side:");
        double a=scanner.nextInt();
        System.out.println("Enter second side:");
        double b=scanner.nextInt();
        System.out.println("The third side will be:");
        c=Math.sqrt((a*a)+(b*b));
        System.out.println(c);

        scanner.close();
    }
}
