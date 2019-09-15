package stepDefinitions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GitPractice {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(8);
		list.add(5);
		list.add(5);
		System.out.println(name(list));
	}

	public static int name(List<Integer> list) {
		int count = 0;
		boolean flag = false;
		Collections.sort(list);
		for (int i = 1; i < list.size(); i++) {
			
			if(list.get(i) == list.get(i-1)) {
				if (!flag) {
		              // this is the first time for this clump.
		              flag = true;
		              count++;
				}
			}
			else flag = false;
				
			
		}
		return count;
	}
}
