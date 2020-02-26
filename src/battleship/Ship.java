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
	
	abstract String getShipType();
	
	
	

}
