
package string.class_problems;

import java.util.Random;
import java.util.Scanner;
    public class Q1w1 {

        static String playRound(String playerMove, String computerMove) {

            if (playerMove.equals(computerMove))
                return "Draw";

            if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
                    (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
                    (playerMove.equals("Scissors") && computerMove.equals("Paper")))
                return "Player Wins";

            return "Computer Wins";
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Random random = new Random();

            String[] moves = {"Rock", "Paper", "Scissors"};

            String[] playerHistory = new String[5];
            String[] computerHistory = new String[5];
            String[] resultHistory = new String[5];

            int wins = 0, losses = 0, draws = 0;

            for (int i = 0; i < 5; i++) {

                System.out.print("Round " + (i + 1) + " Enter Move (Rock/Paper/Scissors): ");
                String player = sc.nextLine();

                String computer = moves[random.nextInt(3)];

                String result = playRound(player, computer);

                playerHistory[i] = player;
                computerHistory[i] = computer;
                resultHistory[i] = result;

                if (result.equals("Player Wins"))
                    wins++;
                else if (result.equals("Computer Wins"))
                    losses++;
                else
                    draws++;

                System.out.println("Computer: " + computer);
                System.out.println("Result: " + result);
                System.out.println();
            }

            System.out.println("------ FINAL SUMMARY ------");
            System.out.println("Round\tPlayer\t\tComputer\tResult");

            for (int i = 0; i < 5; i++) {
                System.out.println((i + 1) + "\t" +
                        playerHistory[i] + "\t\t" +
                        computerHistory[i] + "\t\t" +
                        resultHistory[i]);
            }

            double percentage = (wins * 100.0) / 5;

            System.out.println("\nWins: " + wins);
            System.out.println("Losses: " + losses);
            System.out.println("Draws: " + draws);
            System.out.printf("Win Percentage: %.2f%%", percentage);

            sc.close();
        }
    }
