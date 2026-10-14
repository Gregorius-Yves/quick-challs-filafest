import java.util.Scanner;

public class FlagChecker {

    public static int[] encode(String input) {
        int[] result = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = ((input.charAt(i) ^ 0x42) + 5);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] expected = {23, 18, 21, 18, 22, 117, 121, 62, 58, 118, 51, 38, 119, 52, 118, 68};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the flag: ");
        String input = sc.nextLine();
        sc.close();

        if (input.length() != expected.length) {
            System.out.println("Wrong!");
            return;
        }

        int[] encoded = encode(input);
        boolean correct = true;
        for (int i = 0; i < expected.length; i++) {
            if (encoded[i] != expected[i]) {
                correct = false;
                break;
            }
        }

        if (correct) {
            System.out.println("Correct! You got the flag!");
        } else {
            System.out.println("Wrong!");
        }
    }
}
