package battleship;

import java.util.Arrays;

public class Submarine extends Ship {
	public Submarine() {
		this.setLength(3);
		this.setHit(new boolean[3]);
		Arrays.fill(this.getHit(), false);
	}

	@Override
	String getShipType() {
		return "Submarine";
	}

}
