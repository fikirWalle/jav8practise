package closures;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	
	static enum comparemethod{
		
		BYSALARY, BYNAME
	}

	    public static void main(String args[]) {
	    	
	    	
	    	
	    }
	    /**
	     * 
	     * @param emps
	     * @param method
	     * the way the compare method acts depends on the state of the
class that is attempting to sort Employee objects, our
Comparator implementation will never be aware of this fact.
	     */
	    public void sort(List<Employee> emps, comparemethod method) {
	    	  
	    	   if(method==method.BYNAME) {
	    		   Collections.sort(emps,(e1,e2)->e1.name.compareTo(e2.name));
	    		   
	    	   }
	    	   
	    	     if(method==method.BYSALARY) {
	    	    	 
	    	    	 Comparator<Employee>compares=(e1,e2)->{
	    	    		 if(e1.salary ==e2.salary) {
	    	    			 return 0;
	    	    		 }
	    	    		 else if(e1.salary>e2.salary) {
	    	    			 
	    	    			 return 1;
	    	    		 }
	    	    		 else {
	    	    			 return -1;
	    	    		 }
	    	    		 
	    	    	 };
	    	    	
	    	     }
	    	   }
	    	
	    }

