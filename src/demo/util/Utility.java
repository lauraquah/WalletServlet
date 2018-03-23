package demo.util;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.service.WalletService;
import demo.service.WalletServiceImp;
import demo.wallet.Account;
import demo.wallet.Wallet;

@RestController
public class Utility {
	private WalletServiceImp wsi;
	
	@Autowired
	private WalletServiceImp ws;

	
	@RequestMapping("/")
	public String requestMethod() {
		return "Connection successful";
	}
	
	@RequestMapping(path="/add")
	public @ResponseBody Account addNewAccount(@RequestParam String firstName, 
												@RequestParam String lastName,
												@RequestParam String mobile,
											@RequestParam BigDecimal balance) {
		
		/*	Account account = new Account();
		Wallet wallet = new Wallet();
		account.setFirstName(firstName);
		account.setLastName(lastName);
		account.setMobile(mobile);
		wallet.setBalance(balance);
		account.setWallet(wallet);
		
		//wsi.createAccount();
		ws.createAccount("firstName", "lastName", "mobile", new BigDecimal(1000));		
		return "Saved";
		
		*/
		
		return ws.createAccount(firstName, lastName, mobile, new BigDecimal(1000));						
	}
	
	@RequestMapping(path="/test")
	public @ResponseBody String create(String firstName, String mobile, int balance) {
		
		ws.createAccount(firstName, firstName, mobile, new BigDecimal(balance));
		return "Success";
	}
	
	
	
}
