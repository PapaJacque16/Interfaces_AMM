public class Task implements Priority {
	
	protected Status status;
	protected String name;
	protected int priority;
		
	public Task()
	{
		this.name = "";
		this.priority = 0;
	}//end empty-argument constructor
		
	public Task(String name, int priority) 
	{
		super();
		this.name = name;
		this.priority = priority;
	}// end preferred constructor
			
	//Getters and Setters
		
	public int getPriority() 
	{
		return priority;
	}//end getPriority
	
	// methods to update the priority
	@Override
	public void setPriority(int priority) 
	{
	this.priority = priority;
	}
	
	public static void add(Task task) {
	}
	
	public int compareTo(Task task1) {
	return(priority - task1.priority);
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Task [status=" + status + ", name=" + name + ", priority=" + priority + "]";
	}
	
}//end class