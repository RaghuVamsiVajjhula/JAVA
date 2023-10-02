public class SwitchStatement 
{
    public static void main(String[] args)
    {
         //Switch is a statement that allows to test a variable value.
         //When you're using more number if-else if statements it would be efficient when you use a switch statement.
        String day="Mondaysss";
        //There is default block which consists of instruction which should execute when there is no case satisfied with user input.

        switch(day)
        {
            case "Sunday":  System.out.println("Hi Sunday");
            break;
            case "Monday":  System.out.println("Hi Monday");
            break;
            case "Wednesday": System.out.println("Hi Wednesday");
            break;
            case "Thursday": System.out.println("Hi Thursday");
            break;
            case "Friday": System.out.println("Hi Friday");
            break;
            case "Saturday": System.out.println("Hi Saturday");
            break;
            default: System.out.println("Invalid Day Entered.....");
        }
    }
    
}
