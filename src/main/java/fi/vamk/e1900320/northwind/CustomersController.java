package fi.vamk.e1900320.northwind;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fi.vamk.e1900320.northwind.entity.Customers;

@RestController
public class CustomersController {
    // we need repository to provide dataabse access
    @Autowired
    CustomersRepository repository;

    @GetMapping("/Customers/")
    public Iterable<Customers> getCustomers() {
        return repository.findAll();
    }

    @GetMapping("/test")
    public String test() {
        return "Test";
    }

    @PostMapping("/Customers")
    public Customers create(@RequestBody Customers customers) {
        return repository.save(customers);
    }

    @PutMapping("/Customers")
    public Customers update(@RequestBody Customers customers) {
        return repository.save(customers);
    }

    @DeleteMapping("/Customers")
    public void delete(@RequestBody Customers customers) {
        repository.delete(customers);
    }

    @GetMapping("/Customers/{id}")
    public Optional<Customers> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/Customers/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/Customers/{company}")
    public Optional<Customers> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/Customers/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   
