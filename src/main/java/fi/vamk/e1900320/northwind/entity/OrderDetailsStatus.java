package fi.vamk.e1900320.northwind.entity;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "fi.vamk.e1900320.northwind.entity.OrderDetailsStatus")
@Table(name = "order_details_status")
public class OrderDetailsStatus {

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"status_name\"", nullable = false)
  private String statusName;
}