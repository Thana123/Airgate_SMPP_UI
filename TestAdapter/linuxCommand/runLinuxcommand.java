package linuxCommand;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class runLinuxcommand {
	public static void runandGetresponse() throws Exception {                  
	    String[] command = { "./flows.sh", "suspend" };         
	    Process process = Runtime.getRuntime().exec(command);                    
	    BufferedReader reader = new BufferedReader(new InputStreamReader(    
	        process.getInputStream()));                                          
	    String s;                                                                
	    while ((s = reader.readLine()) != null) {                                
	      System.out.println("Script output: " + s); // Replace this line with the code to print the result to file                     
	    }                                                                        
	  }      
}
