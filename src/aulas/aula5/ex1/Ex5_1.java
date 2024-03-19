package aulas.aula5.ex1;

import java.util.Scanner;
import aulas.aula5.Util;

public class Ex5_1 {

    public static void main(String[] args){
        int input;
		Date date = new Date(1, 1, 2000);
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Date operations:");
			System.out.println("1 - create new date");
			System.out.println("2 - show current date");
			System.out.println("3 - increment date");
			System.out.println("4 - decrement date");
			System.out.println("0 - exit");

			input = Util.getInt("Escolha uma operação: ", sc);

			switch (input) {
				case 1:
					int day = Util.getInt("Day: ", sc, 1, 31);
					int month = Util.getInt("Month: ", sc, 1, 12);
					int year = Util.getInt("Year: ", sc);

					date = new Date(day, month, year);
					System.out.println("Created date: " + date);
					break;

				case 2:
					System.out.println("Current date: " + date.toString());
					break;

				case 3:
					date.increment();
					System.out.println("Increased date: " + date);
					break;

				case 4:
					date.decrement();
					System.out.println("Decreased date: " + date);
					break;

				case 0:
					break;
			}
		} while (input != 0);
    }
}
