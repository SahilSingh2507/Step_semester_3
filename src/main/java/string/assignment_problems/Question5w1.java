package string.assignment_problems;

public class Question5w1 {

    static void classifyWordLengths(String review) {
        String[] words = review.split(" ");
        int shortW = 0, medium = 0, longW = 0;

        for (String word : words) {
            int len = word.length();

            if (len >= 1 && len <= 4)
                shortW++;
            else if (len <= 8)
                medium++;
            else
                longW++;
        }

        System.out.println("Short: " + shortW +
                " | Medium: " + medium +
                " | Long: " + longW);
    }

    public static void main(String[] args) {
        classifyWordLengths("This movie was absolutely fantastic and thrilling");
    }
}