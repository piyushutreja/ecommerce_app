package com.ames.ecommerce.selleraccountservice.dao.sql;

import com.ames.ecommerce.selleraccountservice.entity.sql.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerInfoRepository extends JpaRepository<SellerInfo, Integer> {
}
