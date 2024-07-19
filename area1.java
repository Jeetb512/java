import java.util.Scanner;

class rectangle {
    int lenth;
    int breath;

    rectangle(int l, int b) {
        lenth = l;
        breath = b;
    }

    void getare() {
        int c = lenth * breath;
        System.out.println("thr area of rectangle=" + c);
    }
}

class area1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rectangle lenth");
        int x = s.nextInt();
        System.out.println("enter rectangle breath");
        int y = s.nextInt();
        rectangle ob = new rectangle(x, y);
        ob.getare();
    }
}