package string.assignment_problems;

public class Question4w1 {

    static void analyzeInventory(int[] a, int[] b) {
        int totalA = 0, totalB = 0;
        int max = a[0], section = 1, index = 0;

        for (int i = 0; i < a.length; i++) {
            totalA += a[i];
            if (a[i] > max) {
                max = a[i];
                section = 1;
                index = i;
            }
        }

        for (int i = 0; i < b.length; i++) {
            totalB += b[i];
            if (b[i] > max) {
                max = b[i];
                section = 2;
                index = i;
            }
        }

        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);
        System.out.println("Status: " + (totalA == totalB ? "Balanced" : "Not Balanced"));
        System.out.println("Highest Quantity: " + max +
                " (Section " + section + ", Item " + (index + 1) + ")");
    }

    public static void main(String[] args) {
        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        analyzeInventory(sectionA, sectionB);
    }
}