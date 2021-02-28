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

import fi.vamk.e1900320.northwind.entity.SalesReports;

@RestController
public class SalesReportsController {
    // we need repository to provide dataabse access
    @Autowired
    SalesReportsRepository repository;

    @GetMapping("/SalesReports/")
    public Iterable<SalesReports> getSalesReports() {
        return repository.findAll();
    }

   

    @PostMapping("/SalesReports")
    public SalesReports create(@RequestBody SalesReports salesReports) {
        return repository.save(salesReports);
    }

    @PutMapping("/SalesReports")
    public SalesReports update(@RequestBody SalesReports salesReports) {
        return repository.save(salesReports);
    }

    @DeleteMapping("/SalesReports")
    public void delete(@RequestBody SalesReports salesReports) {
        repository.delete(salesReports);
    }

    @GetMapping("/SalesReports/{id}")
    public Optional<SalesReports> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/SalesReports/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/SalesReports/{company}")
    public Optional<SalesReports> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/SalesReports/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   