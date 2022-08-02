public class Process implements Priority{

	//Declare the variables
	public String processID;
	public int priority;
		
	public Process()
	{
		this.processID = "";
		this.priority = 0;
	}//end empty-argument constructor
	
	public Process(String processID, int priority) 
	{
		super();
		this.processID = processID;
		this.priority = priority;
	}// end preferred constructor
		
	//Getters and Setters
	
	public int getPriority() 
	{
		return priority;
	}//end getPriority

	public void setPriority(int priority) 
	{
		this.priority = priority;
	}//end setPriority
	
	public String getProcessID() 
	{
		return processID;
	}//end getProcess
	
	public void setProcessID(String processID) 
	{
		this.processID = processID;
	}//end setProcess

	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString
}//end class
