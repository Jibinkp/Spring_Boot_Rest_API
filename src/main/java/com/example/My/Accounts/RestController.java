package com.example.My.Accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins="http://localhost:4200/")
public class RestController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/test")
	public String test() {
		return "This is a test data man";
	}

	
	@RequestMapping(method=RequestMethod.POST,value="/add_new_account")
	public String add_new_account(@RequestBody Accounts accounts) {
		accountService.addAccount(accounts);
		return "added successfully";
	}
	
	@PutMapping("/udate_account/{id}")
	public String udate_account(@RequestBody Accounts accounts,@PathVariable("id") long id) {
		accountService.updateAccounts(accounts, id);
		return "Account updated successfully";
	}
	
	@RequestMapping("/get_accounts")
	public Iterable<Accounts> getAccounts(){
		return accountService.getAllAccounts();
	}
	
	@DeleteMapping("delete_account/{id}")
	public String deleteAccount(@PathVariable("id") long id) {
		accountService.deleteAccounts(id);
		return "deleted successfully";
	}
}
