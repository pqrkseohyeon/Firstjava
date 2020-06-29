package inheritance;

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel1(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel1(sLevel);
		player.play(3);
	}

}
