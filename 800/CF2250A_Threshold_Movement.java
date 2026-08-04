
import java.util.Scanner;

public class CF2250A_Threshold_Movement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] weights = new int[n];

            for (int i = 0; i < n; i++) {
                weights[i] = sc.nextInt();
            }

            if (n % 2 == 1) {
                System.out.println("NO");
                continue;
            }

            int maxEven = 0;
            int minOdd = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {

                if ((i + 1) % 2 == 1) {
                    if (weights[i] < minOdd) {
                        minOdd = weights[i];
                    }
                } else {
                    if (weights[i] > maxEven) {
                        maxEven = weights[i];
                    }
                }
            }

            if (minOdd - maxEven >= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}