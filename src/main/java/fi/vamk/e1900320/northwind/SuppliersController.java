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

import fi.vamk.e1900320.northwind.entity.Suppliers;

@RestController
public class SuppliersController {
    // we need repository to provide dataabse access
    @Autowired
    SuppliersRepository repository;

    @GetMapping("/Suppliers/")
    public Iterable<Suppliers> getSuppliers() {
        return repository.findAll();
    }

   

    @PostMapping("/Suppliers")
    public Suppliers create(@RequestBody Suppliers suppliers) {
        return repository.save(suppliers);
    }

    @PutMapping("/Suppliers")
    public Suppliers update(@RequestBody Suppliers suppliers) {
        return repository.save(suppliers);
    }

    @DeleteMapping("/Suppliers")
    public void delete(@RequestBody Suppliers suppliers) {
        repository.delete(suppliers);
    }

    @GetMapping("/Suppliers/{id}")
    public Optional<Suppliers> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/Suppliers/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/Suppliers/{company}")
    public Optional<Suppliers> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/Suppliers/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   