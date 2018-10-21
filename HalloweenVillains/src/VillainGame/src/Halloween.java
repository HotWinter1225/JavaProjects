
public class Halloween {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------------");
		System.out.println("^^^^^^^^^^^Happy Halloween!^^^^^^^^^^^^^^");
		System.out.println("-----------------------------------------");
		
		Heroes joker = new Heroes();
		joker.setVillain("Joker");
		joker.setLives(2);
		joker.setKills(4);
		joker.setWeapon("Psychotic Mind");
		joker.display();
		
		System.out.println("-----------------------------------------");
		
		Villains darthVader = new Villains();
		darthVader.setVillain("Darth Vader");
		darthVader.setLives(1);
		darthVader.setKills(5);
		darthVader.setWeapon("Lightsaber");
		darthVader.display();
		
		System.out.println("-----------------------------------------");
		
		joker.attack(darthVader);
		
		System.out.print("\n");
		
		joker.display();
		
		System.out.println("-----------------------------------------");
		
		darthVader.display();
		
		System.out.println("-----------------------------------------");
		
		darthVader.kill();
		
		darthVader.display();
	
	
	}

}
