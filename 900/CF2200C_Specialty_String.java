
import java.io.*;

public class CF2200C_Specialty_String {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            StringBuilder stack = new StringBuilder();

            for (char ch : s.toCharArray()) {
                int len = stack.length();

                if (len > 0 && stack.charAt(len - 1) == ch) {
                    stack.deleteCharAt(len - 1);
                } else {
                    stack.append(ch);
                }
            }

            System.out.println(stack.length() == 0 ? "YES" : "NO");
        }
    }
}