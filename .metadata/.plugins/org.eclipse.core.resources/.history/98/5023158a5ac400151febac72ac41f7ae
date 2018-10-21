
public class Villains {
	
	private String villainName;
	private int numberOflives;
	private int numberOfKills;
	private String weapon;
	
	public void setVillain (String newVillain)
	{
		villainName = newVillain;
	}
	public String getVillian()
	{
		return villainName;
	}
	public void setLives (int newLives)
	{
		numberOflives = newLives;
	}
	public int getLives()
	{
		return numberOflives;
	}
	public void setKills (int newKills)
	{
		numberOfKills = newKills;
	}	
	public int getKills()
	{
		return numberOfKills;
	}
	public void setWeapon (String newWeapon)
	{
		weapon = newWeapon;
	}
	public String getWeapon()
	{
		return weapon;
	}
	
	public void kill(){
		if (numberOflives == 0)
		System.out.println("The villain is dead, cannot kill! ");
		else 
		numberOfKills++;
	}
	
	public void attack(Villains badguy){
		badguy.setLives(badguy.getLives()-1);
		if (badguy.getLives()== 0)
			numberOfKills++;
	
		System.out.println(villainName + " killed " + badguy.villainName  + " with a " + weapon);
	}

	
	public void display(){
		System.out.println("Name: " +villainName);
		System.out.print("Lives: ");
		
		if (numberOflives <= 0)
			System.out.print("0");
		else
		for (int newLives = 1; newLives <= numberOflives; newLives++)
		{
			System.out.print("<3");
		}
		System.out.print("\n");
		
		System.out.print("Kills: ");
		for (int newKills = 1; newKills <= numberOfKills; newKills++)
		{
			System.out.print("X");
		}
		
		System.out.print("\n");
		System.out.println("Weapon: " + weapon);
		System.out.print("Status: ");
		
		if (numberOflives > 0)
			System.out.print("Alive");
		else 
			System.out.print("Dead");
		System.out.print("\n");
		
		}
	}




