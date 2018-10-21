public class Halloween2 {

	public static void main(String[] args) {

		System.out.println("-----------------------------------------");
		System.out.println("^^^^^^^^^^^Happy Halloween!^^^^^^^^^^^^^^");
		System.out.println("-----------------------------------------");

		// instance method of new villain
		Villains joker = new Villains();

		// mutating methods in villain to joker specifications
		joker.setVillain("Joker");
		joker.setLives(2);
		joker.setKills(4);
		joker.setWeapon("Psychotic Mind");
		joker.display();
		Villains2.getCounter();
		System.out.println("-----------------------------------------");

		Villains darthVader = new Villains();
		darthVader.setVillain("Darth Vader");
		darthVader.setLives(1);
		darthVader.setKills(5);
		darthVader.setWeapon("Lightsaber");
		Villains2.getCounter();
		darthVader.display();

		System.out.println("-----------------------------------------");

		joker.attack(darthVader);

		System.out.print("\n");

		joker.display();

		System.out.println("-----------------------------------------");

		darthVader.display();

		System.out.println("-----------------------------------------");

		darthVader.kill();
		joker.kill();
		System.out.println("-----------------------------------------");

		darthVader.display();

		System.out.println("-----------------------------------------");
		// ///////////////Assignment 6 ///////////////

		Villains2 Villains2object = new Villains2("Venom", "Web", 2, 6);
		Villains2object.display();

		System.out.println("-----------------------------------------");

		Villains2 Villains2object2 = new Villains2("Bane", "Inhuman Strength",
				3, 4);
		Villains2object2.display();
		System.out.println("_________________________________________");
		System.out.println("Total Villains: " + Villains2.getCounter());
	}

}
