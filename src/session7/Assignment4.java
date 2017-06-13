package session7;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initializing scanner input using object

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the date, month and year");
		// prints Enter the date, month and year

		String dateFormat = s.nextLine();// getting String input

		s.close();// closing Scanner object

		// initializing String variable date

		String date = "";

		// initializing String variable year

		String year = "";

		// initializing String variable yearFormat

		String yearFormat = "";

		// getting character at particular index

		date += dateFormat.charAt(0);

		// checks given index is digit

		if (Character.isDigit(dateFormat.charAt(1)) == true) {

			date += dateFormat.charAt(1);
			// getting character at particular index

		}

		// loop to get year from a String variable

		for (int i = dateFormat.length() - 4; i < dateFormat.length(); i++) {

			year += dateFormat.charAt(i);
			// getting character at particular index

		}

		// Adding date year and month in a String variable
		yearFormat += year + dateFormat.replaceAll("\\d", "") + date;

		System.out.println(yearFormat);
		// prints YYYY, MM, DD

	}
}
