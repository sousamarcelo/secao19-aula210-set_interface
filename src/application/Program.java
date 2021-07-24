package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
	
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("Tv");
		set.add("NoteBook");
		set.add("Tablet");
		
		set.add("Computer");
		
//		set.remove("Computer");
//		set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println("Na lista contem NoteBook: " + set.contains("NoteBook"));
		System.out.println();
		System.out.println("Lista de produtos inseridos no Set: ");
		for(String s : set) {
			System.out.println(s);
		}
		
	}

}
