package demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.wallet.*;

public interface WalletDAO extends JpaRepository<Account, Long>{

	//public boolean save(Account account);
	
	Account findOneByMobile(String mobile);
	
	
	
	//public Account findOne(String mobile);
	
}
