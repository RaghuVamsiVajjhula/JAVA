package ARRAY;
import java.util.Scanner;
//The above is written bcoz it is stored in array folder in my windows.


public class USERINPUTARRAY {
    public static void main(String[] args)
    {
        //An array is used to store multiple values inside a single variable.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store:");
        int a=sc.nextInt();
        //IMPORTANT to mention sc.nextline()..
        //used to consume the newline character ('\n') that is left in the input buffer 
        sc.nextLine();
        
        String[] cars=new String[a];

        // cars[0]="Swift";
        // cars[1]="Jimny";
        // cars[2]="Breeza";
        for(int i=0;i<cars.length;i++)
        {
            System.out.println("Enter the name of the car:");
            cars[i]=sc.nextLine();
        }

        // System.out.println("The length of the cars array is:"+cars.length);
        System.out.println("The names of the cars which are stored in an array are:");
        for(int i=0;i<cars.length;i++)
        {
            System.out.println(cars[i]);
        }
    }
    
}
