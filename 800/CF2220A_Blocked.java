
import java.io.*;
import java.util.*;

public class CF2220A_Blocked {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                set.add(a[i]);
            }

            // Duplicate exists
            if (set.size() != n) {
                System.out.println(-1);
                continue;
            }

            // Sort in ascending order first
            Arrays.sort(a);

            // Print in descending order
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }
    }
}