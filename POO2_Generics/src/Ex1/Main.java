package Ex1;

public class Main {
	
    public static void main(String[] args) {
    	
        Generica<String> d1 = new Generica<>("Oi");
        String str1 = d1.getDado();
        System.out.println(str1);

        Generica<Integer> d2 = new Generica<>(123);
        Integer int1 = d2.getDado();
        System.out.println(int1);

        Objeto objeto = new Objeto("Teste");
        Generica<Objeto> d3 = new Generica<>(objeto);
        Objeto obj1 = d3.getDado();
        System.out.println(obj1);
    }
}