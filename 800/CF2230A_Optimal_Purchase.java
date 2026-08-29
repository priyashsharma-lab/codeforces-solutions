
import java.util.*;

public class CF2230A_Optimal_Purchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            long groups = n / 3;
            long remaining = n % 3;

            long ans = groups * Math.min(3 * a, b);

            if (remaining > 0) {
                ans += Math.min(remaining * a, b);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}