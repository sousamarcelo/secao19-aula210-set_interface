package application;

import java.util.Set;
import java.util.TreeSet;

public class Program {
	
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>();
		
		set.add("Tv");
		set.add("NoteBook");
		set.add("Tablet");
		
		set.add("Computer");
		
		System.out.println("Na lista contem NoteBook: " + set.contains("NoteBook"));
		System.out.println();
		System.out.println("Lista de produtos inseridos no Set: ");
		for(String s : set) {
			System.out.println(s);
		}
		
	}

}
