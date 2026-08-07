
import java.util.*;

public class CF2245A_Who_Watches_the_Watchpig {
    static final int INF = 1_000_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int answer = INF;

            for (int m = 0; m <= n; m++) {

                // impossible if not enough R or L exist
                if (m < k || (n - m) < k)
                    continue;

                int[][] dp = new int[n + 1][m + 2];

                for (int i = 0; i <= n; i++)
                    Arrays.fill(dp[i], INF);

                dp[0][0] = 0;

                for (int i = 0; i < n; i++) {
                    for (int r = 0; r <= Math.min(i, m); r++) {

                        if (dp[i][r] == INF)
                            continue;

                        // Make current pig L
                        if (r >= k) {
                            int cost = dp[i][r] + (s.charAt(i) == 'R' ? 1 : 0);
                            dp[i + 1][r] = Math.min(dp[i + 1][r], cost);
                        }

                        // Make current pig R
                        if (r < m) {
                            int lBefore = i - r;
                            int lAfter = (n - m) - lBefore;

                            if (lAfter >= k) {
                                int cost = dp[i][r] + (s.charAt(i) == 'L' ? 1 : 0);
                                dp[i + 1][r + 1] = Math.min(dp[i + 1][r + 1], cost);
                            }
                        }
                    }
                }

                answer = Math.min(answer, dp[n][m]);
            }

            if (answer == INF)
                System.out.println(-1);
            else
                System.out.println(answer);
        }
    }
}