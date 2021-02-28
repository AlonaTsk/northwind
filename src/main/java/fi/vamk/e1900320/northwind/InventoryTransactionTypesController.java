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

import fi.vamk.e1900320.northwind.entity.InventoryTransactionTypes;

@RestController
public class InventoryTransactionTypesController {
    // we need repository to provide dataabse access
    @Autowired
    InventoryTransactionTypesRepository repository;

    @GetMapping("/InventoryTransactionTypes/")
    public Iterable<InventoryTransactionTypes> getInventoryTransactionTypes() {
        return repository.findAll();
    }

    

    @PostMapping("/InventoryTransactionTypes")
    public InventoryTransactionTypes create(@RequestBody InventoryTransactionTypes inventoryTransactionTypes) {
        return repository.save(inventoryTransactionTypes);
    }

    @PutMapping("/InventoryTransactionTypes")
    public InventoryTransactionTypes update(@RequestBody InventoryTransactionTypes inventoryTransactionTypes) {
        return repository.save(inventoryTransactionTypes);
    }

    @DeleteMapping("/InventoryTransactionTypes")
    public void delete(@RequestBody InventoryTransactionTypes inventoryTransactionTypes) {
        repository.delete(inventoryTransactionTypes);
    }

    @GetMapping("/InventoryTransactionTypes/{id}")
    public Optional<InventoryTransactionTypes> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/InventoryTransactionTypes/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/InventoryTransactionTypes/{company}")
    public Optional<InventoryTransactionTypes> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/InventoryTransactionTypes/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   



