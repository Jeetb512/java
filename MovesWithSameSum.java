
public class MovesWithSameSum 
{
    public static int solution(int[] A) 
    {
        int N = A.length;
        if (N < 2)
        {
            return 0;
        }

        int maxMoves = 0;

        for (int i = 0; i < N / 2; i++) 
        {
            int total = A[i] + A[N - i - 1];
            int moves = 2;
            for (int j = i + 1; j < N / 2; j++) {
                if (A[j] + A[N - j - 1] == total) 
                {
                    moves += 2;
                } 
                else 
                {
                    break;
                }
            }

            maxMoves = Math.max(maxMoves, moves);
        }

        return maxMoves;
    }

    public static void main(String[] args) 
    {
        int[] A1 = {3, 1, 5, 3, 3, 4, 2};
        int result1 = solution(A1);
        System.out.println("Example 1: " + result1);
        int[] A2 = {4, 1, 4, 3, 3, 2, 5, 2};
        int result2 = solution(A2);
        System.out.println("Example 2: " + result2);
    }
}