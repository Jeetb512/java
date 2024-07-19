import java.util.Scanner;
class DublicateValue{
    public static void main(String[] args){
        int n=5,i,count=0,x;
        
        int a[]=new int[5];
        Scanner s = new Scanner(System.in);
        System.out.print("enter an array: ");
        for (i=0;i<n;i++)
        a[i] = s.nextInt();
        System.out.println("enter x");
        x=s.nextInt();
        for (i=0;i<n;i++){
          if(x==a[i])
          {
            count++;
          }
        }
        System.out.println("Duplicate element"+count);
    }

}