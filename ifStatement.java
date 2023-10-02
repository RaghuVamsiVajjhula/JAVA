public class ifStatement 
{
    public static void main(String[] args)
    {
        int i=18;
        if(i>=18)
        {
            System.out.println("You are an adult");
        }   
        else if(i>=75)//Here we get an output of you are an adult
        //When i=18 and it satisfies if and else if condition here.
        // So it executes the if block and as it satisfies else if is ignored.  
        {
            System.out.println("You are old!");
        }
        else
        {
            System.out.println("You are not an adult");
        }
    }
    
    
}
