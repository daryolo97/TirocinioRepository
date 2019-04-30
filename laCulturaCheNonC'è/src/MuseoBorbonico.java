import java.util.Random;

public class MuseoBorbonico extends Museo {
	public MuseoBorbonico(String codiceID, String nome, int nVisite, int nMaxVisite) {
		super(codiceID, nome);
		this.nMaxVisite = nMaxVisite;
		this.nVisite = nVisite;
		
		attivit‡ = new String[3];
		attivit‡[0] = "discussioni";
		attivit‡[1] = "lettura";
		attivit‡[2] = "tutorial";
	}
	
	public void visita(Visitatore v) {
		Random generatore = new Random();
		int x = generatore.nextInt(3);
		
		v.getAttivit‡Eff().add(attivit‡[x]);
	}
	

	private int nVisite, nMaxVisite;
	private String[] attivit‡;
}
