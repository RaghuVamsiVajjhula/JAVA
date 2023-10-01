public class Math_class 
{
    public static void main(String[] args)
    {
        double x=3.14;
        double y=-10;
        double z=49;

        double a=Math.max(x, y);//Both the values which are to be compared are should be same data type.
        double b=Math.min(x, y);//Max gives out maximum value and min gives out minimum value.
        double c=Math.abs(y);//abs gives out the absolute value.
        double d=Math.sqrt(z);//gives out the square root value of the given number.
        double e=Math.round(x);//gives out the rounded value
        double f=Math.ceil(x);//gives out the next rounded value like even it is 0.1 greater than exact value it increments.


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }    
}
