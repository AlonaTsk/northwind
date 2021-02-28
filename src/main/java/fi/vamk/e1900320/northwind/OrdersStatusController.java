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

import fi.vamk.e1900320.northwind.entity.OrdersStatus;

@RestController
public class OrdersStatusController {
    // we need repository to provide dataabse access
    @Autowired
    OrdersStatusRepository repository;

    @GetMapping("/OrdersStatus/")
    public Iterable<OrdersStatus> getOrdersStatus() {
        return repository.findAll();
    }

   

    @PostMapping("/OrdersStatus")
    public OrdersStatus create(@RequestBody OrdersStatus ordersStatus) {
        return repository.save(ordersStatus);
    }

    @PutMapping("/OrdersStatus")
    public OrdersStatus update(@RequestBody OrdersStatus ordersStatus) {
        return repository.save(ordersStatus);
    }

    @DeleteMapping("/OrdersStatus")
    public void delete(@RequestBody OrdersStatus ordersStatus) {
        repository.delete(ordersStatus);
    }

    @GetMapping("/OrdersStatus/{id}")
    public Optional<OrdersStatus> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/OrdersStatus/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/OrdersStatus/{company}")
    public Optional<OrdersStatus> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/OrdersStatus/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   