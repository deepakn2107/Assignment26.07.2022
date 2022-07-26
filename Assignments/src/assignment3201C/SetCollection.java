package assignment3201C;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		System.out.println(similiarElements());

	}

	public static Set<Integer> similiarElements() {
		Set<Integer> set1 = new HashSet<Integer>();

		set1.add(1);
		set1.add(4);
		set1.add(5);
		set1.add(3);
		set1.add(7);

		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(2);
		set2.add(5);
		set2.add(1);
		set1.retainAll(set2);

		return set1;

	}

}
