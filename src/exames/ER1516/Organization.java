package Exame;


public class Organization {

	private String name, country, phone;

	public Organization(String name, String country, String phone) {
		super();
		this.name = name;
		this.country = country;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String toString() {
		return "Organization [name=" + name + ", country=" + country + ", phone=" + phone + "]";
	}
	
	
}
