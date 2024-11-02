package com.hangman;

import java.util.Scanner;

public class HangmanGame {
	
	public static String selectRandomWord(String[] words) {
	    return words[(int) (Math.random() * words.length)];
	}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"java", "maven", "eclipse", "program"};
        String word = words[(int) (Math.random() * words.length)];
        char[] guessedWord = new char[word.length()];

        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int attempts = 6;
        boolean won = false;

        System.out.println("Welcome to Hangman! Try to guess the word.");

        while (attempts > 0 && !won) {
            System.out.println("\nWord: " + String.valueOf(guessedWord));
            System.out.print("Enter a letter: ");
            char guess = scanner.nextLine().charAt(0);

            boolean correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                attempts--;
                System.out.println("Incorrect! Attempts remaining: " + attempts);
            }

            if (String.valueOf(guessedWord).equals(word)) {
                won = true;
            }
        }

        if (won) {
            System.out.println("Congratulations! You guessed the word: " + word);
        } else {
            System.out.println("Sorry, you're out of attempts. The word was: " + word);
        }

        scanner.close();
    }
}
