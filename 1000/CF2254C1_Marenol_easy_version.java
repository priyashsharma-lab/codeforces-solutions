
import java.util.*;

public class CF2254C1_Marenol_easy_version {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            int onesA = 0;
            int onesB = 0;

            int balanceA = 0;
            int balanceB = 0;

            for (int i = 0; i < n; i++) {

                if (a.charAt(i) == '1') {
                    onesA++;

                    if (i % 2 == 0)
                        balanceA++;
                    else
                        balanceA--;
                }

                if (b.charAt(i) == '1') {
                    onesB++;

                    if (i % 2 == 0)
                        balanceB++;
                    else
                        balanceB--;
                }
            }

            if (onesA == onesB && balanceA == balanceB)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}