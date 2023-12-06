import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstLetter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wpisz wyrazy (jeżeli chcesz zakończyć wpisz 0): ");
        List<String> singleWords = new ArrayList<>();
        String word;

        while (!(word = scan.nextLine()).equals("0")) {
            singleWords.add(word);
        }

        System.out.println(changeFirstLetter(singleWords));
    }

    public static List<String> changeFirstLetter(List<String> words) {
        List<String> changedLetters = new ArrayList<>();
        char letter;
        for (String item : words) {
            if(Character.isLowerCase(item.charAt(0))) {
                letter = Character.toUpperCase(item.charAt(0));
            } else {
                letter = Character.toLowerCase(item.charAt(0));
            }
            changedLetters.add(spanLetter(letter, item.substring(1)));
        }

        return changedLetters;
    }

    public static String spanLetter(char letter, String restWord)
    {
        return letter + restWord;
    }
}
