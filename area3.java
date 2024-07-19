
// Copyright 2024 biswa
import java.util.Scanner;//method  overloading

class rectangle {
    int lenth;
    int breath;

    void input(int l, int b) {
        lenth = l;
        breath = b;
    }

    void getare() {
        int c = lenth * breath;
        System.out.println("thr area of rectangle" + c);
    }

    void input(int l) {
        lenth = l;
    }

    void getare2() {
        int d = lenth * lenth;
        System.out.println("the area of sq" + d);
    }
}

class area3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the rectangle lenth");
        int x = s.nextInt();
        System.out.println("enter rectangle breath");
        int y = s.nextInt();
        rectangle ob = new rectangle();
        ob.input(x, y);
        ob.getare();
        rectangle ob1 = new rectangle();
        ob1.input(x);
        ob1.getare2();
    }
}