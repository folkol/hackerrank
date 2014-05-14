import java.util.Arrays;
import java.util.Scanner;


public class Solution {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int numTests = input.nextInt();

        while (input.hasNextInt()) {
            System.out.println(findDecentNumber(input.nextInt()));
        }
    }

    static String findDecentNumber(int numDigits) {
        for (int i = numDigits, j = 0; i >= 0; i--, j++) {
            if ((i % 3 == 0) && (j % 5 == 0)) {
                return decentNumber(i, j);
            }
        }
        return "-1";
    }

    private static String decentNumber(int i, int j) {
        StringBuilder sb = new StringBuilder(i + j);
        sb.append(repdigit(i, '5'));
        sb.append(repdigit(j, '3'));
        return sb.toString();
    }

    private static char[] repdigit(int i, char digit) {
        char[] number = new char[i];
        Arrays.fill(number, digit);
        return number;
    }
}
