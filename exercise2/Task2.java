package exercise2;

import java.io.FileReader;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("WarAndPeace");
        Scanner sc = new Scanner(fr);
        List<String> list = new ArrayList<>();

        int countOfShortestWord = 0;
        int countOfLongestWord = 0;

        while (sc.hasNext()) {
            String s = sc.next();
            String temp = s.toLowerCase().replaceAll("[!@#$%^&*();_.+,={}'|\":<>?-]", "").
                    replaceAll("[0-9]", "");
            if (temp.equals("") | temp.equals("]") | temp.equals("[")) {
                continue;
            }
            list.add(temp);
        }

        list.sort(new StringLengthComparator());
        int shortestLength = list.get(0).length();
        int longestLength = list.get(list.size() - 1).length();
        fr.close();

        List<String> shortWord = new ArrayList<>();
        for (String word : list) {
            if (word.length() == shortestLength) {
                shortWord.add(word);
            }
        }
        Collections.sort(shortWord);
        String shortestW = shortWord.get(0);

        for (String word : shortWord) {
            if (word.equals(shortWord.get(0))) {
                countOfShortestWord++;
            }
        }

        List<String> longWord = new ArrayList<>();
        for (String word : list) {
            if (word.length() == longestLength) {
                longWord.add(word);
            }
        }
        Collections.sort(longWord);
        String longestW = longWord.get(longWord.size() - 1);

        for (String word : longWord) {
            if (word.equals(longWord.get(longWord.size() - 1))) {
                countOfLongestWord++;
            }
        }

        System.out.println("in first tom of the poem War and Peace shortest word is - [" +
                shortestW + "] and he repeats - " + countOfShortestWord +
                System.lineSeparator() + "and longest word is - [" + longestW +
                "] and he repeats - " + countOfLongestWord);
        System.out.println("высокопревосходительство".length());
    }
}



