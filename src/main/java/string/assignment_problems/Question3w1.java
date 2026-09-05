package string.assignment_problems;

public class Question3w1 {

    static void findLongestStreak(String signalLog) {
        char maxChar = signalLog.charAt(0);
        int max = 1, current = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                current++;
            } else {
                current = 1;
            }

            if (current > max) {
                max = current;
                maxChar = signalLog.charAt(i);
            }
        }

        System.out.println("Longest Streak: '" + maxChar + "' repeated " + max + " times");
    }

    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
    }
}
