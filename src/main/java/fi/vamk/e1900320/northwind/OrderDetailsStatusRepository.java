package fi.vamk.e1900320.northwind;

import org.springframework.data.repository.CrudRepository;

import fi.vamk.e1900320.northwind.entity.OrderDetailsStatus;

public interface OrderDetailsStatusRepository extends CrudRepository<OrderDetailsStatus, Integer> {

}