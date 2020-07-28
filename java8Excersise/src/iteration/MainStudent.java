package iteration;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student>studlist=Arrays.asList(new Student("fikir", "Walle", 27),
				new Student("Beki", "Gabore", 30));
		   studlist.stream().forEach(p->System.out.println(p.getFirstName()));
		   
		   studlist.parallelStream().filter(p->p.getFirstName().startsWith("f")).forEach(p->System.out.println(p.getFirstName()));
		
		printList(studlist);
		Collections.sort(studlist, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getFirstName().compareTo(o2.getLastName());
			}
		});
		Collections.sort(studlist, (s1,s2)->s1.getFirstName().compareTo(s2.getLastName()));
		
	}
	
	
	public static void printList(List<Student>studlist) {
		
		///this is called internal iteration
		
		studlist.forEach(System.out::println);
	}
	


}
