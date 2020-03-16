package jim.kats.creditcompany.domain;

import javax.persistence.*;

@Entity
public class CreditCard {
	@Id
	@GeneratedValue
	private int id;
	
	private String name; 
	private String number;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Address billingAddress;

	public CreditCard() {
		super();
	}

	public CreditCard(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", name=" + name + ", number=" + number + ", billingAddress=" + billingAddress
				+ "]";
	}

}
