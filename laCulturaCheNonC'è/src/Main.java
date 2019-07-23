
public class Main {
	public static void main(String[] args) {
		Visitatore v = new Visitatore("DRDMAH931D", "dario@hotmail.it");
		MuseoBorbonico museoBorbonico = new MuseoBorbonico("1", "museo", 10, 15);
		
		museoBorbonico.visita(v);
		
	}

}
