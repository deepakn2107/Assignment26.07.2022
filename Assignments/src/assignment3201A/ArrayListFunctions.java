package assignment3201A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListFunctions {
	public int checkSizeOfArray(List list) {
		return list.size();

	}

	public boolean isEmptyList(List list) {
		return list.isEmpty();
	}

	public String indexOfElement(List list, int index) {
		return (String) list.get(index);

	}

	public List<String> replaceWithIndex(List<String> list, int index, String string) {
		list.set(index, string);
		return list;

	}

	public List<String> appendingValues(List<String> list1, List<String> list2) {

		for (int i = 0; i < list2.size(); i++)
			list1.add(list2.get(i));
		return list1;

	}

	public List<String> anagramInList(List<String> list) {
		List<String> resultList = new ArrayList();
		for (int i = 0; i < list.size() ; i++) {
			if ((list.get(i)).length() == 1)
				continue;
			for (int j = i + 1; j < list.size(); j++) {

				if (checkAnagram(list.get(i), list.get(j)))
					resultList.add(list.get(i));
					resultList.add(list.get(j));
//					resultList.remove(j--);
//					System.out.println(resultList);

			}
		}

		return resultList;

	}

	public boolean checkAnagram(String string1, String string2) {

		if (string1.length() != string2.length())
			return false;

		char[] strarr1 = string1.toLowerCase().toCharArray();
		char[] strarr2 = string2.toLowerCase().toCharArray();
		Arrays.sort(strarr1);
		Arrays.sort(strarr1);

//		System.out.println(Arrays.equals(strarr1, strarr2));
		return Arrays.equals(strarr1, strarr2);

	}

}
