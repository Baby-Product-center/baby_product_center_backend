package com.example.madhuni.demo.repository;

import com.example.madhuni.demo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order,Integer> {
//    @Query(value="update orders set delivery_status="delivered" where order_id=:oid";,nativeQuery = true);
//    void updateDelveryStatus(int oid);

}
