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

import fi.vamk.e1900320.northwind.entity.OrderDetails;

@RestController
public class OrderDetailsController {
    // we need repository to provide dataabse access
    @Autowired
    OrderDetailsRepository repository;

    @GetMapping("/OrderDetails/")
    public Iterable<OrderDetails> getOrderDetails() {
        return repository.findAll();
    }

   
    @PostMapping("/OrderDetails")
    public OrderDetails create(@RequestBody OrderDetails orderDetails) {
        return repository.save(orderDetails);
    }

    @PutMapping("/OrderDetails")
    public OrderDetails update(@RequestBody OrderDetails orderDetails) {
        return repository.save(orderDetails);
    }

    @DeleteMapping("/OrderDetails")
    public void delete(@RequestBody OrderDetails orderDetails) {
        repository.delete(orderDetails);
    }

    @GetMapping("/OrderDetails/{id}")
    public Optional<OrderDetails> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/OrderDetails/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/OrderDetails/{company}")
    public Optional<OrderDetails> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/OrderDetails/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   

