package ARRAY;
//The above is written bcoz it is stored in array folder in my windows.
//An Array is used to store multiple values in single variable.
public class Arrays
{
    public static void main(String[] args)
    {
        String[] cars={"SWIFT","INNOVA","ALTO","SAFARI","THAR","FORTUNER","HARRIER"};
        //We cannot add integer numbers in the array because it is declared as an string type only!
        System.out.println("First element in the array:"+cars[0]);
        //We can change the values of the array elements.
        cars[0]="JIMNY";
        System.out.println("Value of 1st element after changing:"+cars[0]);
        
    }
}