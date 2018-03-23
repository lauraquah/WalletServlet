package demo.service;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import demo.dao.WalletDAO;
import demo.wallet.Account;
import demo.wallet.Wallet;

@Service
public class WalletServiceImp implements WalletService{

	//private WalletRepository repo;
	
	@Autowired
	private WalletDAO wd;
	
	
	@Override
	public Account createAccount(String firstName, String lastName, String mobile, BigDecimal amount) {
		Account account = new Account(firstName, lastName, mobile, new Wallet(amount));
		return wd.save(account);
		
	}

	@Override
	public Account showBalance(String mobile) {
		// TODO Auto-generated method stub
		
		return wd.findOneByMobile(mobile);
	}

	@Override
	public Account fundTransfer(String fromMobileNumber, String toMobileNumber, BigDecimal amount) {
		Wallet fromAccount = wd.findOneByMobile(fromMobileNumber).getWallet();
		Wallet toAccount = wd.findOneByMobile(toMobileNumber).getWallet();
		
		
		
		//wd.findOneByMobile(fromMobileNumber).getWallet().getBalance() - amount;
		
		
		return null;
	}

	@Override
	public Account withdraw(String mobile, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account deposit(String mobile, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
