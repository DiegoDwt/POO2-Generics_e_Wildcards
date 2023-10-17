package UpperBoundedWildcards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {

	public static Number maximoDaLista(List<? extends Number> list) {
	    return Collections.max(list, null);
	}

	public static void main(String[] args) {
	    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
	    System.out.println("Valor máximo da lista: " + maximoDaLista(integers)); 

	    List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);
	    System.out.println("Valor máximo da lista: " + maximoDaLista(doubles)); 
	}

}
