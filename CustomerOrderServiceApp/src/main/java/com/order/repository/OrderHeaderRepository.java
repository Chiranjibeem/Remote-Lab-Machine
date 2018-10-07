package com.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.entity.TranHeader;

public interface OrderHeaderRepository extends JpaRepository<TranHeader, String>{

}
