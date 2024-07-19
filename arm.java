import java.util.Scanner;

class amstrong {

    int a;
    int r = 0;
    int s = 0;
    int t;

    void get(int x) {
        a = x;
    }

    void ams_found() {
        t = a;
        while (a > 0) {
            r = a % 10;
            s = s + r * r * r;
            a = a / 10;
        }
        if (t == s) {
            System.out.println("amstrong number" + t);
        } else {
            System.err.println("not amstrong number =" + t);
        }

    }

}

class arm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a: ");
        int x = s.nextInt();
        amstrong ob = new amstrong();
        ob.get(x);
        ob.ams_found();
        s.close();
    }
}
