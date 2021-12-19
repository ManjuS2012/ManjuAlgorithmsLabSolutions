package com.gratelearning.service;

public class NotesCount {
	public static void notesCountImplementation(int notes[], int amount) {
		int N[] = new int[notes.length];
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					N[i] = amount / notes[i];
					amount = amount - (N[i] * notes[i]);
				}
			}
			if (amount > 0) {
				System.out.println("Correct amount should be given");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be : ");
				for (int i = 0; i < notes.length; i++) {
					if (N[i] != 0) {
						System.out.println("Minimum notes = " + notes[i] + ":" + N[i]);
					}
				}
			}
		} catch (ArithmeticException ex) {
			System.out.println(ex + "Denominations greater than 0");
		}
	}

}
