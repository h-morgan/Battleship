package battleship;

import java.util.Arrays;

public class Tests {

	public static void main(String[] args) {
		Ship x = new BattleShip();
		System.out.println("Ship type: " + x.getShipType());
		System.out.println("Length: " + x.getLength());
		System.out.println(Arrays.toString(x.getHit()));


	}

}
