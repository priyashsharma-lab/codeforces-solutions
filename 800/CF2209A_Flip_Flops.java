
import java.util.*;

public class CF2209A_Flip_Flops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long k = sc.nextLong();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            for (int i = 0; i < n; i++) {
                if (a[i] > c) {
                    break;
                }

                long used = Math.min(k, c - a[i]);

                k -= used;
                c += a[i] + used;
            }

            System.out.println(c);
        }

        sc.close();
    }
}