package Ex4;

public class Main {
    public static void main(String[] args) {
    	
        MinhaEstrutura<Integer> estrutura = new MinhaEstrutura<>();
        System.out.println(estrutura.add("Chave1", 123)); 
        System.out.println(estrutura.add("Chave1", 123)); 
        System.out.println(estrutura.add("Chave3", 789)); 

        System.out.println(estrutura.buscarPorChave("Chave1"));
        System.out.println(estrutura.buscarPorChave("Chave2")); 
        System.out.println(estrutura.buscarPorChave("Chave3")); 
    }
}
