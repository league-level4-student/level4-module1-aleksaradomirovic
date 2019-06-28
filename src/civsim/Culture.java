package civsim;

public class Culture {
	//primary attributes
	int INT, CHR, WAR;
	
	//branched or secondary
	int LITERATURE; //CHR, boosts cultural growth in educated groups
	int ENGINEERING; //INT, boosts army strength
	int MILITANCY; //WAR, boosts charisma and stability when at war
	int THEISM; //low level boosts INT, high boosts CHR
}
