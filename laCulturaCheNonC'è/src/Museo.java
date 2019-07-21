
public abstract class Museo {
	public Museo(String codiceID, String nome) {
		
	}

	public String getCodiceID() {
		return codiceID;
	}
	public String getNome() {
		return nome;
	}
	
	public void prova() {
		System.out.print("Non faccio niente");
		System.out.println("OK");
	}
	
	public abstract void visita(Visitatore v);


	private String codiceID;
	private String nome;
}
