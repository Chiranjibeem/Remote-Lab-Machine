
package com.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.entity.TranItem;
import com.order.entity.TranItemPk;

public interface OrderLineRepository extends JpaRepository<TranItem, TranItemPk> {

}
