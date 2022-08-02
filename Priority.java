public interface Priority {

	// Sets the priority.
	public void setPriority(int priority);
	
	// Gets the priority and compare to Task.
	public int getPriority();
	
	//Level of Priority
	public static int MIN_PRIORITY = 1;
	public static int MED_PRIORITY = 5;
	public static int MAX_PRIORITY = 10;
	
}//end interface
