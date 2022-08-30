package com.example.My.Accounts;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountService {

	@Autowired
	private AccountRepositary accountRepositary;
	
	public Accounts addAccount(Accounts accounts) {
		return accountRepositary.save(accounts);
	}
	
	public void deleteAccounts(long id) {
		accountRepositary.deleteById(id);
	}
	
	public Iterable<Accounts> getAllAccounts(){
		return accountRepositary.findAll();
	}
	
	public Accounts updateAccounts(Accounts accounts,long id) {
		Accounts _accounts = accountRepositary.findById(id).get();
		
		if (Objects.nonNull(accounts.getClientName()) && !"".equalsIgnoreCase(accounts.getClientName())) {
			_accounts.setClientName(accounts.getClientName());
		}
		
		if (Objects.nonNull(accounts.getAmount()) && accounts.getAmount() != 0) {
			_accounts.setAmount(accounts.getAmount());
		}
		
		if(Objects.nonNull(accounts.getStatus()) && !"".equalsIgnoreCase(accounts.getStatus())) {
			_accounts.setStatus(accounts.getStatus());
		}
		
		if(Objects.nonNull(accounts.getPaymentStatus()) && !"".equalsIgnoreCase(accounts.getPaymentStatus())) {
			_accounts.setPaymentStatus(accounts.getPaymentStatus());
		}
		
		if(Objects.nonNull(_accounts.getComment()) && !"".equalsIgnoreCase(accounts.getComment())) {
			_accounts.setComment(accounts.getComment());
		}
		return accountRepositary.save(_accounts);
	}
}
