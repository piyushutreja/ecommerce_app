package com.ames.ecommerce.selleraccountservice.service;


import com.ames.ecommerce.selleraccountservice.entity.nosql.SellerBulkInfo;
import com.ames.ecommerce.selleraccountservice.entity.sql.SellerInfo;

public interface SellerAccountDataService {

    public SellerInfo findSellerById(Integer sellerId);

    public void save();

    public void saveInMongo();

    public SellerBulkInfo findMongoAddressById();
}

