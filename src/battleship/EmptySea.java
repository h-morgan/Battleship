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
	
	/**
	 * This method overrides shootAt() inherited from ship
	 * Always returns false to indicate that nothing was hit
	 */
	@Override
	public boolean shootAt(int row, int column) {
		this.getHit()[0] = true;
		return false;
	}
	
	/**
	 * This method overrides isSunk() that is inherited from Ship
	 * Always returns false to indicate that you didn't sink anything
	 */
	@Override
	public boolean isSunk() {
		return false;
	}
	
	/**
	 * Returns single-character String to use in Ocean's print method
	 */
	@Override
	public String toString() {
		if (this.getHit()[0] == true) {
			return "-";
		} else {
			return "*";
		}
	}

}
