package HomeWorks.HW6.Game.GuessWord;

import java.util.Scanner;

public class MainOfGuessWord {
    public static void main(String[] args) {
        getIntroductoryMsg();

        while (playGame()) {
            GuessWordGame game = new GuessWordGame();
            game.startGame();
        }
        System.out.println("\nYou said NO. GOODBYEEEEE!".toUpperCase());
    }

    public static void getIntroductoryMsg() {
        System.out.println("Welcome to Guess Word Game. The AI randomly selects words and hides it.");
        System.out.println("You should guess the word. If you are successful - YOU WIN.");
    }

    public static boolean playGame() {
        System.out.println("****************************************************************************");
        System.out.print("Would you like to play a GAME? (y - YES, the rest NO): ");
        return new Scanner(System.in).nextLine().equalsIgnoreCase("y");
    }
}