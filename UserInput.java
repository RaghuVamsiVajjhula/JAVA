import java.util.Scanner;
//Here scanner consists of components which can store values which are obtained from user.



public class UserInput 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);      
        
        //Here the string name can only take an string value.

        System.out.println("Enter your name:");
        String name=scanner.nextLine();

        //Here the int age can only take an integer value.

        System.out.println("Enter your age:");
        int age=scanner.nextInt();
        
        System.out.println("Hello"+name);
        System.out.println("You are "+age+"years old");

    }
    
}
