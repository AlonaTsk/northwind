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

import fi.vamk.e1900320.northwind.entity.Strings;

@RestController
public class StringsController {
    // we need repository to provide dataabse access
    @Autowired
    StringsRepository repository;

    @GetMapping("/Strings/")
    public Iterable<Strings> getStrings() {
        return repository.findAll();
    }

    
    @PostMapping("/Strings")
    public Strings create(@RequestBody Strings strings) {
        return repository.save(strings);
    }

    @PutMapping("/Strings")
    public Strings update(@RequestBody Strings strings) {
        return repository.save(strings);
    }

    @DeleteMapping("/Strings")
    public void delete(@RequestBody Strings strings) {
        repository.delete(strings);
    }

    @GetMapping("/Strings/{id}")
    public Optional<Strings> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/Strings/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/Strings/{company}")
    public Optional<Strings> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/Strings/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   