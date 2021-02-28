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

import fi.vamk.e1900320.northwind.entity.OrderDetailsStatus;

@RestController
public class OrderDetailsStatusController {
    // we need repository to provide dataabse access
    @Autowired
    OrderDetailsStatusRepository repository;

    @GetMapping("/OrderDetailsStatus/")
    public Iterable<OrderDetailsStatus> getOrderDetailsStatus() {
        return repository.findAll();
    }

   

    @PostMapping("/OrderDetailsStatus")
    public OrderDetailsStatus create(@RequestBody OrderDetailsStatus orderDetailsStatus) {
        return repository.save(orderDetailsStatus);
    }

    @PutMapping("/OrderDetailsStatus")
    public OrderDetailsStatus update(@RequestBody OrderDetailsStatus orderDetailsStatus) {
        return repository.save(orderDetailsStatus);
    }

    @DeleteMapping("/OrderDetailsStatus")
    public void delete(@RequestBody OrderDetailsStatus orderDetailsStatus) {
        repository.delete(orderDetailsStatus);
    }

    @GetMapping("/OrderDetailsStatus/{id}")
    public Optional<OrderDetailsStatus> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/OrderDetailsStatus/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/OrderDetailsStatus/{company}")
    public Optional<OrderDetailsStatus> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/OrderDetailsStatus/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   