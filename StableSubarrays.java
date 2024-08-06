import java.util.Scanner;

public class StableSubarrays {

    public static boolean isUnstable(int[] A, int i, int j, int k) {
        int dist_ij = Math.abs(A[i] - A[j]) + Math.abs(i - j);
        int dist_ik = Math.abs(A[i] - A[k]) + Math.abs(i - k);
        int dist_jk = Math.abs(A[j] - A[k]) + Math.abs(j - k);
        return dist_ij == dist_ik + dist_jk;
    }

    public static int countStableSubarrays(int N, int[] A) {
        int stableCount = 0;

        for (int start = 0; start < N; start++) {
            boolean isStable = true;
            for (int end = start; end < N; end++) {
                if (end - start >= 2) {
                    // Check the triplet (start, mid, end) for all valid mids
                    for (int mid = start + 1; mid < end; mid++) {
                        if (isUnstable(A, start, mid, end)) {
                            isStable = false;
                            break;
                        }
                    }
                }
                if (isStable) {
                    stableCount++;
                } else {
                    break;
                }
            }
        }

        return stableCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        int N = sc.nextInt();
        
        // Input elements of the array
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Output the count of stable subarrays
        System.out.println(countStableSubarrays(N, A));

        sc.close();
    }
}