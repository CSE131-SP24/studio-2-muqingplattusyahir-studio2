package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("the amount of money that you start with");
	double startAmount = in.nextDouble();
	System.out.println("the win probability, or the probability you win a single play");
	double winChance = in.nextDouble();
	System.out.println("win limit");
	double winLimit = in.nextDouble();
	System.out.println("how many days are you playing");
	double totalSimulations = in.nextInt();
	int plays = 0;
	int days = 0;
	double losses = 0;
	double wins = 0;
		
	
	double balance = startAmount;
	while (days < totalSimulations) {
		while (balance < winLimit && balance > 0) {
			double odds = (Math.random());
			if (winChance > odds) {
				balance++;
				plays++;
			}
			else {
				balance--;
				plays++;
			}
			
		}

		days++;
		System.out.println("Day " + days + ": " + balance + "$ in " + plays + " plays");
		if (balance == 0.0) {
			losses++;
			
		}
		
		if (balance == winLimit) {
			wins++;
		}
		
		
		plays = 0;
		balance = startAmount;
	}
		
	if (balance == 0.0) {
		System.out.println("you lost all your money");
		
	}
	if (balance == winLimit) {
		System.out.println("you ended with " + winLimit + "$");
	}
	if (days == totalSimulations) {
		System.out.println("stop");
	}
	double ruinRate = (losses / totalSimulations);
	System.out.println("Ruin Rate from Simulation: " + (ruinRate * 100) + "%");

}
}
