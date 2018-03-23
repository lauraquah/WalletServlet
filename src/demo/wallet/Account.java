package demo.wallet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.GenerationType;


@Entity //make a table from this class
public class Account {
	private String firstName;
	private String lastName;
	private String mobile;
	@OneToOne(cascade=CascadeType.ALL)
	private Wallet wallet;	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	//Constructors
	public Account() {
		super();
	}
	public Account(String firstName, String lastName, String mobile, Wallet wallet) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.wallet = wallet;
	}
	
	
	//Getters and Setters
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	
	
	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", mobile=" + mobile + ", id=" + id + "]";
	}
	
	
	
}
