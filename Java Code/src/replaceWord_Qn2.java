import java.util.Scanner;

public class replaceWord_Qn2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();
        String output = input.replaceAll(wordToReplace, newWord);
        System.out.println("Replaced string: " + output);
    }
}
