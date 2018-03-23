package demo.wallet;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wallet {
	
	@Id
	int id;
	BigDecimal balance;

	//Constructors
	public Wallet() {
		super();
	}

	public Wallet(BigDecimal balance) {
		this.balance = balance;
	}
	public Wallet(int id, BigDecimal balance) {
		this.id = id;
		this.balance = balance;
	}

	//Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

}
