package org.example.service;
import org.example.model.Customer;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
     CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return null;
    }

    public Optional<Customer> getCustomerById(Long id) {
        return null;
    }

    public Customer addCustomer(Customer customer) {
        return null;
    }

    public void deleteCustomer(Long id) {

    }
}
