package UnboundedWildcards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {

	public static void reverseList(List<?> list) {
	    Collections.reverse(list);
	}

	public static void main(String[] args) {
	    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
	    reverseList(integers);
	    System.out.println(integers); 

	    List<String> strings = Arrays.asList("um", "dois", "três");
	    reverseList(strings);
	    System.out.println(strings);
	}


}
