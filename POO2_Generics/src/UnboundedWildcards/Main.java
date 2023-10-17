package UnboundedWildcards;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void printList(List<?> list) {
	    for (Object element : list) {
	        System.out.println(element);
	    }
	}

	public static void main(String[] args) {
	    List<Integer> integers = Arrays.asList(1, 2, 3);
	    printList(integers); 

	    List<String> strings = Arrays.asList("um", "dois", "três");
	    printList(strings); 
	}


}
