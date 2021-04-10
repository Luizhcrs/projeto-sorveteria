package entidade;

public class Sorvete {
	private String sabor;
	private String calda;
	private String casca;

	public Sorvete(String sabor, String calda, String casca) {
		this.sabor = sabor;
		this.calda = calda;
		this.casca = casca;

	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getCalda() {
		return calda;
	}

	public void setCalda(String calda) {
		this.calda = calda;
	}

	public String getCasca() {
		return casca;
	}

	public void setCasca(String casca) {
		this.casca = casca;
	}

	

}
