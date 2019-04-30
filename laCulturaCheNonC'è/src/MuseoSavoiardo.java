import java.util.ArrayList;

public class MuseoSavoiardo extends Museo{
	public MuseoSavoiardo(String codiceID, String nome, int prezzo, ArrayList<Visitatore> visitatori, int tasseRiscosse, int nMaxVisitatori) {
		super(codiceID, nome);
		this.prezzo = prezzo;
		this.tasseRiscosse = tasseRiscosse;
		this.nMaxVisitatori = nMaxVisitatori;
		this.visitatori = visitatori;
	}
	
	public void visita(Visitatore v) {
		if(visitatori.size() <= nMaxVisitatori) 
			visitatori.add(v);
		else 
			throw new IllegalArgumentException("RAGGIUNTO NUMERO MASSIMO VISITE");	
		
		tasseRiscosse+=prezzo;
		v.pagamento(prezzo);
	}
	
	
	private int prezzo, tasseRiscosse, nMaxVisitatori;
	private ArrayList<Visitatore> visitatori;
	

}
