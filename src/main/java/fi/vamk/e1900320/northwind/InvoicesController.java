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

import fi.vamk.e1900320.northwind.entity.Invoices;

@RestController
public class InvoicesController {
    // we need repository to provide dataabse access
    @Autowired
    InvoicesRepository repository;

    @GetMapping("/Invoices/")
    public Iterable<Invoices> getInvoices() {
        return repository.findAll();
    }

    

    @PostMapping("/Invoices")
    public Invoices create(@RequestBody Invoices invoices) {
        return repository.save(invoices);
    }

    @PutMapping("/Invoices")
    public Invoices update(@RequestBody Invoices invoices) {
        return repository.save(invoices);
    }

    @DeleteMapping("/Invoices")
    public void delete(@RequestBody Invoices invoices) {
        repository.delete(invoices);
    }

    @GetMapping("/Invoices/{id}")
    public Optional<Invoices> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/Invoices/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/Invoices/{company}")
    public Optional<Invoices> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/Invoices/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   

