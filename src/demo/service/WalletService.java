package demo.service;

import java.math.BigDecimal;
import demo.wallet.Account;

public interface WalletService {

	public Account createAccount(String firstName, String lastName, String mobile, BigDecimal amount);
	
	public Account showBalance(String mobile);
	
	public Account fundTransfer(String fromMobileNumber, String toMobileNumber, BigDecimal amount);
	
	public Account withdraw(String mobile, BigDecimal amount);
	
	public Account deposit(String mobile, BigDecimal amount);
	
	
}
