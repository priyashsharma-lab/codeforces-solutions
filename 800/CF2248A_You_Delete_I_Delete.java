
import java.util.Scanner;

public class CF2248A_You_Delete_I_Delete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases-- > 0) {

            String s = sc.next();

            // Alice removes the first 0
            int firstZero = s.indexOf('0');

            StringBuilder afterAlice = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                if (i != firstZero) {
                    afterAlice.append(s.charAt(i));
                }
            }

            // Bob decides which 1 to remove
            int removeOne = -1;

            for (int i = 0; i < afterAlice.length(); i++) {

                if (afterAlice.charAt(i) == '1') {

                    boolean zeroLater = false;

                    for (int j = i + 1; j < afterAlice.length(); j++) {
                        if (afterAlice.charAt(j) == '0') {
                            zeroLater = true;
                            break;
                        }
                    }

                    if (zeroLater) {
                        removeOne = i;
                        break;
                    }
                }
            }

            // If no such 1 exists, remove the last 1
            if (removeOne == -1) {
                for (int i = afterAlice.length() - 1; i >= 0; i--) {
                    if (afterAlice.charAt(i) == '1') {
                        removeOne = i;
                        break;
                    }
                }
            }

            StringBuilder answer = new StringBuilder();

            for (int i = 0; i < afterAlice.length(); i++) {
                if (i != removeOne) {
                    answer.append(afterAlice.charAt(i));
                }
            }

            System.out.println(answer);
        }

        sc.close();
    }
}