package com.example.POO.Services;

import com.example.POO.Models.Customer;
import com.example.POO.Repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    final
    CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer, Long id) {
        Customer editedCustomer = customerRepository.findById(id).get();
        editedCustomer.setName(customer.getName());
        editedCustomer.setPhone(customer.getPhone());
        editedCustomer.setCpf(customer.getCpf());

        return customerRepository.save(editedCustomer);
    }

    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

}
