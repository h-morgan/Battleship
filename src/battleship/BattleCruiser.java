package battleship;

import java.util.Arrays;

public class BattleCruiser extends Ship {
	public BattleCruiser() {
		this.setLength(7);
		this.setHit(new boolean [7]);
		Arrays.fill(this.getHit(), false);
	}

	@Override
	String getShipType() {
		return "Battle Cruiser";
	}

}
