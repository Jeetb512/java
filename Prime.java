import java.util.Scanner;

public class Prime {

    int a, b;

    void get(int x, int y) {
        a = x;
        b = y;
    }

    void prime_found() {
        for (int i = a; i <= b; ++i) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i > 1) {
                System.out.println("Prime: " + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a: ");
        int x = s.nextInt();
        System.out.println("Enter b: ");
        int y = s.nextInt();
        Prime ob = new Prime();
        ob.get(x, y);
        ob.prime_found();
        s.close();
    }
}
