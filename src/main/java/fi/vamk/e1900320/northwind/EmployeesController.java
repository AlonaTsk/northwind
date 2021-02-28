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

import fi.vamk.e1900320.northwind.entity.Employees;

@RestController
public class EmployeesController {
    // we need repository to provide dataabse access
    @Autowired
    EmployeesRepository repository;

    @GetMapping("/Employees/")
    public Iterable<Employees> getEmployees() {
        return repository.findAll();
    }

    

    @PostMapping("/Employees")
    public Employees create(@RequestBody Employees employees) {
        return repository.save(employees);
    }

    @PutMapping("/Employees")
    public Employees update(@RequestBody Employees employees) {
        return repository.save(employees);
    }

    @DeleteMapping("/Employees")
    public void delete(@RequestBody Employees employees) {
        repository.delete(employees);
    }

    @GetMapping("/Employees/{id}")
    public Optional<Employees> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/Employees/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
    /*@GetMapping("/Employees/{company}")
    public Optional<Employees> getItem(@PathVariable("company") String company) {
        return repository.findByCompany(company);
    }
    
    @DeleteMapping(value = "/Employees/{company}")
    public void deleteById(@PathVariable("company") String company) {
        repository.deleteById(company);
    }*/

   

