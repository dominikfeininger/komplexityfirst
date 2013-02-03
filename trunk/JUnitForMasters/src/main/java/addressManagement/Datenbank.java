package main.java.addressManagement;

import org.omg.PortableInterceptor.SUCCESSFUL;

public class Datenbank {
	
	private Person[] persons;
	private Address[] adressen;
	
	private int personenAnzahl = 0;
	private int adressenAnzahl = 0;
	
	public Datenbank(){
		
	}
	
	public Datenbank(int anzahlPersonen, int anzahlAdressen){
		setPersons(new Person[anzahlPersonen]);
		setAdressen(new Address[anzahlAdressen]);
	}

	public Person[] getPersons() {
		return persons;
	}

	public void setPersons(Person[] persons) {
		this.persons = persons;
	}

	public Address[] getAdressen() {
		return adressen;
	}

	public void setAdressen(Address[] adressen) {
		this.adressen = adressen;
	}
	
	public Enum<Status> addPerson(Person person){
		if(this.persons.length > this.personenAnzahl){
			this.persons[personenAnzahl] = person;
			this.personenAnzahl++;
			return Status.SUCCESS;	
		}else{
			return Status.FAILED;
		}
	}
	
	public Enum<Status> addAddress(Address address){
		System.out.println("addAddress: "+address.getCity());
		
		if(this.adressen.length > this.adressenAnzahl){
			this.adressen[adressenAnzahl] = address;
			this.adressenAnzahl++;
			return Status.SUCCESS;	
		}else{
			return Status.FAILED;
		}
	}
	
	public Enum<Status> loescheAdresse(Address address){
		System.out.println("addAddress: "+address.getCity());
		for (Address ad : this.adressen) {
			if(ad.getId() == address.getId()){
					this.adressen[adressenAnzahl] = null;
					this.adressenAnzahl--;
					return Status.SUCCESS;	
				}else{
					return Status.FAILED;
				}
			}
		return Status.FAILED;
		
	}
	
	public Enum<Status> loeschePerson(Person person){
		
		for (Person p : this.persons) {
			if(p.getId() == person.getId()){
					this.persons[personenAnzahl] = null;
					this.personenAnzahl--;
					return Status.SUCCESS;	
				}else{
					return Status.FAILED;
				}
			}
		return Status.FAILED;
		
	}
}
