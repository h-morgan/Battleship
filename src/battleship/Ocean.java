package battleship;

import java.util.Random;

public class Ocean {
	Ship[][] ship = new Ship[20][20];
	int shotsFired;
	int hitCount;
	int shipsSunk;
	
	// Constructor - fills ship array with bunch of EmptySea instances
	public Ocean() {
		this.shotsFired = 0;
		this.hitCount = 0;
		this.shipsSunk = 0;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				EmptySea empty = new EmptySea();
				empty.okToPlaceShipAt(i, j, true, this);
			}
		}
	}
	
	
	/**
	 * Place all ships randomly on the (initially) empty ocean
	 * Place larger ships before smaller ones
	 */
	public void placeAllShipsRandomly() {
		Random random = new Random();
		//first, initialize a wrist of 
		
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
