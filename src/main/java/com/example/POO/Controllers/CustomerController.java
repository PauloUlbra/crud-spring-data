package com.example.POO.Controllers;

import com.example.POO.Models.Customer;
import com.example.POO.Services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    final
    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> listAllCustomers(){
        return customerService.findAll();
    }

    @PostMapping
    Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @PutMapping("/{id}")
    Customer updateCustomer(@RequestBody Customer customer, @PathVariable Long id) {
        return customerService.updateCustomer(customer, id);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.delete(id);
    }
}
