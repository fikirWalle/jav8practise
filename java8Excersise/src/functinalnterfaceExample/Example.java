package functinalnterfaceExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import java.util.function.Predicate;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(sumofTwo.apply(4, 5));
		
		List<String>studentlist=Arrays.asList("Fikir","Beki");
		
		Predicate<String>starts=(s)->s.startsWith("B");
		for(String s:studentlist) {
			
			if(starts.test(s))System.out.println(s);
		}

	}
	static BiFunction<Integer, Integer, Integer> sumofTwo=(a,b)->
		
		a+b;;
	;
	
	

}
