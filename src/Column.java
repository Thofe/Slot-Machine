public class Column {
	private String[] rolls;
	
	/**
	 * Creates a column class
	 * 
	 * @param rolls the possiable rolls of a column on a slot machine
	 */
	public Column(String[] rolls) {
		this.rolls = rolls;
	}
	
	/**
	 * Returns the thing rolled by a single column
	 * 
	 * @return the thing rolled by a single column
	 */
	public String result() {
		int index = (int)(Math.random()* rolls.length);
		return rolls[index];
	}
}
