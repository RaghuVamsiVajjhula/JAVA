public class Expressions
{
    public static void main(String[] args)
    {
        //Expressions = operands and operators
        //operands=values,numbers,quantity
        //operators= + - * / %

        int friends=10;
        
        friends=friends+1;
        System.out.println("After incrementing value of friends by 1:");
        System.out.println(friends);

        // Modulus % gives us the remainder of the operation
        //10%3 when we performed it gives us ouput of 1.
         
        //Also we can increment value of i by i++;
        System.out.println("We can store the value of an operation in another data type:");
        double a =10;
        a=(double)friends/3;
        System.out.println(a);

    }
    
}
