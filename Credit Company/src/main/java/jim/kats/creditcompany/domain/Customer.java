package jim.kats.creditcompany.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customer { 
	@Id
	@GeneratedValue
	private int id;
	
	private String firstName;
	private String lastName;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private CreditCard creditCard;

	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", creditCard=" + creditCard + "]";
	}

}
