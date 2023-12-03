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
        for (String item : words) {
            if(Character.isLowerCase(item.charAt(0))) {
                char upLetter = Character.toUpperCase(item.charAt(0));
                String spanLetter = upLetter + item.substring(1);
                changedLetters.add(spanLetter);
            } else {
                char downLetter = Character.toLowerCase(item.charAt(0));
                String spanLetter = downLetter + item.substring(1);
                changedLetters.add(spanLetter);
            }
        }

        return changedLetters;
    }
}
