package jim.kats.creditcompany.repository;

import jim.kats.creditcompany.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Integer> {
////	sample data
//	Customer customer1 = new Customer("Joe", "Smith");
//	Customer customer2 = new Customer("John", "Spader");
//
//
//	Address customerAddress = new Address("2000 N Court Street", "20A", "Fairfield", "Iowa", "52556");
//
//	CreditCard creditCard = new CreditCard("MasterCard", "5400 1234 5678 9123");
//
//	Address billingAddress = new Address("1000 N 4th Street", "Box 314", "Fairfield", "Iowa", "52557");
//
//	private static int idCount = 1;
//	private Map<Integer, Customer> customers = new HashMap<>();
//
//	public CustomerRepository(){
//		addCustomer(customer1);
//		addCustomer(customer2);
//	}
//
//	public Customer addCustomer(Customer customer) {
//		customer.setId(idCount);
//		customers.put(customer.getId(), customer);
//		int temp = idCount;
//		idCount++;
//		return customers.get(temp);
//	}
//
//	public Customer getCustomer(int id) {
//		Customer customer = customers.get(id);
//		//remember to add exception handler.
//		return customer;
//	}
//
//	public void updateCustomer(int id, Customer customer) {
//		customers.put(id, customer);
//	}
//
//	public void deleteCustomer(int id) {
//		//remember to add an exception handler for null deleted.
//		Customer deleted = customers.get(id);
//		customers.remove(deleted);
//	}
//
//	public List<Customer> getAllCustomers() {
//		return new ArrayList<Customer>(customers.values());
//	}
}

