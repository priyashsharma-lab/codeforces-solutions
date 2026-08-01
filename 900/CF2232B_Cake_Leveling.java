import java.util.*;

public class CF2232B_Cake_Leveling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long sum = 0;
            long minValue = Long.MAX_VALUE;

            for (int i = 1; i <= n; i++) {
                long x = sc.nextLong();
                sum += x;

                long value = sum / i;
                if (value < minValue) {
                    minValue = value;
                }

                System.out.print(minValue + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}