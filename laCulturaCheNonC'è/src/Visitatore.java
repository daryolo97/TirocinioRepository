import java.util.ArrayList;

public class Visitatore {
	public Visitatore(String CF, String email) {
		this.CF = CF;
		this.email = email;
		tassePagate = 0;
		attivit‡Eff = new ArrayList<String>();
	}
	
	public String getCF() {
		return CF;
	}

	public String getEmail() {
		return email;
	}

	public int getTassePagate() {
		return tassePagate;
	}

	public ArrayList<String> getAttivit‡Eff() {
		return attivit‡Eff;
	}

	public void pagamento(int prezzo) {
		tassePagate += prezzo;
	}
	

	private String CF, email;
	private int tassePagate;
	private ArrayList<String> attivit‡Eff;
}
