import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void infoAboutString(String string) {
        int countOfLetter = 0;
        int countOfDigit = 0;
        int countSpace = 0;
        int other = string.length() - string.replaceAll("[.,;:?!-]", "").length();

        char[] afterSplit = string.toLowerCase().toCharArray();
        Map<Character, Integer> onlyLetter = new HashMap<>();

        for (int i = 0; i < afterSplit.length; i++) {
            if (afterSplit[i] == ' ') {
                countSpace++;
            }
            if (Character.isLetter(afterSplit[i])) {
                int value = onlyLetter.getOrDefault(afterSplit[i], 0) + 1;
                onlyLetter.put(afterSplit[i], value);
                countOfLetter++;
            }
            if (Character.isDigit(afterSplit[i])) {
                countOfDigit++;
            }
        }
        System.out.println("1) letters and the number of their occurrences: " + onlyLetter);
        System.out.println("2) total number of letters " + countOfLetter);
        System.out.println("3) count of spaces: " + countSpace);
        System.out.println("4) number of digit: " + countOfDigit);
        System.out.println("5) number of punctuation marks: " + other);
    }
}