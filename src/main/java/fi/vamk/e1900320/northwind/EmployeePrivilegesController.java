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

import fi.vamk.e1900320.northwind.entity.EmployeePrivileges;

@RestController
public class EmployeePrivilegesController {
    // we need repository to provide dataabse access
    @Autowired
    EmployeePrivilegesRepository repository;

    @GetMapping("/EmployeePrivileges/")
    public Iterable<EmployeePrivileges> getEmployeePrivileges() {
        return repository.findAll();
    }


    @PostMapping("/EmployeePrivileges")
    public EmployeePrivileges create(@RequestBody EmployeePrivileges employeePrivileges) {
        return repository.save(employeePrivileges);
    }

    @PutMapping("/EmployeePrivileges")
    public EmployeePrivileges update(@RequestBody EmployeePrivileges employeePrivileges) {
        return repository.save(employeePrivileges);
    }

    @DeleteMapping("/EmployeePrivileges")
    public void delete(@RequestBody EmployeePrivileges employeePrivileges) {
        repository.delete(employeePrivileges);
    }

    @GetMapping("/EmployeePrivileges/{id}")
    public Optional<EmployeePrivileges> getItem(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @DeleteMapping(value = "/EmployeePrivileges/{id}")
    public void deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
