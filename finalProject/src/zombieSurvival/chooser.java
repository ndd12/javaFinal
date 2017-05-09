package zombieSurvival;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class chooser {
	static boolean shotLanded;
	public static void grabGun() throws InterruptedException{
		Random rand = new Random();
		Scanner reader = new Scanner(System.in);
		System.out.println("You see a gun on the table. Do you grab it? (1 = Yes, 0 = No)");
		System.out.println("\n\n\n\n\n\n\n\n");
		int choice = reader.nextInt();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		if (choice == 0){
			System.out.println("Woah you're not smart. The zombie totally just ate you.");
		}
		else if(choice == 1){
			System.out.println("To survive, you must reenter the number that will pop up in 1 second");
			System.out.println("\n\n\n\n\n\n\n\n");
			TimeUnit.SECONDS.sleep(3);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		}
		int n = rand.nextInt(90000)+10000;
		System.out.println(n);
		System.out.println("\n\n\n\n\n\n\n\n");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("To see if your shot hit the zombie, type in the number you just saw.");
		System.out.println("\n\n\n\n\n\n\n\n");
		int repeatNumber = reader.nextInt();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		if(repeatNumber == n){
			System.out.println("Congratulations, the shot landed!");
			System.out.println("\n\n\n\n\n\n\n\n");
			shotLanded = true;
		}
		else{
			System.out.println("The shot missed! You died a very slow and painful death. ");
			System.out.println("\n\n\n\n\n\n\n\n");
		}
		
	}
}
