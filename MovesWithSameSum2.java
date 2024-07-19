import java.util.Arrays;

public class MovesWithSameSum2 {

    public static int solution(int[] A) {
        int N = A.length;
        if (N < 2) {
            return 0; 
        }

        int maxMoves = 0;

        for (int i = 0; i < N / 2; i++) {
            int total = A[i] + A[N - i - 1];
            int moves = (int) Arrays.stream(A, i + 1, N / 2).filter(j -> A[N - j - 1] + A[j] == total).count() * 2 + 2;
            maxMoves = Math.max(maxMoves, moves);
        }

        return maxMoves;
    }

    public static void main(String[] args) {
        // Examples:
        int[] A1 = {3, 1, 5, 3, 3, 4, 2};
        int result1 = solution(A1);
        System.out.println("Example 1: " + result1);

        int[] A2 = {4, 1, 4, 3, 3, 2, 5, 2};
        int result2 = solution(A2);
        System.out.println("Example 2: " + result2);
    }
}