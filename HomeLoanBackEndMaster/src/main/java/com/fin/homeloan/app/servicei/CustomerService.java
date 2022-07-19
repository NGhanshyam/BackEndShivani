package com.fin.homeloan.app.servicei;

import com.fin.homeloan.app.model.Customer;

public interface CustomerService {

	void saveCustomer(Customer cus);

	Customer get(int customerId);

}
