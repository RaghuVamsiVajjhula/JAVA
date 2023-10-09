public class StringMethods 
{
    public static void main(String[] args)
    {
         //String is a reference data type that can store one or more characters.
         String name="Vamsi";

        //There are n number of methods.We will be discussing only the most important.

         //In order to check whearher the values of string is same as another string we use equals.
         boolean value1=name.equals("Vamsi");
         System.out.println(value1);
         boolean value2=name.equals("Raghu");
         System.out.println(value2);

         //In order to know length of a string we can use length.
        int result=name.length();
        System.out.println("The length of the string given is:"+result);

        //we also can use char in order to find the values at a particular point using charat().

        char a=name.charAt(0);
        System.out.println("The value of character present at index number 0 is:"+a);

        //We can also find the index position by having the value.

        int findvalue=name.indexOf('a');
        System.out.println("The index position of a in string is:"+findvalue);

        //We can check wheather a string is empty or not.
        boolean emptyvalue=name.isEmpty();
        //Returns false if there is some data present in the string.
        System.out.println(emptyvalue);
        //Returns true when we have an empty set.
        String newname="";
        //The above string is an empty set.
        boolean emptyvalue2=newname.isEmpty();
        System.out.println(emptyvalue2);


        //We can change the characters present in lowercase to upper case.
        String newnamevalue=name.toUpperCase();
        System.out.println("The value of Vamsi after converting to Uppercase is:"+newnamevalue);
        //In same way we can do it to lowercase:
        String newnamevalue2=newnamevalue.toLowerCase();
        System.out.println("The value of VAMSI after convertion to lowercase is:"+newnamevalue2);

        //We can also trim the empty space present before and after the string .
        //By using trim.
        String namehere="   MYNAME   ";
        String val=namehere.trim();
        System.out.println("The value before trimmig:"+namehere);
        System.out.println("The value after trimming:"+val);

        //We can also replace the character of one string with another character.

        String newchar="NameIsHere";
        //stringname.replace('Old character','New Character')
        String replacing=newchar.replace('m','n');
        System.out.println("String value before replacing: "+newchar);
        System.out.println("String value after replacing: "+replacing);

    }
    
}
