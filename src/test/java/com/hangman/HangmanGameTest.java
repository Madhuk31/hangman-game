package com.hangman;

import org.junit.Test;
import static org.junit.Assert.*;

public class HangmanGameTest {

    @Test
    public void testWordSelection() {
        String[] words = {"java", "maven", "eclipse", "program"};
        String word = HangmanGame.selectRandomWord(words); // You'll need to add this method to HangmanGame
        assertNotNull(word);
        assertTrue(java.util.Arrays.asList(words).contains(word));
    }

    // You can add additional tests for other functionalities as needed
}
