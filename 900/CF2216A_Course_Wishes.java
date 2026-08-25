

import java.util.*;

public class CF2216A_Course_Wishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[k + 1];

            for (int i = 1; i <= k; i++) {
                a[i] = sc.nextInt();
            }

            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            ArrayList<Integer> ans = new ArrayList<>();

            // Process higher levels first
            for (int level = k; level >= 1; level--) {

                for (int i = 0; i < n; i++) {

                    if (b[i] == level) {

                        // Keep moving until level k+1
                        while (b[i] <= k) {
                            b[i]++;
                            ans.add(i + 1);
                        }
                    }
                }
            }

            System.out.println(ans.size());

            for (int x : ans) {
                System.out.print(x + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}