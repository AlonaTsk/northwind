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

import fi.vamk.e1900320.northwind.entity.PurchaseOrderDetails;

@RestController
public class PurchaseOrderDetailsController {
    // we need repository to provide dataabse access
    @Autowired
    PurchaseOrderDetailsRepository repository;

    @GetMapping("/PurchaseOrderDetails/")
    public Iterable<PurchaseOrderDetails> getPurchaseOrderDetails() {
        return repository.findAll();
    }

    

    @PostMapping("/PurchaseOrderDetails")
    public PurchaseOrderDetails create(@RequestBody PurchaseOrderDetails purchaseOrderDetails) {
        return repository.save(purchaseOrderDetails);
    }

    @PutMapping("/PurchaseOrderDetails")
    public PurchaseOrderDetails update(@RequestBody PurchaseOrderDetails purchaseOrderDetails) {
        return repository.save(purchaseOrderDetails);
    }

    @DeleteMapping("/PurchaseOrderDetails")
    public void delete(@RequestBody PurchaseOrderDetails purchaseOrderDetails) {
        repository.delete(purchaseOrderDetails);
    }

    @GetMapping("/PurchaseOrderDetails/{id}")
    public Optional<PurchaseOrderDetails> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/PurchaseOrderDetails/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/PurchaseOrderDetails/{company}")
    public Optional<PurchaseOrderDetails> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/PurchaseOrderDetails/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   