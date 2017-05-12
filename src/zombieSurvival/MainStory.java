package zombieSurvival;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainStory {
		static boolean alive;
		static int survivorScore = 0;
		static boolean shotLanded;
		static int nutritionLevel = 75;
		static Scanner reader = new Scanner(System.in);
		
		static int ammo = 10;
	public static void main(String[] args) throws InterruptedException {
	
		center();
		System.out.println("You have woken up inside of a mysterious room with no light.");
		Screen.waitClear(3);
		System.out.println("You hear a loud bang at the door. ");
		center();
		Screen.waitClear(3);
		grabGun();
		if(alive = false){
			System.out.println("Your survivor score this round was: " + survivorScore);
		}
		else{
		System.out.println("You've noticed you're incredibly hungry, so you go to look for food.");
		center();
		waitClear(3);
		getFood();
		}
	}
	
	public static void grabGun() throws InterruptedException{
		Random rand = new Random();
		
		System.out.println("You see a gun on the table. \nDo you grab it or try to fight the zombie with your fists? \nRemember, you only have 10 bullets. \n(1 = Gun, 0 = Fists)");
		center();
		int choice = reader.nextInt();
		waitClear(1);
		
		if (choice == 0){
			System.out.println("Alright Rocky Balboa.");
			center();
			TimeUnit.SECONDS.sleep(2);
			System.out.println("You need to land 3 hits in a row to survive. \nHere is your first number: ");
			center();
			waitClear(3);
			int n1 = rand.nextInt(90000)+10000;
			System.out.println(n1);
			center();
			waitClear(1);
			System.out.println("To see if your first swing hit the zombie, type in the number you just saw.");
			center();
			int repeatNumber1 = reader.nextInt();
			waitClear(1);
				if(repeatNumber1 == n1){
					survivorScore += 75;
					System.out.println("Not too bad. Here is your second number: ");
					center();
					waitClear(3);
					int n2 = rand.nextInt(90000)+10000;
					System.out.println(n2);
					center();
					waitClear(1);
					System.out.println("To see if your second swing hit the zombie, type in the number you just saw.");
					center();
					int repeatNumber2 = reader.nextInt();
					waitClear(1);
						if(repeatNumber2==n2){
							survivorScore += 75;
							System.out.println("Almost there. Here is your third number number: ");
							center();
							waitClear(3);
							int n3 = rand.nextInt(90000)+10000;
							System.out.println(n3);
							center();
							waitClear(1);
							System.out.println("To see if your third swing hit the zombie, type in the number you just saw.");
							center();
							int repeatNumber3 = reader.nextInt();
							waitClear(1);
								if(repeatNumber3 == n3){
									survivorScore += 75;
									System.out.println("That's pretty damn good. \nYou killed the zombie and kept all 10 bullets.");
									center();
									waitClear(3);
								}
								else{
									System.out.println("You almost had him, but you're still super dead");
									waitClear(3);
								}
						}
						else{
							System.out.println("Almost a respectable attempt. But you've died.");
							waitClear(3);
						}
						
				}
				else{
					System.out.println("Not even one hit landed. Hit the gym and try again. ");
					waitClear(3);
				}
		}
		else if(choice == 1){
			System.out.println("To survive, you must reenter the number that will pop up in 1 second");
			center();
			waitClear(3);
			int n = rand.nextInt(90000)+10000;
			System.out.println(n);
			center();
			waitClear(1);
			System.out.println("To see if your shot hit the zombie, type in the number you just saw.");
			center();
			int repeatNumber = reader.nextInt();
			waitClear(1);
			if(repeatNumber == n){
			System.out.println("Congratulations, the shot landed!");
			center();
			survivorScore += 100;
			shotLanded = true;
			alive = true;
			ammo--;
		}
		else{
			System.out.println("The shot missed! You died a very slow and painful death. ");
			center();
			survivorScore+=10;
			alive = false;
			}
		}
	
		
		
		
	}
	public static void waitClear(int seconds) throws InterruptedException{
		TimeUnit.SECONDS.sleep(seconds);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	public static void center(){
		System.out.println("\n\n\n\n\n\n\n\n");
	}
	public static void getFood() throws InterruptedException{
		Random rand = new Random();

		
		String[] goodFoods = {"an apple", "some beef jerky", "a granola bar"};
		String[] badFoods = {"a candy bar", " a cupcake", "a bag of potato chips"};
		
		int goodFoodNumber = rand.nextInt(3);
		int badFoodNumber = rand.nextInt(3);
		System.out.println("You go into the kitchen of this weird house and find a few food items.");
		center();
		waitClear(3);
		System.out.println("The first food item you notice is " + goodFoods[goodFoodNumber]);
		center();
		waitClear(3);
		System.out.println("The second food item you notice is " + badFoods[badFoodNumber]);
		center();
		waitClear(3);
	}
}
