
import java.util.*;

public class CF2227B_Party_Monster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int open = 0;

            for (char c : s.toCharArray()) {
                if (c == '(') {
                    open++;
                } else {
                    open--;
                }
            }

            if (open == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}