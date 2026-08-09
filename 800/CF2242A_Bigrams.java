
import java.util.*;

public class CF2242A_Bigrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();

            int countTwo = 0;
            boolean possible = false;

            for (int i = 0; i < k; i++) {
                int c = sc.nextInt();

                if (c >= 3) {
                    possible = true;
                }

                if (c >= 2) {
                    countTwo++;
                }
            }

            if (countTwo >= 2) {
                possible = true;
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}