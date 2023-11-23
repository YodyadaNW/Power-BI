import java.util.*;
import java.io.*;

public class RegisMobile {
	private String name, phone;
	private int MainPro, extraPro[];

	void userRegis() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name : ");
		name = input.next();
		System.out.print("Enter phone number : ");
		phone = input.next();
		while (phone.startsWith("09")) {
			System.out.print("Enter phone number : ");
			phone = input.next();
		}

		showMainPromotion();
		System.out.print("Enter main promotion : ");
		MainPro = input.nextInt();
		while (MainPro != 1 && MainPro != 2) {
			System.out.print("Enter main promotion : ");
			MainPro = input.nextInt();
		}

		showExtraPromotion();
		int i = 0;
		// System.out.print("Enter extra promotion : ");
		// extraPro[i] = input.nextInt();
		extraPro = new int[3];
		while(true) {
			System.out.print("Enter extra promotion : ");
			extraPro[i] = input.nextInt();
			
			if (extraPro[i] != 1 && extraPro[i] != 2 && extraPro[i] != 3) {
				System.out.print("ERROR, Enter again : ");
				extraPro[i] = input.nextInt();
			} 
			
			else if (extraPro[i] == extraPro[i - 1]) {
				System.out.print("CHOOSE [" + (i + 1) + "] ALREADY, Enter again : ");
				extraPro[i] = input.nextInt();
			} else if (extraPro[i] == 0) {
				break;
			}
		}

		System.out.println();
		System.out.println("Do you want to enter again? :");
		String check = input.next();
		System.out.println("**********************************************");

	}

	void saveFile() throws IOException {
		PrintStream write = new PrintStream(new File("src//CustomerData.txt"));
		write.print(name);
		write.print(phone);
		write.print(MainPro);
		write.println(extraPro);
		write.close();
	}

	void showMainPromotion() {
		System.out.println("\nMAIN PROMOTION");
		System.out.println("[1] Call Buffet (199.-) [2] Internet Buffet (259.-)");
	}

	void showExtraPromotion() {
		System.out.println("\nEXTRA PROMOTION");
		System.out.println("[1] Call All Day (99.-) [2] Call All Night (79.-) [3] Net 5 Day (89.-)");
	}
}
