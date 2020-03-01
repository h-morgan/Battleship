package battleship;

public class Ocean {
	Ship[][] ship = new Ship[20][20];
	int shotsFired;
	int hitCount;
	int shipsSunk;
	
	// Constructor
	public Ocean() {
		this.shotsFired = 0;
		this.hitCount = 0;
	}
	
	public void placeAllShipsRandomly() {
		
	}
	
	public boolean isOccupied(int row, int column) {
		return true;
	}
	
	
	public boolean shootAt(int row, int column) {
		return true;
	}
	
	
	public int getShotsFire() {
		return shotsFired;
	}
	
	
	public int getHitCount() {
		return hitCount;
	}
	
	
	public int getsShipsSunk() {
		return shipsSunk;
	}
	
	
	public boolean isGameOver() {
		return false;
	}
	
	
	public Ship[][] getShipArray() {
		return ship;
	}
	
	public void print() {
		
	}

}
