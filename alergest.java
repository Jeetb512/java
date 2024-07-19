import java.util.*;

class alergest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("enter the array element");
        for (int i = 0; i < a.length; i++)
            a[i] = s.nextInt();
        int m = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        System.out.println("the lergest number is " + m);
    }
}
