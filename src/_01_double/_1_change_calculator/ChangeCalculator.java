package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		String stringPen = JOptionPane.showInputDialog(null, "How many pennies do you have?");
		int intPen = Integer.parseInt(stringPen);
		
		String stringNic = JOptionPane.showInputDialog(null, "How many nickels do you have?");
		int intNic = Integer.parseInt(stringNic);
		
		String stringDim = JOptionPane.showInputDialog(null, "How many dimes do you have?");
		int intDim = Integer.parseInt(stringDim);
		
		String stringQua = JOptionPane.showInputDialog(null, "How many quarters do you have?");
		int intQua = Integer.parseInt(stringQua);
		
		int valPen = 1;
		
		
		int ans = intPen ;
				
				//+ (intNic*0.05) + (intDim*0.1) + (intQua*0.25);
		
		
		
		// Ask the user how many nickels they have

		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

