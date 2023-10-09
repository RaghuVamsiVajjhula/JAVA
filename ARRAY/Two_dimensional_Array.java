package ARRAY;
//The above part is written because it is stored in ARRAY folder in my windows.

public class Two_dimensional_Array 
{
    public static void main(String[] args)
    {
        //The 2-d arrays are also called as multidimensional arrays in java.
        //A 2-d array is an array which consists of rows and coloumns.
        
        int a=3;
        int b=3;
        //We can take values of a and b from user.
        //a=Entre no of rows.
        //b=enter no of cols.
        String cars[][]=new String[a][b];
        cars[0][0]="Swift";
        cars[0][1]="Baleno";
        cars[0][2]="Breeza";
        cars[1][0]="Nexon";
        cars[1][1]="Tiago";
        cars[1][2]="Safari";
        cars[2][0]="Verna";
        cars[2][1]="Verna";
        cars[2][2]="i20-Nline";

        // OR WE CAN EVEN DECLARE ARRAY LIKE:

        // String[][] cars=
        //     {
            
        //     {"Swift","Baleno","Breeza"},{"Nexon","Tiago","Safari"},
        //     {"Verna","Verna","i20-Nline"}
        //     };

        for(int i=0;i<a;i++)
        {
            System.out.println();//This is important bcoz it prints the elements for every increment of i.
            for(int j=0;j<b;j++)
            {
                System.out.println(""+cars[i][j]);
            }
        }
        
        
        // System.out.println("The first element of the 2-d array is:"+cars[0][0]);
        // //We can change values of 2-d array same as 1-d array.
        // cars[0][0]="Jimny";
        // System.out.println("Value of 1st element afte changing is:"+cars[0][0]);

    }
    
}
