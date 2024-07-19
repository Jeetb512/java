import java.util.*;

class learray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        int pos = -1, c;
        System.out.println("enter the array element");
        for (int i = 0; i < a.length; i++)
            a[i] = s.nextInt();
        System.out.println("enter the search element");
        c = s.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (c == a[i]) {
                pos = i;
                break;
            }
        }
        if (pos != -1)
            System.out.println("element found in " + pos);
        else
            System.out.println("element not found ");
    }
}
