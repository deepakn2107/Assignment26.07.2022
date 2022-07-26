package assignment3201A;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFunctionsMain {

	public static void main(String[] args) {
		
		List <String >list = new ArrayList<String>();
		
		list.add("C");
		list.add("C++");
		list.add("Java");
		list.add("Python");
		
		ArrayListFunctions alf1 = new ArrayListFunctions();
		System.out.println("Size of the Array: "+ alf1.checkSizeOfArray(list));
		System.out.println("ArrayList isEmpty: "+ alf1.isEmptyList(list));
		System.out.println("ArrayList at index 0: " + alf1.indexOfElement(list,0));
		System.out.println("List after changes : " +alf1.replaceWithIndex(list,3,"Python3"));
		
		List <String >list2 = new ArrayList<String>();
		list2.add("R");
		list2.add("MySQL");
		list2.add("save");
		list2.add("vase");
		
		System.out.println("After appending the List  : "+ alf1.appendingValues(list, list2));
		
		System.out.println("Anagrams in the List : " +alf1.anagramInList(list2));
		
		
		
		

	}

}
