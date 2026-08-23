
import java.util.*;

public class CF2236A_Games_on_the_Train{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int h = sc.nextInt();

                min = Math.min(min, h);
                max = Math.max(max, h);
            }

            System.out.println(max - min + 1);
        }

        sc.close();
    }
}