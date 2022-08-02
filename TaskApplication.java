public class TaskApplication {

	public static void main(String[] args) {
	
		// validate priority is not less than MIN if it is set priority to MIN
	
		// display the sorted tasks ranked by priority 
		
		Task task = new Task();
		System.out.println(task.toString());
		
		Process process = new Process();
		System.out.println(process.toString());
		
		
		System.out.println("MIN_PRIORITY");
		System.out.println("Tasks ranked by priority(lowest to highest): 1, ");
		
		System.out.println("MED_PRIORITY");
		System.out.println("Tasks ranked by priority: 5, ");
		
		System.out.println("MAX_PRIORITY");
		System.out.println("Tasks ranked by priority: 10.");
		
     	}//end main
   }//end class       
            
