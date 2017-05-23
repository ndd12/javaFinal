package zombieSurvival;

import java.util.Arrays;
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
	
	/*	center();
		print("You have woken up inside of a mysterious room with no light.");
		Screen.waitClear(3);
		print("You hear a loud bang at the door. ");
		center();
		Screen.waitClear(3);
		grabGun();
		if(alive = false){
			print("Your survivor score this round was: " + survivorScore);
		}
		else{
		print("You've noticed you're incredibly hungry, so you go to look for food.");
		center();
		waitClear(3);
		getFood(); */
		nextLocation();
		}
	//}
	
	public static void nextLocation() throws InterruptedException{
	 String[] firstLocations = {"the Church", "the Grocery Store","the Mall","the Police station"};
		waitClear(3);
		print("Now that you are fed, where do you want to go to look for supplies? ");
		center();
		waitClear(2);
		boolean okChoice = false;
		while(okChoice == false){
		print("Your choices are: " + Arrays.toString(firstLocations));
		center();
		String choice = reader.next();
		if(firstLocations[0].toLowerCase().contains(choice.toLowerCase())){
			waitClear(1);
			print("That's a pretty safe choice.");
			center();
			church();
			okChoice=true;
		}
		else if(firstLocations[1].toLowerCase().contains(choice.toLowerCase())){
			waitClear(1);
			print("Smart. Go get some food. Surely nothing can go wrong.");
			center();
			groceryStore();
			okChoice=true;
		}
		else if(firstLocations[2].toLowerCase().contains(choice.toLowerCase())){
			waitClear(1);
			print("Dude that's pretty risky. But you can probably get some sweet supplies. ");
			center();
			mall();
			okChoice=true;
		}
		else if(firstLocations[3].toLowerCase().contains(choice.toLowerCase())){
			waitClear(1);
			print("That is very dangerous. But you will be set on ammo if you can pull it off.");
			center();
			okChoice=true;
		}
		else{
			okChoice = false;
		}
	}
		
	}
	public static void mall() throws InterruptedException{
		Random rand = new Random();
		int riskLevel = rand.nextInt(10)+1;
		int fightBack = rand.nextInt(100)+1;
		waitClear(3);
		if(riskLevel >= 3){
			print("When you arrive at the mall, you encounter a raider");
			center();
			waitClear(3);
			print("He demands half of your food supplies(Nutrition Level)");
			center();
			waitClear(3);
			print("Do you try to fight or just give him some of your food? ");
			print("Current Nutrition Level: "+ nutritionLevel);
			print("Chance of Success on Fight: 60%");
			center();
			String choice = reader.next();
			if(choice.toLowerCase().equals("fight")){
				if(fightBack > 60){
					waitClear(1);
					nutritionLevel -= nutritionLevel/2;
					print("You shouldn't have tried to fight back.");
					print("You lost half of your food supply.");
					print("Your nutrition level is now: " + nutritionLevel);
					center();
				}
				else{
					print("Damn! You killed him, and tripled your food supply!");
					center();
				}
			}
		}
	}
	public static void groceryStore() throws InterruptedException{
		Random rand = new Random();
		int riskLevel = rand.nextInt(10)+1;
		int fightBack = rand.nextInt(100)+1;
		waitClear(3);
		if(riskLevel >= 5){
			print("When you arrive at the grocery store, you encounter a raider.");
			center();
			waitClear(3);
			print("He demands half of your food supplies(Nutrition Level)");
			center();
			waitClear(3);
			print("Do you try to fight or just give him some of your food? ");
			print("Current Nutrition Level: "+ nutritionLevel);
			print("Chance of Success on Fight: 60%");
			center();
			String choice = reader.next();
			if(choice.toLowerCase().equals("fight")){
				if(fightBack > 60){
					waitClear(1);
					nutritionLevel -= nutritionLevel/2;
					print("You shouldn't have tried to fight back.");
					print("You lost half of your food supply.");
					print("Your nutrition level is now: " + nutritionLevel);
					center();
				}
				else{
					print("Damn! You killed him, and tripled your food supply!");
					center();
				}
			}
		}
		else{
			print("You got lucky! \nYou didn't encounter any problems and doubled your food!");
			center();
		}
	}
	public static void church() throws InterruptedException{
		Random rand = new Random();
		int churchGain = rand.nextInt(3)+1;
		nutritionLevel+=churchGain;
		waitClear(3);
		print("You arrive at the church safely. ");
		center();
		waitClear(2);
		print("You find a couple slices of bread.\nYour nutrion level increases by "+churchGain+" points to "+nutritionLevel);
		center();
	}
	public static void grabGun() throws InterruptedException{
		Random rand = new Random();
		
		print("You see a gun on the table. \nDo you grab it or try to fight the zombie with your fists? \nRemember, you only have 10 bullets. \n(1 = Gun, 0 = Fists)");
		center();
		int choice = reader.nextInt();
		waitClear(1);
		if(choice == 100){
			print("skipped");
			center();
			TimeUnit.SECONDS.sleep(1);
		}
		if (choice == 0){
			print("Alright Rocky Balboa.");
			center();
			TimeUnit.SECONDS.sleep(2);
			print("You need to land 3 hits in a row to survive. \nHere is your first number: ");
			center();
			waitClear(3);
			int n1 = rand.nextInt(90000)+10000;
			print(n1);
			center();
			waitClear(1);
			print("To see if your first swing hit the zombie, type in the number you just saw.");
			center();
			int repeatNumber1 = reader.nextInt();
			waitClear(1);
				if(repeatNumber1 == n1){
					survivorScore += 75;
					print("Not too bad. Here is your second number: ");
					center();
					waitClear(3);
					int n2 = rand.nextInt(90000)+10000;
					print(n2);
					center();
					waitClear(1);
					print("To see if your second swing hit the zombie, type in the number you just saw.");
					center();
					int repeatNumber2 = reader.nextInt();
					waitClear(1);
						if(repeatNumber2==n2){
							survivorScore += 75;
							print("Almost there. Here is your third number number: ");
							center();
							waitClear(3);
							int n3 = rand.nextInt(90000)+10000;
							print(n3);
							center();
							waitClear(1);
							print("To see if your third swing hit the zombie, type in the number you just saw.");
							center();
							int repeatNumber3 = reader.nextInt();
							waitClear(1);
								if(repeatNumber3 == n3){
									survivorScore += 75;
									print("That's pretty damn good. \nYou killed the zombie and kept all 10 bullets.");
									center();
									waitClear(3);
								}
								else{
									print("You almost had him, but you're still super dead");
									waitClear(3);
									alive = false;
								}
						}
						else{
							print("Almost a respectable attempt. But you've died.");
							waitClear(3);
							alive = false;
						}
						
				}
				else{
					print("Not even one hit landed. Hit the gym and try again. ");
					waitClear(3);
					alive = false;
				}
		}
		else if(choice == 1){
			print("To survive, you must reenter the number that will pop up in 1 second");
			center();
			waitClear(3);
			int n = rand.nextInt(90000)+10000;
			print(n);
			center();
			waitClear(1);
			print("To see if your shot hit the zombie, type in the number you just saw.");
			center();
			int repeatNumber = reader.nextInt();
			waitClear(1);
			if(repeatNumber == n){
			print("Congratulations, the shot landed!");
			center();
			survivorScore += 100;
			shotLanded = true;
			alive = true;
			ammo--;
		}
		else{
			print("The shot missed! You died a very slow and painful death. ");
			center();
			survivorScore+=10;
			alive = false;
			}
		}
	
		
		
		
	}
	public static void waitClear(int seconds) throws InterruptedException{
		TimeUnit.SECONDS.sleep(seconds);
		print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	public static void center(){
		print("\n\n\n\n\n\n\n\n");
	}
	public static void getFood() throws InterruptedException{
		Random rand = new Random();

		
		String[] goodFoods = {"an apple", "some beef jerky", "a granola bar"};
		String[] badFoods = {"a candy bar", " a cupcake", "a bag of potato chips"};
		
		int goodFoodNumber = rand.nextInt(3);
		int badFoodNumber = rand.nextInt(3);
		print("You go into the kitchen of this weird house and find a few food items.");
		center();
		waitClear(3);
		print("The first food item you notice is " + goodFoods[goodFoodNumber]);
		center();
		waitClear(3);
		print("The second food item you notice is " + badFoods[badFoodNumber]);
		center();
		waitClear(3);
		print("Which of these two food items would you like?");
		String choice = reader.next();
		if(goodFoods[goodFoodNumber].contains(choice))
		{
			nutritionLevel += 10;
			survivorScore += 15;
			waitClear(1);
			print("Good choice. Your nutrition level just increased to "+ nutritionLevel);
			center();
		}
		else if(badFoods[badFoodNumber].contains(choice))
		{
			nutritionLevel -= 10;
			waitClear(1);
			print("God you are dumb.");
			center();
			waitClear(2);
			print("Like");
			center();
			waitClear(2);
			print("Its the zombie apocalypse");
			center();
			waitClear(3);
			print("And you're gonna eat "+badFoods[badFoodNumber]+"?");
			center();
			waitClear(3);
			print("Fatty.");
			print("Youre nutrition level dropped to: " + nutritionLevel);
			center();
			
		}
	}
	public static void print(String str){
		System.out.println(str);
	}
	public static void print(int str){
		System.out.println(str);
	}
}
