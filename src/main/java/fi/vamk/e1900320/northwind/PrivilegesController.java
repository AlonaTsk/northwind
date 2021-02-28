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

import fi.vamk.e1900320.northwind.entity.Privileges;

@RestController
public class PrivilegesController {
    // we need repository to provide dataabse access
    @Autowired
    PrivilegesRepository repository;

    @GetMapping("/Privileges/")
    public Iterable<Privileges> getPrivileges() {
        return repository.findAll();
    }

    

    @PostMapping("/Privileges")
    public Privileges create(@RequestBody Privileges privileges) {
        return repository.save(privileges);
    }

    @PutMapping("/Privileges")
    public Privileges update(@RequestBody Privileges privileges) {
        return repository.save(privileges);
    }

    @DeleteMapping("/Privileges")
    public void delete(@RequestBody Privileges privileges) {
        repository.delete(privileges);
    }

    @GetMapping("/Privileges/{id}")
    public Optional<Privileges> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/Privileges/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/Privileges/{company}")
    public Optional<Privileges> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/Privileges/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   