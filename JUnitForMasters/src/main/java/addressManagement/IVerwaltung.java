package main.java.addressManagement;

public interface IVerwaltung {

	Enum<Status> personAnlegen(Person person);
	Enum<Status> personLoeschen(Person person);

	Enum<Status> adresseAnlegen(Address address);
	Enum<Status> adresseLoeschen(Address address);
	
	Person suchenPerson(Person person);
	Address suchenAddresse(Person person);

}
