package fi.vamk.e1900320.northwind;

import org.springframework.data.repository.CrudRepository;

import fi.vamk.e1900320.northwind.entity.Products;

public interface ProductsRepository extends CrudRepository<Products, Integer> {

}