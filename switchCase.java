import java.util.Scanner;
public class switchCase {
    
    public static void main(String[] args){
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        a=input.nextInt();
        b=a/10;
        switch(b)
        {
            case 10:
            case 9:
                System.out.println("O");
                break;
            case 8:
            System.out.println("A");
            break;
            case 7:
            System.out.println("B");
            break;
            case 6 :
            System.out.println("C");
            break;
            case 5:
            case 4:
            System.out.println("d");
            break;


            default:
                 System.out.println("F");
        }




    }
}
