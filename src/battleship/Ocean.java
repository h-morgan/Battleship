package battleship;

public class Ocean {
	Ship[][] ship = new Ship[20][20];
	int shotsFired;
	int hitCount;
	int shipsSunk;
	
	public Ocean() {
		this.shotsFired = 0;
		this.hitCount = 0;
		
		
	}

}
