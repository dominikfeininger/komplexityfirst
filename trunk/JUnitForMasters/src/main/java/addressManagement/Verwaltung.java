package main.java.addressManagement;

public class Verwaltung implements IVerwaltung{
	
	private String name;
	private boolean status;
	private Datenbank aktuelleDatenbank;
	private int addressId = 0;
	private int personID = 0;
	
	public Verwaltung(){
		
	}
	
	public Verwaltung(Datenbank aktuelleDatenbank){
		this.aktuelleDatenbank = aktuelleDatenbank;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Enum<Status> personAnlegen(Person person) {
		System.out.println("personAnlegen - person.getLastname()"+person.getLastname());
		person.setId(this.personID);
		this.personID++;
		if(this.aktuelleDatenbank.addPerson(person) == Status.SUCCESS){
			if(this.aktuelleDatenbank.addAddress(person.getAdress()) == Status.SUCCESS){
				return Status.SUCCESS;	
			}else{
				return Status.FAILED;
			}
			
		}else{
			return Status.FAILED;
		}
		
	}

	public Enum<Status> personLoeschen(Person person) {
		System.out.println("personLoeschen - person.getLastname()"+person.getLastname());
		if(this.aktuelleDatenbank.loeschePerson(person) == Status.SUCCESS){
			if(this.aktuelleDatenbank.loescheAdresse(person.getAdress()) == Status.SUCCESS){
				return Status.SUCCESS;	
			}else{
				return Status.FAILED;
			}
		}else{
			return Status.FAILED;
		}
	}

	public Person suchenPerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	public Address suchenAddresse(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	public Enum<Status> adresseAnlegen(Address address) {
		System.out.println("adresseAnlegen - address.getCity()"+address.getCity());
		address.setId(this.addressId);
		this.addressId++;
		if(this.aktuelleDatenbank.addAddress(address) == Status.SUCCESS){
			return Status.SUCCESS;
		}else{
			return Status.FAILED;
		}
	}

	public Enum<Status> adresseLoeschen(Address address) {
		System.out.println("adresseLoeschen - address.getCity()"+address.getCity());
		if(this.aktuelleDatenbank.loescheAdresse(address) == Status.SUCCESS){
			return Status.SUCCESS;
		}else{
			return Status.FAILED;
		}
	}

}
