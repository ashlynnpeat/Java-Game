
import java.util.Scanner;

public class Game {

	private String GameName = " 'The Darkness' ";
	private String Player;
	private int age;
	private String A, B, C, D;
	private String choice;
	private String Thanks = "Thanks for playing" + GameName;

	static Scanner s = new Scanner(System.in);

	public boolean ageCheck() {
		while (age > 16) {
			say("Enjoy the game");
			startGame();
			return true;
		}
		say("You are too young for this game - get good scrub");
		AgeRestriction();
		return false;
	}

	public Game(String playerName, int age) {
		this.age = age;
		Player = playerName;
	}

	public static void say(String phrase) {
		System.out.println(phrase);
	}

	public void startGame() {
		say("Welcome to" + GameName + Player + ".\n" + "You have awoken in a dark room, find your way out.\n"
				+ "You find there is no power, and a small amount of sunlight is shining through the blinds of the small window on the wall.");
		firstChoice();
	}

	public void firstChoice() {
		say("\nWhat do you want to do?");
		A = "Get up and look around";
		B = "Stay in the hospital bed, not moving\n";
		C = "Look out the window";
		
		say("A: " + A);
		say("B: " + B);
		choice = s.next();
		choice = choice.toUpperCase();
		if (choice.equals("A")) {
			say("You stand up and look around, seeing a few cabinets in your room, should you search them? \n"
					+ "You also see some clothes that may belong to you, and a door. \n"
					+ "What do you want to do first?");
		} else if (choice.equals("B")) {
			say("You'll never get out of here without doing something " + Player + "!\n\n"
					+ "You look around, seeing a few cabinets in your room, should you search them? \n"
					+ "You also see some clothes that may belong to you, and a door. \n"
					+ "What do you want to do first?");
					
		} else if(choice.equals("C"));
		  say("You look up ")
		
		
		else {
			say("Invalid choice.");
			firstChoice();
		}
		secondChoice();
	}

	public void secondChoice() {
		A = "Open the door and leave the room";
		B = "Search the cabinets";
		C = "Search the clothes for supplies and change into them";
		say("A: " + A);
		say("B: " + B);
		say("C: " + C);
		choice = s.next();
		choice = choice.toUpperCase();
		if (choice.equals("A")) {
			say("The door is locked.\n" + "You need a key for the door, you should probably search for supplies.\n\n");
			A = "Put on your clothes";
			B = "Search the cabinets";
			say("A: " + A);
			say("B: " + B);
			choice = s.next();
			choice = choice.toUpperCase();
			if (choice.equals("A")) {
				say("You put on your clothes, finding nothing inside the pockets, "
						+ "and you stick the wallet in your back pocket" + "Do you want to search the cabinets now?");
				A = "yes";
				B = "No";
				say("A: " + A);
				say("B: " + B);
				choice = s.next();
				choice = choice.toUpperCase();
				if (choice.equals("A")) {
					say("You search the cabinets and find a flashlight with a pack of batteries, and a wallet. \n"
							+ "Inside the wallet is identification for you.\n\n" + "It reads: " + "\nName: " + Player
							+ "\nAge: " + age
							+ "\nIn some other cabinets you find a bag and put the flashlight in with the batteries.");
				} else if (choice.equals("B")) {
					say(" The door is locked.\n\n"
							+ "You need a key for the door, you should probably check the cabinets.\n\n"
							+ "You search the cabinets and find a flashlight with a pack of batteries, and a wallet. \n"
							+ "Inside the wallet is identification for you.\n\n" + "It reads: " + "\nName: " + Player
							+ "\nAge: " + age
							+ "\nIn some other cabinets you find a bag and a key, putting your supplies in the bag."
							+ "now to the door");
				}
				else {
				  say("Invaild choice");
				  secondChoice();
				}
			}

		} else if (choice.equals("B")) {
			say("You search the cabinets and find a flashlight with a pack of batteries, and a wallet. \n"
					+ "Inside the wallet is identification for you.\n\n" + "It reads: " + "\nName: " + Player
					+ "\nAge: " + age
					+ "\nIn some other cabinets you find a bag and a key, putting your supplies in the bag."
					+ "\nDo you want to take your clothes now?");
			A = "yes";
			B = "No";
			say("A: " + A);
			say("B: " + B);
			choice = s.next();
			choice = choice.toUpperCase();
			if (choice.equals("A")) {
				say("You put on your clothes, finding nothing inside the pockets, "
						+ "and you stick the wallet in your back pocket");
			} else if (choice.equals("B")) {
				say(" You might want to put some clothes on, instead of roaming in a hospital gown."
						+ "You put on your clothes, finding nothing inside the pockets, "
						+ "and you stick the wallet in your back pocket");
			}

		} else if (choice.equals("C")) {
			say("You put on your clothes, finding nothing inside the pockets, "
					+ "and you stick the wallet in your back pocket" + "DO you want to search the cabinets now?");
			A = "Yes";
			B = "No";
			say("A: " + A);
			say("B: " + B);
			choice = s.next();
			choice = choice.toUpperCase();
			if (choice.equals("A")) {
				say("You search the cabinets and find a flashlight with a pack of batteries, and a wallet. \n"
						+ "Inside the wallet is identification for you.\n\n" + "It reads: " + "\nName: " + Player
						+ "\nAge: " + age
						+ "\nIn some other cabinets you find a bag and put the flashlight in with the batteries.");
			} else {
				say(" The door is locked.\n\n"
						+ "You need a key for the door, you should probably check the cabinets.\n\n"
						+ "You search the cabinets and find a flashlight with a pack of batteries, and a wallet. \n"
						+ "Inside the wallet is identification for you.\n\n" + "It reads: " + "\nName: " + Player
						+ "\nAge: " + age
						+ "\nIn some other cabinets you find a bag and a key, putting your supplies in the bag."
						+ "now to the door");
			}
		}
		hallway();
	}

	public void hallway() {
		say("hallway");
		say("It's a dark, damp hallway, you see 5 doorways.");
		thirdChoice();

	}
	
	public static thridChoice() {
	    A = ("Move to next door");
	    B = ("Go back into previous door");
	    
	    say("A:" + A);
	    say("B:" + B);
	    choice = s.next();
	    choice = choice.toUpperCase();
	    if choice.equals("A")) {
	        say ("You moved up into the next door, the door is covered in blood from the window. Inside the window it seems to be all black /n");
	        
	      firstRoom();
	     
	    } else if (choice.equals("B")) {
	        say("You went back into the room from which you came from");
	        secondchoice();
	    }
	}
	
    public static firstRoom() {
        say("It's completely black, you smell an odor that smells like human flesh")
        forthChoice();
    }
    
    
    
    
    
    public static forthChoice() {
        A = ("Search the room");
        B = ("Go back to hallway");
        
        say("A:" + A);
        say("B:" + B);
        choice = s.next();
        choice = choice.toUpperCase();
        if choice.equals("A") {
             say("You begin to search in the room"); 
            if player.has("Lamp") {
                say("You use your lamp to light up the room. You see a lot of chairs and desk, almost a school setting" /n );
                forthChoiceA;
                else if {
                  say("You being walking into the dark room, you start to hear voices and laughing. You lose control of your body." /n "You feel your limbs being chopped off.");
                  End();
                }
             }
            
        } else if choice.equals("B") {
          say("You go back into the Hallway")
          hallway();
        }
        
    public static forthChoiceA{
        A = ("Go to the front");
        B = ("Go back into hallway")
        say("A:" + A);
        say("B:" + B);
        choice = s.next();
       
        choice = choice.toUpperCase();
        
     } 
    }
     
     
     
  
  
  
	public void AgeRestriction() {
		String HI = "";
		for (int i = 1; i <= age; i++) {
			HI += i;
			say(HI);
		}

	}

	public String toString() {
		ageCheck();
		// startGame();
		return Thanks;
	}
	
	public static End(){
	    say("You have died, thanks for playing! Sorry if you got spooked :( ");
	    
	}

	public static void main(String args[]) {

		String name = "";
		int age;
		say("Please enter your name");
		name.equals(s.next());
		say("Please enter your age");
		age = s.nextInt();
		Game test = new Game(name, age);
		System.out.println(test);
	}
}