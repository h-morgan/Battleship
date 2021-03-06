package battleship;

import java.util.Arrays;

public class Cruiser extends Ship {
	public Cruiser() {
		this.setLength(6);
		this.setHit(new boolean [6]);
		Arrays.fill(this.getHit(), false);
	}

	@Override
	String getShipType() {
		return "Cruiser";
	}

}
