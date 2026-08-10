
import java.util.*;

public class CF2233A_AI_Project_Development {

    static int ceilDiv(int a, int b) {
        return (a + b - 1) / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            // Option 1: Don't use AI
            int withoutAI = ceilDiv(n, x + y);

            // Option 2: Use AI
            int withAI;

            int linesDuringSetup = x * z;

            if (linesDuringSetup >= n) {
                // Project finishes during AI setup
                withAI = ceilDiv(n, x);
            } else {
                int remaining = n - linesDuringSetup;

                int afterAI = ceilDiv(remaining, x + 10 * y);

                withAI = z + afterAI;
            }

            System.out.println(Math.min(withoutAI, withAI));
        }

        sc.close();
    }
}