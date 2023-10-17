package LowerBoundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void insereNumeros(List<? super Integer> list) {
	    for (int i = 1; i <= 30; i++) {
	        list.add(i);
	    }
	}

	public static void main(String[] args) {
		
	    List<Integer> integerList = new ArrayList<>();
	    insereNumeros(integerList);
	    System.out.println(integerList);

	    List<Number> numberList = new ArrayList<>();
	    insereNumeros(numberList);
	    System.out.println(numberList); 

	    List<Object> objectList = new ArrayList<>();
	    insereNumeros(objectList);
	    System.out.println(objectList);
	}

}
