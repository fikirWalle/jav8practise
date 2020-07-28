package java8Excersise;

import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class Solutionjava8 {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pesrson>listperson=Arrays.asList(new Pesrson("Fikir", "ZZZ", 27),
				new Pesrson("beki", "KKK", 30),
				new Pesrson("f", "AAA", 23),
				new Pesrson("b", "BBB", 27));
//		
		System.out.println("Before Sorting");
		printAll(listperson);

		//Sort last name by Comparator which is Created by in the same class
	Collections.sort(listperson, (p1,p2)->p1.getLastNmae().compareTo(p2.getLastNmae()));
		

	System.out.println("After Sorting");
	printAll(listperson);
	printStartswithG(listperson);
	
	
	}

	private static void printAll(List<Pesrson>Pesrson) {
		
		for(Pesrson p:Pesrson) {
			
			
			System.out.println(p.getFirstName()+" "+p.getLastNmae()+" "+p.getAge());
			
		}
		
	}
	
	private static void printStartswithG(List<Pesrson>person) {
		
		
		  for(Pesrson p: person) {
			  
			  if(p.getFirstName().startsWith("b")) {
			System.out.println(p.getFirstName()+" "+p.getLastNmae()+" "+p.getAge());
		  }
			  else {
				  
			  continue;}
			  }
	}
	//List<Pesrson>mylist=new ArrayList<Pesrson>();
//	mylist.add(new Pesrson("Fikir", "Walle", 27));
//	mylist.add(new Pesrson("beki", "Gabore", 30));
//	mylist.add(new Pesrson("f", "w", 23));
//	mylist.add(new Pesrson("b", "g", 27));
	
	
	//Sort List BY Comparator wich is created in onother Class
//	Collections.sort(listperson, new Trycomparator());
//	
//	for(Pesrson p:listperson) {
//		
//		System.out.println(p.getFirstName()+" "+p.getLastNmae()+" "+p.getAge());
//	}
	


}
