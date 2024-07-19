import java.util.*;

class dublicate {
    void taken(int a[]) {
        System.out.println("Duplicate elements in given array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    System.out.println(a[j]);
            }
        }
    }
}

class dbarray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < b.length; i++)
            ;
        b[i] = s.nextInt();
        taken(b);

    }
}