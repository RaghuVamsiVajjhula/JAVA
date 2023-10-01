public class SwapVariables 
{
    public static void main(String[] args)
    {
        String x="Hello";
        String y="World";
        
        System.out.println("Value of x before swapping:"+x);
        System.out.println("Value of y before swapping:"+y);

        // In order to swap 2 values in a variable we need to create another variable.

        String temp;
        temp=x;
        x=y;
        y=temp;

        System.out.println("After swapping:");
        System.out.println("x:"+x);
        System.out.println("y:"+y);

        //This can even be done for integer and other data types.
    }
    
}
