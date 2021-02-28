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

import fi.vamk.e1900320.northwind.entity.Shippers;

@RestController
public class ShippersController {
    // we need repository to provide dataabse access
    @Autowired
    ShippersRepository repository;

    @GetMapping("/Shippers/")
    public Iterable<Shippers> getShippers() {
        return repository.findAll();
    }

    

    @PostMapping("/Shippers")
    public Shippers create(@RequestBody Shippers shippers) {
        return repository.save(shippers);
    }

    @PutMapping("/Shippers")
    public Shippers update(@RequestBody Shippers shippers) {
        return repository.save(shippers);
    }

    @DeleteMapping("/Shippers")
    public void delete(@RequestBody Shippers shippers) {
        repository.delete(shippers);
    }

    @GetMapping("/Shippers/{id}")
    public Optional<Shippers> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/Shippers/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/Shippers/{company}")
    public Optional<Shippers> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/Shippers/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   