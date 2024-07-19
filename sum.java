import java.util.Scanner;

class sum {
    public static void main(String[] args) {

        int[] array = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
        // int sum = 0;
        int m = array[0];
        for (int i = 0; i < array.length; i++) {
            // sum += array[i];
            if (m < array[i]) {
                m = array[i];
            }
        }

        // System.out.println("sum of array" + m);
        System.out.println("the lergest number is " + m);
    }
}