package java8Excersise;

import java.util.function.BiConsumer;

public class CalculateArrayValue {
	
	
	
	public static void main(String args[]) {
		
		resultafteradding(new int [] {1,2,3,4});
		int arr[]= {1,2,3,4};
		
		
	}
	
	
	
	private static int[] resultafteradding(int arr[]){
		
		
		int resu[]= new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			
			resu[i]=arr[i]+2;
			System.out.print(" "+resu[i]);
		}
		
		return resu;
		
	}
	CalculateArr calc=(int arr[])->{int resu[]= new int[arr.length];
	
	           
	             for(int i:arr) {
	            	 resu[i]=arr[i]+2;
	            	 
	             }
	             return resu;
	             };
	             
	             public static void process(int arr[],BiConsumer<Integer, Integer>consumer) {
	            	 
	            	   for(int i:arr) {
	            		   consumer.accept(arr[i], 2);
	            		   
	            	   }
	            	 
	            	 
	            	 
	             }

}
