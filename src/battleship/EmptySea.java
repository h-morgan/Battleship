package battleship;

import java.util.Arrays;

public class EmptySea extends Ship {
	public EmptySea() {
		this.setLength(1);
		this.setHit(new boolean [1]);
		Arrays.fill(this.getHit(), false);
	}

	@Override
	String getShipType() {
		return "empty";
	}

}
