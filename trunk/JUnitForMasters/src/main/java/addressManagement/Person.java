package main.java.addressManagement;

public class Person {
	
	private String lastname;
	private String surname;
	private Address address;
	
	/**
	 * constuctor
	 * @param lastname
	 * @param surname
	 * @param address1
	 */
	public Person(String lastname, String surname, Address address1){
		this.address = address1;
		this.lastname = lastname;
		this.surname = surname;
	}
	
	/**
	 * constuctor
	 */
	public Person(){
		
	}
	
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Address getAdress() {
		return address;
	}

	public void setAdress(Address address) {
		this.address = address;
	}

}
