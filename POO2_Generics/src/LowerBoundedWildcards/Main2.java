package LowerBoundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	
	public static void addStrings(List<? super String> list) {
	    list.add("Olá");
	    list.add("Mundo");
	}

	public static void main(String[] args) {
		
	    List<String> stringList = new ArrayList<>();
	    addStrings(stringList);
	    System.out.println(stringList); 

	    
	    List<Object> objectList = new ArrayList<>();
	    addStrings(objectList);
	    System.out.println(objectList); 
	}


}
