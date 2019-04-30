
public abstract class Museo {
	public Museo(String codiceID, String nome) {
		this.codiceID = codiceID;
		this.nome = nome;
	}

	public String getCodiceID() {
		return codiceID;
	}
	public String getNome() {
		return nome;
	}
	
	public abstract void visita(Visitatore v);


	private String codiceID;
	private String nome;
}
