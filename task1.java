/*1.Number Game*/
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class task1 {

    public static void main(String args[]) throws IOException {
        Scanner a= new Scanner(System.in);
        Random r = new Random();

        System.out.println("\nNumber Game\nLets play \nHere a random number will be generated  between 1to100");
        System.out.println(
                "You have to enter a number.\nIf the entered number is same as random number your score will be the number of attempts you took to guess the number.\n");
        System.out.print("Enter the Number of Rounds (between 1-5) you want to play the Game : ");
        int no_of_rounds = a.nextInt();

        for (int j= 1; j<= no_of_rounds; j++) {
        
            System.out.println("Round " + j + " begins ...\n");

            System.out.println(
                    "Enter the Difficulty Level:\n1 --> Easy [No Limit for number of attempts]\n2 --> Hard [Limit for number of attempts]");
            int limits =a.nextInt();

            switch (limits) {
                case 1: {
                    System.out.println("Selected Easy.\nHence, No Limit to number of attempts\n");

                    int randomNumber = 1 + r.nextInt(100);
                    System.out.println("Random Number was generated...");
                    int count = 1;
                    whileloop:while (true) {
                        System.out.print("Enter you guess number " + count + ": ");
                        int guess = a.nextInt();
                        if (guess > randomNumber) {
                            System.out.println("The number " + guess
                                    + " is greater than Generated Number.\n So Guess again...");
                        } else if (guess < randomNumber) {
                            System.out.println("The number " + guess
                                    + " is lesser than Generated Number. \nSo Guess again...");
                        } else {
                            System.out.println(
                                    "The number " + guess + " is EQUAL to the Generated Number.\nCongrats you win but it took you "
                                            + count + " attempts.");
                            break;
                        }
                        count++;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Selected Hard .\nHence, Limit to number of attempts");
                    System.out.println(
                            "The number of attempts is 5.\nIf you have guessed the number in less than or on 5th attempt you will win the game.\n Else you will lose the game.\n");
                    int randomNumber = 1 +a.nextInt(100);
                    System.out.println("Random Number was generated...");
                    int count = 1;
                    whileloop:while (count <= 5) {
                        System.out.println("\nNo of guesses you left with: " + (6 - count) + " ...\n");
                        System.out.print("Enter a random number " + count + ": ");
                        int guess = a.nextInt();
                        if (guess > randomNumber) {
                            System.out.println("The number " + guess
                                    + " is larger than Generated Number. \nSo Guess again...");
                        } else if (guess < randomNumber) {
                            System.out.println("The number " + guess
                                    + " is LOWER than Generated Number. \nSo Guess again...");
                        } else {
                            System.out.println(
                                    "The number " + guess + " is EQUAL to the Generated Number.\nCongrats you win it took you "
                                            + count + " attempts.");
                            break whileloop;
                        }
                        count++;
                    }
                    if (count > 5) {
                        System.out.println(
                                "You lost the game as you cannot guess the number within 5 attempts.\nThe Generated Number was "
                                        + randomNumber + "\n Better Luck next time\n");
                    }
                    break;
                }
                default: {
                    System.out.println("--- INVALID INPUT ---\nBut this round has been wasted due to wrong input.");
                    break;
                }
            }

            System.out.println("ROUND " + j + " is OVER.");
        }
        System.out.println("\nAll the Rounds are over.\nThank You for Playing the Game.\nHope you enjoyed it.");
        a.close();
    }
}