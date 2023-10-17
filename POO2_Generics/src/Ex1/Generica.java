package Ex1;

public class Generica<T> {
    private T dado;

    public Generica(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }

	public void setDado(T dado) {
		this.dado = dado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Generica [dado=");
		builder.append(dado);
		builder.append("]");
		return builder.toString();
	}
    
    
}
