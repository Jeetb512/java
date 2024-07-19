import java.util.*;
class Error3
{
    public static void main (String args[])
    {
        int a = 10;
        int b= 5;
        int c= 5;
        int x, y ;
        try 
        {
           x = a/ (b-c);       // Exception here
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Division by Zero");
        }
        y = a/ (b+c);
        System.out.println("y= "+ y);
        
    }
}
                    