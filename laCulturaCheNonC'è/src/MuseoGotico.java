import java.util.ArrayList;

public class MuseoGotico extends Museo{
	public MuseoGotico(String codiceID, String nome, int prezzo, ArrayList<Visitatore> visitatori, int tasseRiscosse, int nMaxVisitatori) {
		super(codiceID, nome);//
		this.prezzo = nMaxVisitatori;
		this.tasseRiscosse = tasseRiscosse;
		this.nMaxVisitatori = prezzo;
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
