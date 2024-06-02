package com.ames.ecommerce.commondataservice.service.interfaces;

import com.ames.ecommerce.commondataservice.dto.ProductInfoDTO;
import com.ames.ecommerce.commondataservice.entity.sql.info.ProductInfo;
import com.ames.ecommerce.commondataservice.model.FilterAttributesResponse;
import com.ames.ecommerce.commondataservice.model.HomeTabsDataResponse;
import com.ames.ecommerce.commondataservice.model.MainScreenResponse;
import com.ames.ecommerce.commondataservice.model.SearchSuggestionResponse;

import java.util.HashMap;

public interface CommonDataService {

    MainScreenResponse getHomeScreenData(String apiName);

    FilterAttributesResponse getFilterAttributesByProducts(String queryParams);

    ProductInfoDTO getProductsByCategories(String queryParams);

    HashMap<Integer, ProductInfo> getProductsById(String queryParams);

    HomeTabsDataResponse getBrandsAndApparelsByGender(String apiName);

    SearchSuggestionResponse getSearchSuggestionList();
}

