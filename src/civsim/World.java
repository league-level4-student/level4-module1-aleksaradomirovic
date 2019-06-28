package civsim;

public class World {
	Land[] regions = new Land[25];
	
	public static void main(String[] args) {
		new World().run();
	}
	
	void run() {
		for(int i = 0; i < regions.length; i++) {
			regions[i] = new Land(i);
		}
	}
}
