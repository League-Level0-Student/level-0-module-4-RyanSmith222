package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String score =JOptionPane.showInputDialog(null, "Please enter your test score.");
	Double score2 = Double.parseDouble(score);
	
	if(score2 > 80) {
		JOptionPane.showMessageDialog(null, "Wow! You must have really studied for the test!");
	}
		
	else if(score2 > 50) {
		JOptionPane.showMessageDialog(null, "You did okay.");
	}
		
	else if(score2 > 20) {
		JOptionPane.showMessageDialog(null, "You should study more next time.");
	}
		
	else if(score2 > 20) {
		JOptionPane.showMessageDialog(null, "You should study more next time.");
	}	
		
	else if(score2 > 0) {
		JOptionPane.showMessageDialog(null, "Everyone can improve!");
	}	
		
	else if(score2 < 0) {
		JOptionPane.showMessageDialog(null, "Now, that should not be possible.");
	}	
		
	}

}
