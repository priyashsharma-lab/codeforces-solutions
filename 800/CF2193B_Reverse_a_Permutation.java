import java.util.*;

public class CF2193B_Reverse_a_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] p = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }

            // Find the position of the maximum element
            // in every suffix.
            int[] suffixMax = new int[n];
            int[] suffixPos = new int[n];

            suffixMax[n - 1] = p[n - 1];
            suffixPos[n - 1] = n - 1;

            for (int i = n - 2; i >= 0; i--) {
                if (p[i] > suffixMax[i + 1]) {
                    suffixMax[i] = p[i];
                    suffixPos[i] = i;
                } else {
                    suffixMax[i] = suffixMax[i + 1];
                    suffixPos[i] = suffixPos[i + 1];
                }
            }

            // Find the first position that can be improved
            for (int i = 0; i < n - 1; i++) {

                if (suffixMax[i + 1] > p[i]) {
                    int j = suffixPos[i + 1];

                    // Reverse [i, j]
                    while (i < j) {
                        int temp = p[i];
                        p[i] = p[j];
                        p[j] = temp;

                        i++;
                        j--;
                    }

                    break;
                }
            }

            for (int x : p) {
                System.out.print(x + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}