package main.java.addressManagement;

public class Address {
	
	private String street;
	private String zip;
	private String city;
	private int id;
	
	public Address(){
		
	}
	
	public Address(String street, String zip, String city, int id){
		this.setCity(city);
		this.setStreet(street);
		this.setZip(zip);
		this.setId(id);
	}
	
	/**
	 * 
	 * @param city
	 */
	public Address(String city){
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
