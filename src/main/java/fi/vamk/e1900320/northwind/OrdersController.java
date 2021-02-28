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

import fi.vamk.e1900320.northwind.entity.Orders;

@RestController
public class OrdersController {
    // we need repository to provide dataabse access
    @Autowired
    OrdersRepository repository;

    @GetMapping("/Orders/")
    public Iterable<Orders> getOrders() {
        return repository.findAll();
    }

   
    @PostMapping("/Orders")
    public Orders create(@RequestBody Orders orders) {
        return repository.save(orders);
    }

    @PutMapping("/Orders")
    public Orders update(@RequestBody Orders orders) {
        return repository.save(orders);
    }

    @DeleteMapping("/Orders")
    public void delete(@RequestBody Orders orders) {
        repository.delete(orders);
    }

    @GetMapping("/Orders/{id}")
    public Optional<Orders> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/Orders/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/Orders/{company}")
    public Optional<Orders> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/Orders/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   