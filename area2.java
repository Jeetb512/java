import java.util.Scanner;//constructor overloading

class rectangle {
    int lenth;
    int breath;

    rectangle(int l, int b) {
        lenth = l;
        breath = b;
    }

    void getare() {
        int c = lenth * breath;
        System.out.println("thr area of rectangle" + c);
    }

    rectangle(int l) {
        lenth = l;
    }

    void getare2() {
        int d = lenth * lenth;
        System.out.println("the area of sq" + d);
    }
}

class area2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the rectangle lenth");
        int x = s.nextInt();
        System.out.println("enter rectangle breath");
        int y = s.nextInt();
        rectangle ob = new rectangle(x, y);
        ob.getare();
        rectangle ob1 = new rectangle(x);
        ob1.getare2();
    }
}