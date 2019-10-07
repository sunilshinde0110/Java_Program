package com.joptionpane.prac;

import javax.swing.JOptionPane;

public class EMICalculation {

	public static void main(String[] args) {

		int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter Amount You Want To Calculate EMI"));
		float rate = Integer.parseInt(JOptionPane.showInputDialog("Enter Rate Of Interest"));
		int month = Integer.parseInt(JOptionPane.showInputDialog("Enter Month "));
		
		rate = rate/(12*100);
		
		float emi = (float) ((amount*rate*Math.pow(1+rate, month))/(Math.pow(1+rate, month)-1));
		
		
		JOptionPane.showMessageDialog(null, "Your EMI For Per Month Is:- "+String.valueOf(emi)+"Rs");
		
		
	}

}
