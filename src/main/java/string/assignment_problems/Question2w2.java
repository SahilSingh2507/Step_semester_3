package string.assignment_problems;

public class Question2w2 {

    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            StringBuilder rev = new StringBuilder();

            for (int j = words[i].length() - 1; j >= 0; j--) {
                rev.append(words[i].charAt(j));
            }

            result += rev.toString();

            if (i != words.length - 1) {
                result += " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("hello club"));
    }
}