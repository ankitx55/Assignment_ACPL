import java.util.Arrays;
import java.util.Scanner;

public class longestWord_Qn4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String[] words = scanner.nextLine().split(" ");
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        System.out.println("Length of longest word in the sentence is: " + maxLength);
        System.out.println(Arrays.toString(words));
    }
}
