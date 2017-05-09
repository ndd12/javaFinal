package zombieSurvival;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainStory {
		static boolean alive;
		static int survivorScore = 0;
		static boolean shotLanded;
		static int ammo = 10;
	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("\n\n\n\n\n\n\n\n");
		System.out.println("You have woken up inside of a mysterious room with no light.");
		Screen.waitClear(3);
		System.out.println("You hear a loud bang at the door. ");
		System.out.println("\n\n\n\n\n\n\n\n");
		Screen.waitClear(3);
		grabGun();
		
	 System.out.println("Your survivor score this play through was: "+survivorScore);
	}
	
	public static void grabGun() throws InterruptedException{
		Random rand = new Random();
		Scanner reader = new Scanner(System.in);
		System.out.println("You see a gun on the table. \nDo you grab it or try to fight the zombie with your fists? \nRemember, you only have 10 bullets. \n(1 = Gun, 0 = Fists)");
		System.out.println("\n\n\n\n\n\n\n\n");
		int choice = reader.nextInt();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		if (choice == 0){
			System.out.println("Alright Rocky Balboa.");
			System.out.println("\n\n\n\n\n\n\n\n");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("You need to land 3 hits in a row to survive. \nHere is your first number: ");
			System.out.println("\n\n\n\n\n\n\n\n");
			TimeUnit.SECONDS.sleep(3);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");	
			int n1 = rand.nextInt(90000)+10000;
			System.out.println(n1);
			System.out.println("\n\n\n\n\n\n\n\n");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("To see if your first swing hit the zombie, type in the number you just saw.");
			System.out.println("\n\n\n\n\n\n\n\n");
			int repeatNumber1 = reader.nextInt();
			TimeUnit.SECONDS.sleep(1);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				if(repeatNumber1 == n1){
				System.out.println("Congratulations, the first hit landed!");
				System.out.println("\n\n\n\n\n\n\n\n");
				survivorScore += 100;
				shotLanded = true;
				alive = false;
				}
		}
		else if(choice == 1){
			System.out.println("To survive, you must reenter the number that will pop up in 1 second");
			System.out.println("\n\n\n\n\n\n\n\n");
			TimeUnit.SECONDS.sleep(3);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");	
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
			survivorScore += 100;
			shotLanded = true;
			alive = false;
		}
		else{
			System.out.println("The shot missed! You died a very slow and painful death. ");
			System.out.println("\n\n\n\n\n\n\n\n");
			survivorScore+=10;
			alive = false;
		}
		}
	
		
		
		
	}
}
