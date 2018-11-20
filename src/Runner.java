public class Runner {
	/**
	 * Returns the results of a run in the form of an array
	 * 
	 * @param cNum the number of columns in the slot machine
	 * @return the results of a single run of a slot machine
	 */
	public static String[] run(int cNum, String[] rolls) {
		Column column = new Column(rolls);
		
		String[] result = new String[cNum];
		
		for (int i = 0; i<cNum; i++){
			result[i] = column.result();
		}
		
		return result;
	}
	
	/**
	 * Returns if the array passed in is considered a winning run
	 * 		Winning means that all of the columns in the run are the same thing
	 * 
	 * @param result the resluts from a run to be checked if it won
	 * @return if the array passed in is considered a winning run
	 */
	public static boolean won(String[] result) {
		String first = result[0];
		
		for(int i =1; i < result.length; i++) {
			if(!result[i].equals(first)) return false;
		}
		
		return true;
	}
}
