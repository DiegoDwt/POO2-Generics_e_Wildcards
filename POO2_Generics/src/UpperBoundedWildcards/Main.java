package UpperBoundedWildcards;

import java.util.Arrays;
import java.util.List;

public class Main {

  
	public static double somaDaLista(List<? extends Number> list) {
	    double sum = 0.0;
	    for (Number n : list) {
	        sum += n.doubleValue();
	    }
	    return sum;
	}

	public static void main(String[] args) {
		
	    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
	    System.out.println("Soma da Lista: " + somaDaLista(integers)); 

	    List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);
	    System.out.println("Soma da Lista: " + somaDaLista(doubles)); 
	}

}