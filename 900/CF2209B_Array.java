
import java.util.*;

public class CF2209B_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] ans = new int[n];

            for (int i = 0; i < n; i++) {
                int smaller = 0;
                int greater = 0;

                for (int j = i + 1; j < n; j++) {
                    if (a[j] < a[i]) {
                        smaller++;
                    } else if (a[j] > a[i]) {
                        greater++;
                    }
                }

                ans[i] = Math.max(smaller, greater);
            }

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}