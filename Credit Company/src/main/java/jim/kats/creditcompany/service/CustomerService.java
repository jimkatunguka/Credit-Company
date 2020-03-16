package jim.kats.creditcompany.service;

import jim.kats.creditcompany.NoSuchResourceException;
import jim.kats.creditcompany.repository.AddressRepository;
import jim.kats.creditcompany.repository.CreditCardRepository;
import jim.kats.creditcompany.repository.CustomerRepository;
import jim.kats.creditcompany.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	AddressRepository addressRepository;

	@Autowired
	CreditCardRepository creditcardRepository;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Customer getCustomer(int customerId) throws NoSuchResourceException {
		Customer customer = customerRepository.findById(customerId).
				orElseThrow(() -> new NoSuchResourceException("Customer not found for " + customerId, customerId));
		//add throws exception
		return customer;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Customer updateCustomer(int customerId, @RequestBody Customer new_customer) throws NoSuchResourceException{
		Customer customer = customerRepository.findById(customerId)
				.orElseThrow(() -> new NoSuchResourceException("Customer not found for this" + customerId, customerId));

		customer.setFirstName(new_customer.getFirstName());
		customer.setLastName(new_customer.getLastName());
		customer.setCreditCard(new_customer.getCreditCard());
		customer.setAddress(new_customer.getAddress());

		final Customer updated_customer = customerRepository.save(customer);

		return updated_customer;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public ResponseEntity<Void> deleteCustomer(int customerId) throws NoSuchResourceException{
		Customer customer = customerRepository.findById(customerId)
				.orElseThrow(() -> new NoSuchResourceException("Customer not found for " + customerId, customerId));
		customerRepository.delete(customer);
		return  ResponseEntity.noContent().build();
	}
}
