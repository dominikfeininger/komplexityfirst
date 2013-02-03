package main.java.addressManagement;

public class Person {
	
	private String lastname;
	private String surname;
	private Address address;
	private int id;
	
	/**
	 * constuctor
	 * @param lastname
	 * @param surname
	 * @param address1
	 */
	public Person(String lastname, String surname, Address address1, int id){
		this.address = address1;
		this.lastname = lastname;
		this.surname = surname;
		this.setId(id);
	}
	
	/**
	 * constuctor
	 */
	public Person(){
		
	}
	
	/**
	 * 
	 * @param lastname
	 */
	public Person(String lastname){
		this.lastname = lastname;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
