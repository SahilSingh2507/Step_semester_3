package string.assignment_problems;

import java.util.*;

public class Question5w2 {

    static void printFilteredWordFrequency(String feedback) {

        String[] stop = {"the","was","and","a","is","of","in"};

        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "").replace(",", "");

        String[] words = feedback.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {

            boolean isStop = false;
            for (String s : stop) {
                if (word.equals(s)) {
                    isStop = true;
                    break;
                }
            }

            if (!isStop) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    public static void main(String[] args) {
        printFilteredWordFrequency(
                "The mentor was great, the session was great and clear."
        );
    }
}