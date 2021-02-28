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

import fi.vamk.e1900320.northwind.entity.InventoryTransactions;

@RestController
public class InventoryTransactionsController {
    // we need repository to provide dataabse access
    @Autowired
    InventoryTransactionsRepository repository;

    @GetMapping("/InventoryTransactions/")
    public Iterable<InventoryTransactions> getInventoryTransactions() {
        return repository.findAll();
    }

    

    @PostMapping("/InventoryTransactions")
    public InventoryTransactions create(@RequestBody InventoryTransactions inventoryTransactions) {
        return repository.save(inventoryTransactions);
    }

    @PutMapping("/InventoryTransactions")
    public InventoryTransactions update(@RequestBody InventoryTransactions inventoryTransactions) {
        return repository.save(inventoryTransactions);
    }

    @DeleteMapping("/InventoryTransactions")
    public void delete(@RequestBody InventoryTransactions inventoryTransactions) {
        repository.delete(inventoryTransactions);
    }

    @GetMapping("/InventoryTransactions/{id}")
    public Optional<InventoryTransactions> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/InventoryTransactions/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/InventoryTransactions/{company}")
    public Optional<InventoryTransactions> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/InventoryTransactions/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   


