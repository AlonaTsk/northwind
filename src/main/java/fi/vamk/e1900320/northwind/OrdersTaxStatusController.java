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

import fi.vamk.e1900320.northwind.entity.OrdersTaxStatus;

@RestController
public class OrdersTaxStatusController {
    // we need repository to provide dataabse access
    @Autowired
    OrdersTaxStatusRepository repository;

    @GetMapping("/OrdersTaxStatus/")
    public Iterable<OrdersTaxStatus> getOrdersTaxStatus() {
        return repository.findAll();
    }

    
    @PostMapping("/OrdersTaxStatus")
    public OrdersTaxStatus create(@RequestBody OrdersTaxStatus ordersTaxStatus) {
        return repository.save(ordersTaxStatus);
    }

    @PutMapping("/OrdersTaxStatus")
    public OrdersTaxStatus update(@RequestBody OrdersTaxStatus ordersTaxStatus) {
        return repository.save(ordersTaxStatus);
    }

    @DeleteMapping("/OrdersTaxStatus")
    public void delete(@RequestBody OrdersTaxStatus ordersTaxStatus) {
        repository.delete(ordersTaxStatus);
    }

    @GetMapping("/OrdersTaxStatus/{id}")
    public Optional<OrdersTaxStatus> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/OrdersTaxStatus/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/OrdersTaxStatus/{company}")
    public Optional<OrdersTaxStatus> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/OrdersTaxStatus/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   