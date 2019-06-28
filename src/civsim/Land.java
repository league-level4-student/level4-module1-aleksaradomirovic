package civsim;

import java.util.Random;

public class Land {
	int id;
	
	int water, climate;
	
	int hdi;
	
	public Land(int id) {
		this.id = id;
		
		Random rng = new Random();
		
		water = rng.nextInt(100);
		climate = rng.nextInt(100);
		HDI();
		
		System.out.println("Region "+id+": HDI = "+hdi+", Climate = "+climate+", Water = "+water);
	}
	
	public int HDI() {
		return (hdi = (water+climate)*5);
	}
}
