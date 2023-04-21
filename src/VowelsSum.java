import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int n = word.length();
        int sum = 0;
        for (int i = 0; i<n ; i++) {
            char alpha = word.charAt(i);
            switch (alpha) {
                case 'a':
                    sum = sum+1;
                    break;
                case 'e':
                    sum = sum+2;
                    break;
                case 'i':
                    sum = sum+3;
                    break;
                case 'o':
                    sum = sum+4;
                    break;
                case 'u':
                    sum = sum+5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
