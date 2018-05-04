package com.adaptionsoft.games.trivia;


import com.adaptionsoft.games.trivia.runner.GameRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;



public class SomeTest {

    private static final String OUTPUT = "Chet was added\n" +
            "They are player number 1\n" +
            "Pat was added\n" +
            "They are player number 2\n" +
            "Sue was added\n" +
            "They are player number 3\n" +
            "Chet is the current player\n" +
            "They have rolled a 1\n" +
            "Chet's new location is 1\n" +
            "The category is Science\n" +
            "Science Question 0\n" +
            "Answer was corrent!!!!\n" +
            "Chet now has 1 Gold Coins.\n" +
            "Pat is the current player\n" +
            "They have rolled a 1\n" +
            "Pat's new location is 1\n" +
            "The category is Science\n" +
            "Science Question 1\n" +
            "Answer was corrent!!!!\n" +
            "Pat now has 1 Gold Coins.\n" +
            "Sue is the current player\n" +
            "They have rolled a 2\n" +
            "Sue's new location is 2\n" +
            "The category is Sports\n" +
            "Sports Question 0\n" +
            "Answer was corrent!!!!\n" +
            "Sue now has 1 Gold Coins.\n" +
            "Chet is the current player\n" +
            "They have rolled a 4\n" +
            "Chet's new location is 5\n" +
            "The category is Science\n" +
            "Science Question 2\n" +
            "Answer was corrent!!!!\n" +
            "Chet now has 2 Gold Coins.\n" +
            "Pat is the current player\n" +
            "They have rolled a 2\n" +
            "Pat's new location is 3\n" +
            "The category is Rock\n" +
            "Rock Question 0\n" +
            "Question was incorrectly answered\n" +
            "Pat was sent to the penalty box\n" +
            "Sue is the current player\n" +
            "They have rolled a 1\n" +
            "Sue's new location is 3\n" +
            "The category is Rock\n" +
            "Rock Question 1\n" +
            "Answer was corrent!!!!\n" +
            "Sue now has 2 Gold Coins.\n" +
            "Chet is the current player\n" +
            "They have rolled a 4\n" +
            "Chet's new location is 9\n" +
            "The category is Science\n" +
            "Science Question 3\n" +
            "Question was incorrectly answered\n" +
            "Chet was sent to the penalty box\n" +
            "Pat is the current player\n" +
            "They have rolled a 2\n" +
            "Pat is not getting out of the penalty box\n" +
            "Sue is the current player\n" +
            "They have rolled a 2\n" +
            "Sue's new location is 5\n" +
            "The category is Science\n" +
            "Science Question 4\n" +
            "Answer was corrent!!!!\n" +
            "Sue now has 3 Gold Coins.\n" +
            "Chet is the current player\n" +
            "They have rolled a 1\n" +
            "Chet is getting out of the penalty box\n" +
            "Chet's new location is 10\n" +
            "The category is Sports\n" +
            "Sports Question 1\n" +
            "Answer was correct!!!!\n" +
            "Chet now has 3 Gold Coins.\n" +
            "Pat is the current player\n" +
            "They have rolled a 4\n" +
            "Pat is not getting out of the penalty box\n" +
            "Sue is the current player\n" +
            "They have rolled a 4\n" +
            "Sue's new location is 9\n" +
            "The category is Science\n" +
            "Science Question 5\n" +
            "Question was incorrectly answered\n" +
            "Sue was sent to the penalty box\n" +
            "Chet is the current player\n" +
            "They have rolled a 4\n" +
            "Chet is not getting out of the penalty box\n" +
            "Pat is the current player\n" +
            "They have rolled a 4\n" +
            "Pat is not getting out of the penalty box\n" +
            "Sue is the current player\n" +
            "They have rolled a 3\n" +
            "Sue is getting out of the penalty box\n" +
            "Sue's new location is 0\n" +
            "The category is Pop\n" +
            "Pop Question 0\n" +
            "Answer was correct!!!!\n" +
            "Sue now has 4 Gold Coins.\n" +
            "Chet is the current player\n" +
            "They have rolled a 1\n" +
            "Chet is getting out of the penalty box\n" +
            "Chet's new location is 11\n" +
            "The category is Rock\n" +
            "Rock Question 2\n" +
            "Answer was correct!!!!\n" +
            "Chet now has 4 Gold Coins.\n" +
            "Pat is the current player\n" +
            "They have rolled a 4\n" +
            "Pat is not getting out of the penalty box\n" +
            "Sue is the current player\n" +
            "They have rolled a 1\n" +
            "Sue is getting out of the penalty box\n" +
            "Sue's new location is 1\n" +
            "The category is Science\n" +
            "Science Question 6\n" +
            "Answer was correct!!!!\n" +
            "Sue now has 5 Gold Coins.\n" +
            "Chet is the current player\n" +
            "They have rolled a 2\n" +
            "Chet is not getting out of the penalty box\n" +
            "Pat is the current player\n" +
            "They have rolled a 4\n" +
            "Pat is not getting out of the penalty box\n" +
            "Sue is the current player\n" +
            "They have rolled a 5\n" +
            "Sue is getting out of the penalty box\n" +
            "Sue's new location is 6\n" +
            "The category is Sports\n" +
            "Sports Question 2\n" +
            "Answer was correct!!!!\n" +
            "Sue now has 6 Gold Coins.";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        GameRunner.main(null);

    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }
	@Test
	public void true_is_true() {
        assertThat(outContent).isEqualTo(OUTPUT);
	}
}
