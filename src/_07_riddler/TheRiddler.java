package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String guess=JOptionPane.showInputDialog(null, "What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it, you'll die?");
	
	// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(guess.equalsIgnoreCase("nothing")) {
	JOptionPane.showMessageDialog(null, "Correct");
	score++;
}  
		// 5. Otherwise, say "wrong" and tell them the answer
else{
	JOptionPane.showMessageDialog(null,"Wrong. The answer was Nothing!");
}
	JOptionPane.showMessageDialog(null, "The score is "+score);
		// 6. Add some more riddles
guess=JOptionPane.showInputDialog(null,"I follow you all the time, and copy your every move. What am I?");
if(guess.equalsIgnoreCase("Your shadow")) {
JOptionPane.showMessageDialog(null, "Correct");
score++;
		// 2. Make a pop up to show the score.
		
	}
JOptionPane.showMessageDialog(null,"The score is "+score);
	}}

