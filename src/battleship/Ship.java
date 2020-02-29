package battleship;

public abstract class Ship {
	//abstract instance variables - to be defined in different ship instances
	//length and hit get initialized in specific ship type creation, other variables get set through methods
	private int bowRow;
	private int bowColumn;
	private int length;
	private boolean horizontal;
	private boolean[] hit;
	
	//getters and setters for instance variables
	public int getBowRow() {
		return bowRow;
	}
	public void setBowRow(int bowRow) {
	}
	public int getBowColumn() {
		return bowColumn;
	}
	public void setBowColumn(int bowColumn) {
		this.bowColumn = bowColumn;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean isHorizontal() {
		return horizontal;
	}
	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}
	public boolean[] getHit() {
		return hit;
	}
	public void setHit(boolean[] hit) {
		this.hit = hit;
	}
	
	//abstract methods - to be defined in subclasses
	abstract String getShipType();
	
	//regular methods - for all ships
	/**	
	 * Returns true if it is okay to put a ship of this length with its bow in this location, 
	 * With the given orientation, and false otherwise
	 * @param row
	 * @param column
	 * @param horizontal
	 * @param ocean
	 * @return
	 */
	public boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		return true;
	}
	

	/**
	 * "Puts" ship in the ocean 
	 * This involves going to bowRow, bowColumn, and horizontal instance variables
	 * Also involves putting a reference to the ship in each of 1 or more locations (up to 8)
	 * @param row - row to place ship in
	 * @param column - column to place ship in
	 * @param horizontal - true if orientation of ship is horizontal, else false
	 * @param ocean
	 */
	public void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {
	}
	
	/**
	 * If part of the ship occupies the given row and column, and the ship hasn't been sunk
	 * Mark that part of the ship as "hit" (in the array, 0 indicates the bow) 
	 * And return true, otherwise false
	 * @param row
	 * @param column
	 * @return
	 */
	public boolean shootAt(int row, int column) {
		return true;
	}
	
	
	/**
	 * @return true if every part of the ship has been hit, false otherwise
	 */
	public boolean isSunk() {
		return true;
	}
	
	/**
	 * Returns a single character string to use in the Ocean's print method
	 * Should return X if the ship has been sunk, S if it has not been sunk
	 * Can be used to print out locations in the ocean that have been shot at 
	 */
	@Override
	public String toString() {
		return "X";
	}
	
	
	
	
	
	

}
