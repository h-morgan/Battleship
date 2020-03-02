package battleship;

import java.util.Arrays;

public class Tests {

	public static void main(String[] args) {
		Ship x = new BattleShip();
		System.out.println("Ship type: " + x.getShipType());
		System.out.println("Length: " + x.getLength());
		System.out.println(Arrays.toString(x.getHit()));

		Ocean o = new Ocean();
		if (x.okToPlaceShipAt(18, 19, true, o)) {
			System.out.println("ok to place");
		} else {
			System.out.println("not ok to place");
		}
	}

}
