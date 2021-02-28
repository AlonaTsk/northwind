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

import fi.vamk.e1900320.northwind.entity.Products;

@RestController
public class ProductsController {
    // we need repository to provide dataabse access
    @Autowired
    ProductsRepository repository;

    @GetMapping("/Products/")
    public Iterable<Products> getProducts() {
        return repository.findAll();
    }

   

    @PostMapping("/Products")
    public Products create(@RequestBody Products products) {
        return repository.save(products);
    }

    @PutMapping("/Products")
    public Products update(@RequestBody Products products) {
        return repository.save(products);
    }

    @DeleteMapping("/Products")
    public void delete(@RequestBody Products products) {
        repository.delete(products);
    }

    @GetMapping("/Products/{id}")
    public Optional<Products> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/Products/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/Products/{company}")
    public Optional<Products> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/Products/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   