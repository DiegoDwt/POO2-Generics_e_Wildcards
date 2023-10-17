package Ex1;

public class Objeto {
    private String nome;

    public Objeto(String nome) {
        this.nome = nome;
    }
    
    
    public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
    public String toString() {
        return "Objeto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}