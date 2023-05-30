import java.util.Scanner;
public class reverseWord_Qn3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            String[] words = input.split(" ");
            String output = "";
            for (int i = words.length - 1; i >= 0; i--) {
                output += words[i] + " ";
            }
            System.out.println("Reversed string: " + output.trim());
        }
}
