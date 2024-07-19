import java.util.Scanner;

class fimo1 {

    int a;
    int f = 0;
    int s = 1;
    int t = 0;
    int z = 0;

    void get(int x) {
        a = x;
    }

    void fimo_found() {
        t = a;
        for (int i = 0; i <= a - 2; i++) {
            t = f + s;
            f = s;
            s = t;
            System.err.println("fimo no is  =" + t);
            z = t;
        }
        // System.err.println("fimo no is =" + z);

    }
}

class fimo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a: ");
        int x = s.nextInt();
        fimo1 ob = new fimo1();
        ob.get(x);
        ob.fimo_found();
        s.close();
    }
}
// 0 1 1 2 3 5 8 13