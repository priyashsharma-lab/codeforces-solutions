
import java.util.*;

public class CF99A_Help_Far_Away_Kingdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] parts = s.split("\\.");
        String integerPart = parts[0];
        String fractionPart = parts[1];

        // If integer part ends with 9
        if (integerPart.charAt(integerPart.length() - 1) == '9') {
            System.out.println("GOTO Vasilisa.");
            return;
        }

        // Fractional part is less than 0.5
        if (fractionPart.charAt(0) < '5') {
            System.out.println(integerPart);
        } 
        else {
            // Round up
            char last = integerPart.charAt(integerPart.length() - 1);
            last++;

            integerPart = integerPart.substring(0, integerPart.length() - 1) + last;

            System.out.println(integerPart);
        }
    }
}