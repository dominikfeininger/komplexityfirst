package main.java.addressManagement;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Datenbank aktuelleDatenbank = new Datenbank(10, 10);		
		Verwaltung aktuelleVerwaltung = new Verwaltung(aktuelleDatenbank);
		
		Address dietersAddresse = new Address("Mannheim");
		Person dieter = new Person("dieter");
		dieter.setAdress(dietersAddresse);
		
		aktuelleVerwaltung.personAnlegen(dieter);
		//aktuelleVerwaltung.personLoeschen(dieter);
	}
}
