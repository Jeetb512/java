import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        try {
            System.out.println("Enter the value of a: ");
            a = input.nextInt();
            if (a <= 0) {
                throw new IllegalArgumentException("Input must be a positive integer");
            }
            int sum = findSumOfFactors(a);
            System.out.println("The sum of the factors is: " + sum);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close(); 
        }
    }

    public static int findSumOfFactors(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
