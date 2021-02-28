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

import fi.vamk.e1900320.northwind.entity.PurchaseOrders;

@RestController
public class PurchaseOrdersController {
    // we need repository to provide dataabse access
    @Autowired
    PurchaseOrdersRepository repository;

    @GetMapping("/PurchaseOrders/")
    public Iterable<PurchaseOrders> getPurchaseOrders() {
        return repository.findAll();
    }

    

    @PostMapping("/PurchaseOrders")
    public PurchaseOrders create(@RequestBody PurchaseOrders purchaseOrders) {
        return repository.save(purchaseOrders);
    }

    @PutMapping("/PurchaseOrders")
    public PurchaseOrders update(@RequestBody PurchaseOrders purchaseOrders) {
        return repository.save(purchaseOrders);
    }

    @DeleteMapping("/PurchaseOrders")
    public void delete(@RequestBody PurchaseOrders purchaseOrders) {
        repository.delete(purchaseOrders);
    }

    @GetMapping("/PurchaseOrders/{id}")
    public Optional<PurchaseOrders> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/PurchaseOrders/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/PurchaseOrders/{company}")
    public Optional<PurchaseOrders> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/PurchaseOrders/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   