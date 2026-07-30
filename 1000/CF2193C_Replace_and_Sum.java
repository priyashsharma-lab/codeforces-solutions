
import java.io.*;
import java.util.*;

public class CF2193C_Replace_and_Sum {

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            int q = fs.nextInt();

            int[] a = new int[n + 2];
            int[] b = new int[n + 2];

            for (int i = 1; i <= n; i++) {
                a[i] = fs.nextInt();
            }

            for (int i = 1; i <= n; i++) {
                b[i] = fs.nextInt();
            }

            for (int i = n; i >= 1; i--) {
                int best = a[i];
                if (b[i] > best) best = b[i];
                if (i < n && a[i + 1] > best) best = a[i + 1];
                a[i] = best;
            }

            long[] pref = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                pref[i] = pref[i - 1] + a[i];
            }

            for (int i = 0; i < q; i++) {
                int l = fs.nextInt();
                int r = fs.nextInt();
                out.append(pref[r] - pref[l - 1]);
                if (i + 1 < q) out.append(" ");
            }
            out.append("\n");
        }

        System.out.print(out);
    }
}