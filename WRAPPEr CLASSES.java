import java.util.*;
class Wrapper_test
{
    public static void main(String args[])
    {
        int a, b, c=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        a=s.nextInt();
        b=s.nextInt();
        Integer ob =Integer.valueOf(a);
       // ob=Float.valueOf(a);
        Integer ob1=Integer.valueOf(b);
        Integer ob2=Integer.valueOf(c);
        ob2=ob+ob1;
        System.out.println("the result:"+ob2);
        c=ob2.intValue();
        System.out.println("the result:"+c);
    }
}