package jim.kats.creditcompany.controller;

import jim.kats.creditcompany.NoSuchResourceException;
import jim.kats.creditcompany.domain.Customer;
import jim.kats.creditcompany.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public String Welcome(){
        return "This is our Credit Card Company /n Welcome";
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/getCustomer/{customerId}")
    public Customer getCustomer(@PathVariable int customerId) throws NoSuchResourceException {
        return customerService.getCustomer(customerId);
    }

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @DeleteMapping("/deleteCustomer/{customerId}")
     public ResponseEntity<Void> deleteCustomer(@PathVariable int customerId) throws NoSuchResourceException{
        return customerService.deleteCustomer(customerId);
    }

    @PutMapping("/updateCustomer/{customerId}")
    public Customer updateCustomer(@PathVariable int customerId, @RequestBody Customer customer) throws NoSuchResourceException{
        return customerService.updateCustomer(customerId, customer);
    }



}
