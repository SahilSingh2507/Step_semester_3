
package string.class_problems;

import java.util.Random;

    public class Q3w1 {

        static String getBmiStatus(double bmi) {

            if (bmi < 18.5)
                return "Underweight";
            else if (bmi < 25)
                return "Normal";
            else if (bmi < 30)
                return "Overweight";
            else
                return "Obese";
        }

        static void printWellnessReport(double[] heights, double[] weights) {

            System.out.printf("%-8s %-10s %-10s %-8s %-15s%n",
                    "Person", "Height", "Weight", "BMI", "Status");

            for (int i = 0; i < heights.length; i++) {

                double bmi = weights[i] / (heights[i] * heights[i]);
                String status = getBmiStatus(bmi);

                System.out.printf("%-8d %-10.2f %-10.1f %-8.2f %-15s%n",
                        i + 1, heights[i], weights[i], bmi, status);
            }
        }

        public static void main(String[] args) {

            Random random = new Random();

            int n = 10;

            double[] heights = new double[n];
            double[] weights = new double[n];

            for (int i = 0; i < n; i++) {
                heights[i] = 1.50 + (random.nextDouble() * 0.50); // 1.50–2.00 m
                weights[i] = 45 + random.nextInt(56);             // 45–100 kg
            }

            printWellnessReport(heights, weights);
        }
    }

