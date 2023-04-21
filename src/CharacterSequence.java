import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int n = word.length();
        for (int i = 0; i<n; i++) {
            char alpha = word.charAt(i);
            System.out.println(alpha);
        }
    }
}
