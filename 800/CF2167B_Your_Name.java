
import java.util.*;

public class CF2167B_Your_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while (q-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();

            int[] freq = new int[26];

            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }

            for (char ch : t.toCharArray()) {
                freq[ch - 'a']--;
            }

            boolean possible = true;

            for (int x : freq) {
                if (x != 0) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}