package HomeWorks.HW6.Game.GuessWord;

import java.util.Random;
import java.util.Scanner;

public class GuessWordGame {
    private String hiddenWord;
    private char[] guessedLetters;
    private int attempts;
    private int letterCount;

    public GuessWordGame() {
        this.guessedLetters = new char[26]; // Максимум 26 букв
        this.attempts = 0;
        this.letterCount = 0;
    }

    public void startGame() {
        hiddenWord = getRandomWord(words()).toUpperCase().trim();
        System.out.println("*****************************************************************************");
        System.out.println("AI has generated a hidden word for you. It is time to start a game.");
        System.out.println("Your hidden word is: ");
        showWord();
        System.out.println("*****************************************************************************");

        while (true) {
            System.out.print("Please, enter a LETTER or a WHOLE WORD to GUESS: ");
            String input = getInput().nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("You have not entered anything. Please enter a letter or word.");
                continue;
            }

            if (input.length() == 1) {
                char guessedLetter = Character.toUpperCase(input.charAt(0));
                if (isLetterGuessed(guessedLetter)) {
                    System.out.println("You've already guessed that letter.");
                } else {
                    guessedLetters[letterCount++] = guessedLetter;
                    if (containsLetter(guessedLetter)) {
                        System.out.println("You guessed the letter: " + guessedLetter);
                    } else {
                        System.out.println("There is no such letter in the word.");
                        attempts++;
                    }
                    showWord();
                }

                if (allLettersGuessed()) {
                    System.out.println("WINNER! You guessed all the letters!");
                    break;
                }

            } else if (input.length() > 1) {
                if (checkWord(input)) {
                    System.out.println("YOU HAVE GUESSED THE WORD. YOU HAVE WON!");
                    break;
                } else {
                    System.out.println("YOU MISSED! Try again");
                    attempts++;
                }
            }

            if (attempts >= 6) {
                System.out.println("You have exhausted all attempts! The word was:  " + hiddenWord);
                break;
            }
        }
    }

    private String[] words() {
        return new String[]{
                "Apple", "House", "Car", "Stone", "Dragon",
                "Vehicle", "Pineapple", "Watermelon", "Globe", "Tree",
                "Java", "Python", "Banana", "Building", "Butter",
                "Computer", "Notebook", "Bag", "Trousers", "Wardrobe"
        };
    }

    private String getRandomWord(String[] hiddenWords) {
        return hiddenWords[new Random().nextInt(hiddenWords.length)];
    }

    private void showWord() {
        for (char letter : hiddenWord.toCharArray()) {
            if (isLetterGuessed(letter)) {
                System.out.print(letter + "\t");
            } else {
                System.out.print("*\t");
            }
        }
        System.out.println();
    }

    private boolean checkWord(String input) {
        return input.equalsIgnoreCase(hiddenWord);
    }

    private boolean containsLetter(char letter) {
        for (char c : hiddenWord.toCharArray()) {
            if (c == letter) {
                return true;
            }
        }
        return false;
    }

    private boolean allLettersGuessed() {
        for (char letter : hiddenWord.toCharArray()) {
            if (!isLetterGuessed(letter)) {
                return false;
            }
        }
        return true;
    }

    private boolean isLetterGuessed(char letter) {
        for (int i = 0; i < letterCount; i++) {
            if (guessedLetters[i] == letter) {
                return true;
            }
        }
        return false;
    }

    private Scanner getInput() {
        return new Scanner(System.in);
    }
}