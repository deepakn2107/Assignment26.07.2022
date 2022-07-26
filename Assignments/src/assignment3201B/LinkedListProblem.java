package assignment3201B;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListProblem {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Pencil");
		list1.add("Pen");
		list1.add("Eraser");
		list1.add("Sharpener");
		
		System.out.println("List1 "+list1);
		
		LinkedList<String> list2 = new LinkedList<String>();
		
		list2.add("Scale");
		list2.add("Scissors");
		list2.add("Gum");
		
		System.out.println("List2 "+list2);
		System.out.println("------------------------------------------");
		
		linkedListFunction(list1, list2);
		
			}
	public static void linkedListFunction(LinkedList<String> list1, LinkedList<String> list2) {
		list1.addAll(list2);
		System.out.println("Adding two linkedlist: "+list1);
		 list2.addFirst("Paint");
		System.out.println("Adding Element at first: "+ list2);
		list2.addLast("OilPaint");
		System.out.println("Adding Element at first: "+ list2);
		
		System.out.println("Index of pencil: " + list1.indexOf("Gum"));
		
		System.out.println("Last Index of pencil: " + list1.lastIndexOf("Scale"));
		
		System.out.println("PeakFirst: "+list1.peekFirst());
		
		System.out.println("PeakLastt: "+list1.peekLast());
		
		System.out.println("PollFirst: " +list1.pollFirst());
		
		System.out.println("PollLast: " +list1.pollLast());
		
		System.out.println("SizeOf list1: "+ list1.size() + "    SizeOf list2: "+ list2.size());
		
	}

}
