package Ex2;

import java.util.Date;

public class Main {
	
    public static void main(String[] args) {
    	
        Produto<Integer> produto1 = new Produto<>(1, 10.0, new Date(), new Date());
        System.out.println(produto1.toString());

        Produto<String> produto2 = new Produto<>("2", 20.0, new Date(), new Date());
        System.out.println(produto2.toString());
    }
}
